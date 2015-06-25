package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Created by CNPM on 6/25/15.
 */
public class HelloWorldResource extends ServerResource {
    @Get
    public String represent() {
        return "hello, world (from the cloud!). Xin tra kieu json";
    }
}
