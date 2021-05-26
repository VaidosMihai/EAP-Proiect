package com.company;

import Write_Files.Write_Audit;

import java.util.Scanner;

public class Client {
    private String first_name;
    private String last_name;
    private int age;

    public Client(String first_name, String last_name, int age) {
        Write_Audit.writeAudit("New Client");
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public Client(int x) {
    }

    public Client() {
        Scanner in = new Scanner(System.in);
        System.out.println("First Name: ");
        this.first_name = in.nextLine();
        System.out.println("Last Name:");
        this.last_name = in.nextLine();
        System.out.println("Age:");
        this.age = Integer.parseInt(in.nextLine());

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return first_name + " " + last_name;
    }

    public int getAge() {
        return age;
    }
}
