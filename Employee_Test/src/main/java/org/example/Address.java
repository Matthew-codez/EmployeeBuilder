package org.example;

public class Address {
    private String street;
    private String streetNumber;
    private String city;
    private String province;

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }
    public String getProvince() {
        return province;
    }

    private Address (Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.province = builder.province;
        this.streetNumber = builder.streetNumber;
    }

    public static class Builder{
        private String street;
        private String city;
        private String province;
        private String streetNumber;

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }
        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }
        public Builder copy(Job job) {
            this.street = street;
            this.city = city;
            this.province = province;
            this.streetNumber = streetNumber;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}
