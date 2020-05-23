package ca.uqam.info.inf600g.services;

import ca.uqam.info.inf600g.data.AccountsCollection;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;
import java.util.stream.Collectors;

@Path("/accounts")
@Tag(name="Backend")
@Produces(MediaType.APPLICATION_JSON)
public class AccountService {

    @GET
    @ApiResponse(
            responseCode = "200",
            content = @Content(
                    mediaType = "application/json",
                    array = @ArraySchema(
                            schema = @Schema(implementation = AccountDescription.class)
                    )),
            description = "List of all available accounts")
    public Set<AccountDescription> getAllAccounts() {
        return AccountsCollection.getAccess()
                .getAllAccounts()
                .stream().map(AccountDescription::new)
                .collect(Collectors.toSet());
    }
}
