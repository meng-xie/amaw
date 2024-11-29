package org.example.amaw.model;


import javax.persistence.*;

@Entity
@Table(name = "myuser")
public class User {
    @Id
    @Column(name="userid", nullable = false, unique = true)
    private String userId;
    @Column(name="username")
    private String userName;
    @Column(name="cellphone")
    private String cellphone;
    @Column(name="email")
    private String email;
    @Column(name="passwords")
    private String passwords;

    public User(){
        super();
    }

    // getters, setters and constructor

    public String getUserId() {
        return userId;
    }

   public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
}