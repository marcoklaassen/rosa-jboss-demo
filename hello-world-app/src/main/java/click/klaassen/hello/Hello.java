package click.klaassen.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A simple REST service
 *
 * @author mklaasse@redhat.com
 *
 */

@Path("/")
public class Hello {
    

    @GET
    @Path("/hello")
    @Produces({ "text/plain" })
    public String productLogLine() {    
        return "Hello World";
    }

}
