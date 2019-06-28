package org.jboss.xavier.integrations;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jboss.xavier.integrations.models.InitialSavingEstimation;
import org.jboss.xavier.integrations.models.Report;
import org.jboss.xavier.integrations.models.WorkloadInventory;
import org.jboss.xavier.integrations.models.WorkloadMigrationSummary;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/report")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "Report resource", description = "Report REST API", tags = "report", consumes = "application/json")
public interface ReportResource {

	@GET
	@ApiOperation(value = "Get reports",
			notes = "Returns a list of reports"
	)
	List<Report> getReports(
			@QueryParam("filterText") @DefaultValue("") String filterText,
			@QueryParam("page") @DefaultValue("1") int page,
			@QueryParam("limit") @DefaultValue("10") int limit
	);

	@GET
	@Path("/{reportId}")
	@ApiOperation(value = "Get report",
			notes = "Returns a report which ID is reportId",
			response = Report.class
	)
	Report getReportById(
			@PathParam("reportId") Long id
	);

	@DELETE
	@Path("/{reportId}")
	@ApiOperation(value = "Delete report",
			notes = "Delete a report"
	)
	void deleteReport(
			@PathParam("reportId") Long id
	);

	@GET
	@Path("/{reportId}/workload-migration-summary")
	@ApiOperation(value = "Get report",
			response = WorkloadMigrationSummary.class
	)
	WorkloadMigrationSummary getReportWorkloadMigrationSummary(
			@PathParam("reportId") Long id
	);

	@GET
	@Path("/{reportId}/initial-saving-estimation")
	@ApiOperation(value = "Get report",
			response = InitialSavingEstimation.class
	)
	InitialSavingEstimation getReportInitialSavingEstimation(
			@PathParam("reportId") Long id
	);

	@GET
	@Path("/{reportId}/workload-inventory")
	@ApiOperation(value = "Get report",
			response = WorkloadInventory.class
	)
	WorkloadInventory getWorkloadInventory(
			@PathParam("reportId") Long id
	);
}
