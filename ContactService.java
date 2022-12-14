package contact;
import java.util.ArrayList;
import contact.Contact;

public class ContactService {
	private ArrayList<Contact> contacts;

	// default constructor 
	public ContactService() {
	contacts = new ArrayList<>();
	}

	// add a contact to list if it is not already present
	public boolean add(Contact contact) {
	// determine if contact is present 
		boolean alreadyPresent = false;
		for (Contact c : contacts) {
				if (c.equals(contact)) {
					alreadyPresent = true;
				}
		}
	// if the contact is not present, add it, and return true 
		if (!alreadyPresent) {
			contacts.add(contact);
			return true;
		} else {
			return false;
		}
	}

	// remove a contact with the given id number if it is present in list 
	public boolean remove(String id) {
		for (Contact c : contacts) {
			if (c.getId().equals(id)) {
				contacts.remove(c);
				return true;
			}
		}
		return false;
	}

	/* update contact if contact id is correct. Updates can be performed 
	 * on any field, pass empty string to remain unchanged
	*/
	public boolean update(String contactID, String firstName, String lastName, String phoneNum, String address) {
		for (Contact c : contacts) {
			if (c.getId().equals(contactID)) {
				if (!firstName.equals(""))
					c.setFirstName(firstName);
				if (!lastName.equals(""))
					c.setLastName(lastName);
				if (!phoneNum.equals(""))
					c.setPhoneNum(phoneNum);
				if (!address.equals(""))
					c.setAddress(address);
				return true;
			}
		}
		return false;
	}
}