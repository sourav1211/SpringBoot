package com.sourav.mynewspringbootapp.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_info")
@Data
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

    @Column(name = "user_name")
    @NotNull
    private String userName;
    @Column(name = "is_active")
    private int isActive;

}
