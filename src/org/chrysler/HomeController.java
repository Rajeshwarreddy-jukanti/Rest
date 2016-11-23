package org.chrysler;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/api")
public class HomeController {
	
	@GET
	@Path("/{input}")
	public Response getCRMInfo(@PathParam("input") String input){
		System.out.println("Hello James Bond..  :-)");
		System.out.println(input);
		return Response.ok().entity("Hello Mr. "+input+"..   Have a good day :-)").build();
	}
	
	public HomeController(){
		System.out.println("HelloController class created");
	}
}
