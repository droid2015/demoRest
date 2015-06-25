package firstSteps;

import firstSteps.Shared.Address;
import firstSteps.Shared.Contact;
import firstSteps.Shared.ContactResource;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Created by CNPM on 6/25/15.
 */
public class HelloWorldResource extends ServerResource {
    @Get
    public String represent() {
        /*Contact contact = new Contact("Scott", "Tiger",
                new Address("10 bd Google", null, "20010", "Mountain View","USA"),
                40);
        return contact;*/
        return "aaaa";
    }
}
