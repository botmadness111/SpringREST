package org.example.DTO;

import jakarta.validation.constraints.Min;

public class PersonDTO {
    @Min(value = 14, message = "age should be greater then 14")
    private int age;
    private String name;

    public PersonDTO() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
