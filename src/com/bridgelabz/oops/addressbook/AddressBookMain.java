package com.bridgelabz.oops.addressbook;

public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook addressBook1 = new AddressBook();

        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getPhoneNumber());
        System.out.println(addressBook1.contact.getEmail());

        addressBook1.addContact();
        System.out.println();

        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getPhoneNumber());
        System.out.println(addressBook1.contact.getEmail());

        addressBook1.editContact();

        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getPhoneNumber());
        System.out.println(addressBook1.contact.getEmail());

        addressBook1.deleteContact();

        System.out.println(addressBook1.contact.getFirstName());
        System.out.println(addressBook1.contact.getLastName());
        System.out.println(addressBook1.contact.getPhoneNumber());
        System.out.println(addressBook1.contact.getEmail());

//        AddressBook addressBook2 = new AddressBook();

    }
}
