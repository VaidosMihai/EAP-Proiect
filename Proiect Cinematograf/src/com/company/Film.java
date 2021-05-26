package com.company;


import Write_Files.Write_Audit;

import java.util.Scanner;

public class Film {
    private String name;
    private int age_required;
    private String start_time;
    private float price;

    public Film(String name, int age_required, String start_time, float price) {
        Write_Audit.writeAudit("New Movie");
        this.name = name;
        this.age_required = age_required;
        this.start_time = start_time;
        this.price = price;
    }

    public Film() {
        Scanner in = new Scanner(System.in);
        System.out.println("Movie name: ");
        this.name = in.nextLine();
        System.out.println("Age required:");
        this.age_required = Integer.parseInt(in.nextLine());
        System.out.println("Watching time:");
        this.start_time = in.nextLine();
        System.out.println("Ticket price:");
        this.price = Integer.parseInt(in.nextLine());

    }

    public Film(int x) {
    }

    public String getName() {
        return name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFilm_name(String film_name) {
        this.name = film_name;
    }

    public void setAge_required(int age_required) {
        this.age_required = age_required;
    }

    public int getAge_required() {
        return age_required;
    }

    public float getPrice() {
        return price;
    }
}
