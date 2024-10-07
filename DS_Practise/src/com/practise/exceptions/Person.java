package com.practise.exceptions;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        Person cloned = (Person) super.clone();
        // Perform a deep copy by cloning mutable fields
        cloned.address = (Address) address.clone();
        return cloned;
    }

    // Getters and toString for demonstration
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // Address class that supports cloning
    public static class Address implements Cloneable {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    // Example usage
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St", "New York");
        Person person1 = new Person("Alice", 30, address);

        // Clone person1
        Person person2 = (Person) person1.clone();

        // Modify the original address
        address.street = "456 Elm St";

        // person2 should have an independent address copy
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}

