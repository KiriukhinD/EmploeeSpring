package com.emploee.demo.Emploee1Spring;


public class Employee {
    private final String firstName;
    private final String lastFamily;

    Employee(String firstName, String lastFamily) {
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


}




