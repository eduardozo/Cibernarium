package com.generics;

public class Main {

    public static void main(String[] args) {

        Person<Employee> employeePerson = new Person<>();
        Person<Contact> contactPerson = new Person<>();

        Employee e = new Employee("Nicolas", "Tesla", "121212");
        Contact c = new Contact("Mr.", "John", "Dalton", "222-333-44444");

        employeePerson.setPerson(e);
        contactPerson.setPerson(c);

        System.out.println(employeePerson.getPerson());
        System.out.println(contactPerson.getPerson());
    }
}
