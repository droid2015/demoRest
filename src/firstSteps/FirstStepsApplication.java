package firstSteps;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

/**
 * Created by CNPM on 6/25/15.
 */
public class FirstStepsApplication extends Application {
    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
        router.attachDefault(HelloWorldResource.class);
        //Them 1 class
        //router.attachDefault(new Directory(getContext(), "war:///"));
        router.attach("/contact", ContactServerResource.class);

        return router;
    }
}
