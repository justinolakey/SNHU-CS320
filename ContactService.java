package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactService {
	
	// number assigned to a new Contact
	int newIdNumber = 0;
	
	// list to hold the Contacts
	public List<Contact> contactList = new ArrayList<Contact>();
	
	/**
	 * Adds a new Contact to the contactList using a new id number
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 */
	public void addContact(String firstName, String lastName, String phone, String address) {
		String id = Integer.toString(newIdNumber);
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		contactList.add(contact);
		System.out.println("Added Contact: " + contact.toString());
		newIdNumber++;
	}
	
	/**
	 * Deletes a Contact from the contactList based off of contactId
	 * @param id
	 */
	public void deleteContact(String id) {
		Iterator<Contact> iterator = contactList.iterator();
		while (iterator.hasNext()) {
			Contact contact = iterator.next();
			if (contact.getContactId().equals(id)) {
				iterator.remove();
			}
			System.out.println("Removed Contact: " + contact.toString());
		}
	}
	
	/**
	 * Edits a Contact's firstName based off of contactId
	 * @param id
	 * @param firstName
	 */
	public void editFirstName(String id, String firstName) {
		for (Contact contact : contactList) {
			if (contact.getContactId().equals(id)) {
				contact.setFirstName(firstName);
			}
		}
	}
	
	/**
	 * Edits a Contact's lastName based off of contactId
	 * @param id
	 * @param lastName
	 */
	public void editLastName(String id, String lastName) {
		for (Contact contact : contactList) {
			if (contact.getContactId().equals(id)) {
				contact.setLastName(lastName);
			}
		}
	}
	
	/**
	 * Edits a Contact's phone based off of contactId
	 * @param id
	 * @param phone
	 */
	public void editPhone(String id, String phone) {
		for (Contact contact : contactList) {
			if (contact.getContactId().equals(id)) {
				contact.setPhone(phone);
			}
		}
	}
	
	/**
	 * Edits a Contact's address based off of contactId
	 * @param id
	 * @param address
	 */
	public void editAddress(String id, String address) {
		for (Contact contact : contactList) {
			if (contact.getContactId().equals(id)) {
				contact.setAddress(address);
			}
		}
	}

}
