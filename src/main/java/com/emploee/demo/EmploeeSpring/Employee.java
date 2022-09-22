package com.emploee.demo.EmploeeSpring;


import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastFamily;

    public Employee(String firstName, String lastFamily) {
        this.firstName = firstName;
        this.lastFamily = lastFamily;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastFamily() {
        return lastFamily;
    }


    @Override
    public String toString() {
        return "имя : " + firstName + "\nфамилия : " + lastFamily + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastFamily.equals(employee.lastFamily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastFamily);
    }
}




