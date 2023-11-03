package com.blog.binding;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 6, max = 39, message = "Name must be between 6 and 39 characters.")
    private String name;

    @NotEmpty
    @Size(min = 6, max = 39, message = "Designation must be between 6 and 39 characters.")
    private String designation;

    @NotEmpty
    @Size(min = 6, max = 39, message = "Email must be between 6 and 39 characters.")
    private String email;

    @NotNull
    @Size(min = 10, max = 10, message = "Emergency Contact Number must be exactly 10 digits.")
    private Integer emergencyContactNum;

    // Constructors, getters, and setters can be added here

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String designation, String email, Integer emergencyContactNum) {
        this.name = name;
        this.designation = designation;
        this.email = email;
        this.emergencyContactNum = emergencyContactNum;
    }

    // Getters and setters for the fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmergencyContactNum() {
        return emergencyContactNum;
    }

    public void setEmergencyContactNum(Integer emergencyContactNum) {
        this.emergencyContactNum = emergencyContactNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", emergencyContactNum=" + emergencyContactNum +
                '}';
    }
}
