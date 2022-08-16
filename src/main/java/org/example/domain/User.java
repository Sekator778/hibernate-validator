package org.example.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.example.validation.Age;

import java.time.LocalDate;

@Age(message = "{custom.age.message}")
public class User {

    @Size(min = 2, max = 30, message = "{abc}")
    private final String name;

    @Email(message = "Email must follow the formatter: ***@***")
    @NotBlank(message = "Email must have a value")
    private final String email;

    @Min(value = 18, message = "must be greater or equal to 18")
    @NotNull(message = "{notnull.age}")
    private final Integer age;

    @NotNull(message = "birthday is a required field.")
//    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private final LocalDate birthday;

    @NotBlank(message = "Role must have a value")
    private final String role;

    @Valid
    private Address addr;

    public User(String name, String email, Integer age, LocalDate birthday, String role) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getRole() {
        return role;
    }

    public Address getAddr() {
        return addr;
    }
}