package ca.uqam.info.inf600g.services;

import ca.uqam.info.inf600g.data.AccountsCollection;
import ca.uqam.info.inf600g.model.Account;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/login")
@Tag(name="Login Management (DEMO ONLY, DO NOT DO THIS AT HOME)")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LoginService {

    @POST
    @ApiResponse(
            responseCode = "200",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Boolean.class)),
            description = "Check is an user can login (DEMO ONLY)")
    public boolean login(LoginRequest info) {
        Optional<Account> acc = AccountsCollection.getAccess().getByIdentifier(info.login);
        if (acc.isEmpty())
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        if(!acc.get().getPassword().equals(info.password))
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        return true;
    }

}
