package ca.uqam.info.inf600g.services;

import ca.uqam.info.inf600g.data.ThemeCollection;
import ca.uqam.info.inf600g.model.Theme;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.Optional;
import java.util.Set;

@Path("/themes")
@Tag(name="Quiz Theme Management")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ThemeService {


    @GET
    @ApiResponse(
            responseCode = "200",
            content = @Content(mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = Theme.class))),
            description = "List of all available themes")
    public Set<Theme> getAllThemes() {
        return ThemeCollection.getAccess().getAllThemes();
    }

    @GET
    @Path("/{label}")
    @ApiResponse(
            responseCode = "200",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Theme.class)),
            description = "Find a theme using its label")
    public Theme getGivenTheme(@PathParam("label") String l) {
        Optional<Theme> value = ThemeCollection.getAccess().findThemeByLabel(l);
        if(value.isEmpty())
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        return value.get();
    }

    @POST
    @ApiResponse(responseCode = "201", description = "Add a new theme in the system")
    public Response addNewTheme(Theme theme,  @Context UriInfo uriInfo) {
        try {
            ThemeCollection.getAccess().registerNewTheme(theme);
            return Response
                    .created(uriInfo.getAbsolutePathBuilder().path(theme.getLabel()).build())
                    .build();
        } catch(IllegalArgumentException iae) {
            throw new WebApplicationException(Response.Status.CONFLICT);
        }
    }

    @PUT
    @Path("/{label}")
    @ApiResponse(
            responseCode = "200",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Theme.class)),
            description = "Update an existing theme with provided values")
    public Theme updateExistingTheme(
            @PathParam("label") String label,
            @QueryParam("description") @DefaultValue("") String description,
            @QueryParam("name") @DefaultValue("") String name) {
        try {
            ThemeCollection.getAccess()
                    .updateTheme(new Theme(label, name, description));
            return ThemeCollection.getAccess()
                    .findThemeByLabel(label).orElseThrow();
        } catch(IllegalArgumentException iae) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
    }

    @DELETE
    @Path("/{label}")
    @ApiResponse(
            responseCode = "204",
            description = "Delete an existing theme")
    public void deleteAGivenTheme(@PathParam("label") String label) {
        try {
            ThemeCollection.getAccess().deleteTheme(label);
        } catch(IllegalArgumentException iae) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
    }

}
