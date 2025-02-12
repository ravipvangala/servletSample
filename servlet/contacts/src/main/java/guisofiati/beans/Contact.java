package guisofiati.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
	
	private String name;
	private String number;
	
	private static List<Contact> contacts = new ArrayList<>();
	
	public Contact() {
		
	}

	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public void addNewContact(Contact contact) {
		contacts.add(contact);
	}
	
	public static void deleteContact(String number) {
		Contact contactToDelete = contacts.stream().filter(contact -> contact.getNumber().equals(number)).findFirst().orElse(null);
		contacts.remove(contactToDelete);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public static List<Contact> getContacts() {
		return contacts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}
}
