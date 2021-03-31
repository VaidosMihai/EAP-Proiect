package com.company;

public class Client {
    private String first_name;
    private String last_name;
    private int age;

    public Client(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        System.out.println("Nume: " + first_name + " Prenume: " + last_name + " Varsta: " + age);
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }
}
