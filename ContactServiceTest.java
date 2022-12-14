package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	//Test adding new contact
	@Test
	public void testMethodAddPass() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("300", "Bob", "Hall", "1234567890", "abc sdd st");
	Contact c2 = new Contact("301", "Bill", "Riely", "1234567890", "abc sdd st");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c2));
	}

	//Test can't add present contacts
	@Test
	public void testMethodAddFail() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("300", "Bob", "Hall", "1234567890", "abc sdd st");
	Contact c2 = new Contact("301", "Bill", "Riely", "1234567890", "abc sdd st");
	assertEquals(true, cs.add(c1));
	assertEquals(false, cs.add(c1));
	assertEquals(true, cs.add(c2));
	}

	//Test deleting contacts
	@Test
	public void testMethodDeletePass() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("300", "Bob", "Hall", "1234567890", "abc sdd st");
	Contact c2 = new Contact("301", "Bill", "Riely", "1234567890", "abc sdd st");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c2));

	assertEquals(true, cs.remove("300"));
	assertEquals(true, cs.remove("301"));
	}

	//Test contacts not present can not be deleted
	@Test
	public void testMethodDeleteFail() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("300", "Bob", "Hall", "1234567890", "abc sdd st");
	Contact c2 = new Contact("301", "Bill", "Riely", "1234567890", "abc sdd st");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c2));

	assertEquals(false, cs.remove("303"));
	assertEquals(true, cs.remove("301"));
	}

	//Test contacts can be updated
	@Test
	public void testUpdatePass() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("300", "Bob", "Hall", "1234567890", "abc sdd st");
	Contact c2 = new Contact("301", "Bill", "Riely", "1234567890", "abc sdd st");
	
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c2));

	assertEquals(true, cs.update("300", "Billy", "Bob", "", "123 abc st"));
	assertEquals(true, cs.update("301", "Bobby", "Bill", "", "123 abc st"));
	}

	//Test contacts must be present to update
	@Test
	public void testUpdateFail() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("300", "Bob", "Hall", "1234567890", "abc sdd st");
	Contact c2 = new Contact("301", "Bill", "Riely", "1234567890", "abc sdd st");
	
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c2));

	assertEquals(false, cs.update("303", "Billy", "Bob", "", "123 abc st"));
	assertEquals(true, cs.update("301", "Bobby", "Bill", "", "123 abc st"));
	}

	}