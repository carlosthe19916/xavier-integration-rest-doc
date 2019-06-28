package org.jboss.xavier.integrations.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/upload")
@Api(value = "Upload resource", description = "Upload REST API", tags = "upload")
@Produces(MediaType.APPLICATION_JSON)
public interface UploadResource {

	@POST
	@Consumes("multipart/form-data")
	@ApiOperation(value = "Upload a file in FormData",
			notes = "Returns the time as a string"
	)
	void uploadFile(MultipartFormDataInput input);

}
