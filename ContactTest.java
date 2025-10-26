package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Contact;

public class ContactTest {
	
	Contact testContact = new Contact("0", "Justin", "Lakey", "1234567890", "101 Fake Street, Capitol City");
	
	@DisplayName("Test Contact constructor with good data")
	@Test
	public void should_CreateNewContact_When_CorrectContactInfo() {
		String contactId = "1";
		String firstName = "Justin";
		String lastName = "Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City";
		
		Contact contact = new Contact(contactId, firstName, lastName, phone, address);
		
		assertEquals("1", contact.getContactId());
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phone, contact.getPhone());
		assertEquals(address, contact.getAddress());
	}
	
	@DisplayName("Test Contact constructor with bad contactId")
	@Test
	public void should_ThrowIllegalArgumentException_When_IncorrectContactIdInContactConstructor() {
		String contactId = "12345678901";
		String firstName = "Justin";
		String lastName = "Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test Contact constructor with bad firstName")
	@Test
	public void should_ThrowIllegalArgumentException_When_IncorrectFirstNameInContactConstructor() {
		String contactId = "1";
		String firstName = "Justin Lakey";
		String lastName = "Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test Contact constructor with bad lastName")
	@Test
	public void should_ThrowIllegalArgumentException_When_IncorrectLastNameInContactConstructor() {
		String contactId = "1";
		String firstName = "Justin";
		String lastName = "Justin Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test Contact constructor with bad phone")
	@Test
	public void should_ThrowIllegalArgumentException_When_IncorrectPhoneInContactConstructor() {
		String contactId = "1";
		String firstName = "Justin";
		String lastName = "Lakey";
		String phone = "123456789";
		String address = "101 Fake Street, Capitol City";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test Contact constructor with bad address")
	@Test
	public void should_ThrowIllegalArgumentException_When_IncorrectAddressInContactConstructor() {
		String contactId = "1";
		String firstName = "Justin";
		String lastName = "Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City, Mississippi";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test Contact constructor with bad contactId")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenBadContactId() {
		String contactId = "12345678901";
		String firstName = "Justin";
		String lastName = "Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test Contact constructor with null contactId")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenNullContactId() {
		String contactId = null;
		String firstName = "Justin";
		String lastName = "Lakey";
		String phone = "1234567890";
		String address = "101 Fake Street, Capitol City";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phone, address);
        });
	}
	
	@DisplayName("Test getContactId with good contactId")
	@Test
	public void should_ReturnContactId_When_GivenGoodContactId() {
        assertEquals("0", testContact.getContactId());
	}
	
	@DisplayName("Test setFirstName with good firstName")
	@Test
	public void should_ReturnFirstName_When_GivenGoodFirstName() {
        String testFirstName = "John";
        testContact.setFirstName(testFirstName);
        assertEquals(testFirstName, testContact.getFirstName());
	}
	
	@DisplayName("Test setFirstName with too long firstName")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenTooLongFirstName() {
		String testFirstName = "Justin Lakey";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName(testFirstName);;
        });
	}
	
	@DisplayName("Test setFirstName with null firstName")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenNullFirstName() {
		String testFirstName = null;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName(testFirstName);;
        });
	}
	
	@DisplayName("Test setLastName with good lastName")
	@Test
	public void should_ReturnLastName_When_GivenGoodLastName() {
        String testLastName = "Smith";
        testContact.setLastName(testLastName);
        assertEquals(testLastName, testContact.getLastName());
	}
	
	@DisplayName("Test setLastName with too long lastName")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenTooLongLastName() {
		String testLastName = "Justin Lakey";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName(testLastName);;
        });
	}
	
	@DisplayName("Test setLastName with null lastName")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenNullLastName() {
		String testLastName = null;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName(testLastName);;
        });
	}
	
	@DisplayName("Test setPhone with good phone")
	@Test
	public void should_ReturnPhone_When_GivenGoodPhone() {
        String testPhone = "1234567891";
        testContact.setPhone(testPhone);
        assertEquals(testPhone, testContact.getPhone());
	}
	
	@DisplayName("Test setPhone with too long phone")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenTooLongPhone() {
        String testPhone = "12345678901";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone(testPhone);;
        });
	}
	
	@DisplayName("Test setPhone with too short phone")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenTooShortPhone() {
        String testPhone = "123456789";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone(testPhone);;
        });
	}
	
	@DisplayName("Test setPhone with null phone")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenNullPhone() {
		String testPhone = null;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhone(testPhone);;
        });
	}
	
	@DisplayName("Test setAddress with good address")
	@Test
	public void should_ReturnLastName_When_GivenGoodAddress() {
        String testAddress = "102 Fake Rode, Big City";
        testContact.setAddress(testAddress);
        assertEquals(testAddress, testContact.getAddress());
	}
	
	@DisplayName("Test setAddress with too long address")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenTooLongAddress() {
		String testAddress = "101 Fake Street, Capitol City, Mississippi";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setAddress(testAddress);;
        });
	}
	
	@DisplayName("Test setAddress with null address")
	@Test
	public void should_ThrowIllegalArgumentException_When_GivenNullAddress() {
		String testAddress = null;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setAddress(testAddress);;
        });
	}


}
