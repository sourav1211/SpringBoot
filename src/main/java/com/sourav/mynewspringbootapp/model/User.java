package com.sourav.mynewspringbootapp.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_info")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    @Email(message = "Not a valid email.")
    @NotEmpty(message = "Required a valid data.")
    private String email;

    @Column(name = "password")
    @Length(min = 3,message = "Minimum 3 characters required")
    private String password;

    @Column(name = "customer_name")
    @NotNull
    private String name;
    @Column(name = "is_active")
    private int isActive;

    public User(@Email(message = "Not a valid email.") @NotEmpty(message = "Required a valid data.") String email, @Length(min = 3, message = "Minimum 3 characters required") String password, @NotNull String name, int isActive) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.isActive = isActive;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}
