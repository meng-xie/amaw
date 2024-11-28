package org.example.amaw.model;


import javax.persistence.*;

@Entity
@Table(name = "myuser")
public class User {
    @Id
    @Column(name="userId", nullable = false, unique = true)
    private Integer userId;
    @Column(name="userName")
    private String userName;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;

    public User(){
        super();
    }

    // getters, setters and constructor

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}