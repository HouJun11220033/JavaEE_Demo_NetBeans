package com.model;

public class User {

    private String username;
    private String password;
    private Address address;
    private String email;
    private int age;
    private String city;
    private String province;

    public User(String username, String password, String email, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }
    

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", address=" + address + ", email=" + email + ", age=" + age+'}';
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

}
