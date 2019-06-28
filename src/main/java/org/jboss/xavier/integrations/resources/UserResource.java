package org.jboss.xavier.integrations.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jboss.xavier.integrations.models.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "User resource", description = "User REST API", tags = "user", consumes = "application/json")
public interface UserResource {

	@GET
	@ApiOperation(value = "Get session user info")
	User getUser();

}
