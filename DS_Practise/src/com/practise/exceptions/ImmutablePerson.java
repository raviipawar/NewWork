package com.practise.exceptions;

public final class ImmutablePerson {

    private final String name;
    private final int age;
    private final Address address;

    // Constructor to initialize the immutable fields
    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Defensive copy to ensure immutability if address is mutable
        this.address = new Address(address.getStreet(), address.getCity());
    }

    // Getter methods that do not allow modification
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a defensive copy for mutable objects
    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity());
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // Sample mutable class Address
    public static class Address {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}

