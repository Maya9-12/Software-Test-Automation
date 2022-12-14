package contact;

public class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phoneNum, String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id.");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		if(phoneNum == null || !(phoneNum.length() == 10)) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		if(address == null || address.length()>10) {
			throw new IllegalArgumentException("Invalid address.");
		}
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum (String phoneNum) {
		this.phoneNum = phoneNum;
		
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress (String address) {
		this.address = address;
		
	}
}
