package main;

public class Contact {

	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	/**
	 * Constructor for Contact
	 * @param contactId
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 */
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {

		validateContactId(contactId);
		validateFirstName(firstName);
		validateLastName(lastName);
		validatePhone(phone);
		validateAddress(address);

		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * @return contactId
	 */
	public String getContactId() {
		return contactId;
	}

	//	public void setContactId(String contactId) {
	//		this.contactId = contactId;
	//	}

	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets firstName after validating input
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		validateFirstName(firstName);
		this.firstName = firstName;
	}

	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets lastName after validating input
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		validateLastName(lastName);
		this.lastName = lastName;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets phone after validating input
	 * @param phone
	 */
	public void setPhone(String phone) {
		validatePhone(phone);
		this.phone = phone;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	// The following methods are used to validate input

	/**
	 * Sets address after validating input
	 * @param address
	 */
	public void setAddress(String address) {
		validateAddress(address);
		this.address = address;
	}

	/**
	 * validates contactId is not greater than 10 characters and is not null
	 * @param contactId
	 */
	private void validateContactId(String contactId) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Contact ID does not meet requirements.");
		}
	}

	/**
	 * validates firstName is not greater than 10 characters and is not null
	 * @param firstName
	 */
	private void validateFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name does not meet requirements.");
		}
	}

	/**
	 * validates lastName is not greater than 10 characters and is not null
	 * @param lastName
	 */
	private void validateLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name does not meet requirements.");
		}
	}

	/**
	 * validates phone is exactly 10 characters and is not null
	 * @param phone
	 */
	private void validatePhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Phone number does not meet requirements.");
		}
	}

	/**
	 * validates address is not greater than 30 characters and is not null
	 * @param address
	 */
	private void validateAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address does not meet requirements.");
		}
	}

}
