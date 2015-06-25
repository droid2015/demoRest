package firstSteps;

import firstSteps.Shared.Address;
import firstSteps.Shared.Contact;
import firstSteps.Shared.ContactResource;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

/**
 * Created by CNPM on 6/25/15.
 */
public class ContactServerResource extends ServerResource implements ContactResource {
    private static volatile Contact contact = new Contact("Scott", "Tiger",
            new Address("10 bd Google", null, "20010", "Mountain View","USA"),
            40);
    @Get
    public Contact retrieve() {
     return contact;
    }

    @Put
    public void store (Contact contact) {
        ContactServerResource.contact = contact;

    }

    @Delete
    public void remove() {

    }
}
