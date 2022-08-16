package org.example.domain;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Student {

    @NotNull(message = "Name cannot be null")
    private String name;

    @AssertTrue
    private boolean working;

    @Size(min = 10, max = 200, message
            = "About Me must be between 10 and 200 characters")
    private String aboutMe;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Email(message = "Email should be valid")
    private String email;

//    List<@NotBlank String> preferences;
//    private LocalDate dateOfBirth;
//
//    public Optional<@Past LocalDate> getDateOfBirth() {
//        return Optional.of(dateOfBirth);
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setPreferences(List<String> preferences) {
//        this.preferences = preferences;
//    }
//
//    public void setDateOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
}