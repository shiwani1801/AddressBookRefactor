package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact() {
        Contact contactPerson = new Contact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of contact person");
        System.out.print("Enter first name:");
        contactPerson.setName(sc.next());
        System.out.print("Enter Last name:");
        contactPerson.setLastName(sc.next());
        System.out.println("Enter the Address : ");
        contactPerson.setAddress(sc.next());
        System.out.println("Enter the City : ");
        contactPerson.setCity(sc.next());
        System.out.println("Enter the State : ");
        contactPerson.setState(sc.next());
        System.out.println("Enter the ZipCode : ");
        contactPerson.setZipCode(sc.next());
        System.out.println("Enter the Mobile no : ");
        contactPerson.setPhoneNo(sc.next());
        contactList.add(contactPerson);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                '}';
    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name:");
        String name = sc.next();
        for (Contact contactPerson : contactList) {
            if (name.equals(contactPerson.getName())) {
                System.out.println("Set Details");
                System.out.print("Enter first name:");
                contactPerson.setName(sc.next());
                System.out.print("Enter Last name:");
                contactPerson.setLastName(sc.next());
                System.out.println("Enter the Address : ");
                contactPerson.setAddress(sc.next());
                System.out.println("Enter the City : ");
                contactPerson.setCity(sc.next());
                System.out.println("Enter the State : ");
                contactPerson.setState(sc.next());
                System.out.println("Enter the ZipCode : ");
                contactPerson.setZipCode(sc.next());
                System.out.println("Enter the Mobile no : ");
                contactPerson.setPhoneNo(sc.next());
                break;
            }
        }


    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name:");
        String name = sc.next();
        for (Contact contactPerson : contactList) {
            if (name.equals(contactPerson.getName())) {
                contactList.remove(contactPerson);
                break;
            }

        }
    }
}
