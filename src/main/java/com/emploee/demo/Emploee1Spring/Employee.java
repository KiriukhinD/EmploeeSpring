package com.emploee.demo.Emploee1Spring;


public class Employee {
    private final String name;
    private final String family;

    Employee(String name, String family) {
        this.name = name;
        this.family = family;
    }
    public String name(){
        return name;
    }
    public String getFamily() {
        return family;
    }


    @Override
    public String toString() {
        return "имя : " + name + "\nфамилия : " + family + "\n";
    }


}




