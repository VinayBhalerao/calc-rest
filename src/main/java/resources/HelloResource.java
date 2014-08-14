package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class HelloResource {
@GET
@Produces(MediaType.APPLICATION_JSON)
public String math(@QueryParam("firstno") double firstno, @QueryParam("secondno") double secondno, @QueryParam("operation") String operation) {
String output = "";

if (operation.equals("add")) {
output = "{ output: " + (firstno + secondno) + " }";
}
else if (operation.equals("subtract")) {
output = "{ output: " + (firstno - secondno) + " }";
}
else if (operation.equals("multiply")) {
output = "{ output: " + (firstno * secondno) + " }";
}
else if (operation.equals("divide")) {
output = "{ output: " + (firstno / secondno) + " }";
}

return output;
}
}
