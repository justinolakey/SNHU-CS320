package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

public class ContactServiceTest {
	
	Contact testContact = new Contact("0", "Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
	ContactService testContactService = new ContactService();
	

		
	@DisplayName("Test addContact")
	@Test
	public void Should_CreateNewContact_When_GoodContactInfo() {
		testContactService.addContact("Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
		
		assertFalse(testContactService.contactList.isEmpty());
		assertEquals(testContact.getContactId(), testContactService.contactList.get(0).getContactId());
		assertEquals(testContact.getFirstName(), testContactService.contactList.get(0).getFirstName());
		assertEquals(testContact.getLastName(), testContactService.contactList.get(0).getLastName());
		assertEquals(testContact.getPhone(), testContactService.contactList.get(0).getPhone());
		assertEquals(testContact.getAddress(), testContactService.contactList.get(0).getAddress());
	}
	
	@DisplayName("Test deleteContact")
	@Test
	public void Should_DeleteContact_When_ValidContactId() {
		testContactService.addContact("Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
		testContactService.addContact("John", "Smith", "1234567891", "102 Fake Street, Capitol Town");
		testContactService.addContact("Jane", "Austen", "1234567892", "103 Fake Street, Capitol Hill");
		
		assertEquals(3, testContactService.contactList.size());
		
		testContactService.deleteContact("2");
		
		assertEquals(2, testContactService.contactList.size());
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			testContactService.contactList.get(2);
        });

	}
	
	@DisplayName("Test editFirstName")
	@Test
	public void Should_EditFirstName_When_GoodFirstName() {
		testContactService.addContact("Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
        String testFirstName = "John";
        testContactService.editFirstName("0", testFirstName);
        assertEquals(testFirstName, testContactService.contactList.get(0).getFirstName());
	}
	
	@DisplayName("Test editLastName")
	@Test
	public void Should_EditLastName_When_GoodLastName() {
		testContactService.addContact("Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
        String testLastName = "Smith";
        testContactService.editLastName("0", testLastName);
        assertEquals(testLastName, testContactService.contactList.get(0).getLastName());
	}
	
	@DisplayName("Test editPhone")
	@Test
	public void Should_EditPhone_When_GoodPhone() {
		testContactService.addContact("Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
        String testPhone= "1234567891";
        testContactService.editPhone("0", testPhone);
        assertEquals(testPhone, testContactService.contactList.get(0).getPhone());
	}
	
	@DisplayName("Test editAddress")
	@Test
	public void Should_EditAddress_When_GoodAddress() {
		testContactService.addContact("Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
        String testAddress = "102 Fake Rode, Big City";
        testContactService.editAddress("0", testAddress);
        assertEquals(testAddress, testContactService.contactList.get(0).getAddress());
	}
	
	
	


}
