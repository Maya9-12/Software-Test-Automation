package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contact.Contact;

class ContactTestt {

	@Test
	void TestContact() {
		Contact contact = new Contact("123abc", "Bob", "Hall", "1234567890", "123 adc st");
		assertTrue(contact.getId().equals("123abc"));
		assertTrue(contact.getFirstName().equals("Bob"));
		assertTrue(contact.getLastName().equals("Hall"));
		assertTrue(contact.getPhoneNum().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 adc st"));
	}
	//Test the contact id too long
	@Test
	void contactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc999999", "Bob", "Hall", "1234567890", "123 abc st");
		});
	}
	//Test contact id is null
	@Test
	void contactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Bob", "Hall", "1234567890", "123 abc st");
		});
	}
	//Test first name too long
	@Test
	void firstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bobbbbbbbbbbbbbbb", "Hall", "1234567890", "123 abc st");
		});
	}
	//Tests if a field in contact is null
	@Test
	void firstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", null, "Hall", "1234567890", "123 abc st");
		});
	}
	//Test last name is too long
	@Test
	void lastnameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bob", "Halllllllllllllllllllll", "1234567890", "123 abc st");
		});
	}
	//Test last name is null
	@Test
	void lastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bob", null, "1234567890", "123 abc st");
		});
	}
	//Test phone number is exactly 10 digits
	@Test
	void contactPhoneNum() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bob", "Hall", "123456789", "123 abc st");
		});
	}
	//Test phone number is null
	@Test
	void phoneNumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bob", "Hall", null, "123 abc st");
		});
	}
	//Test address is too long
	@Test
	void contactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bob", "Hall", "1234567890", "123 abc sttttttttttttttttttttttttttttttttttttttttttttttttt");
		});
	}
	//Test address is null
	@Test
	void addressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123abc", "Bob", "Hall", "1234567890", null);
		});
	}
}
