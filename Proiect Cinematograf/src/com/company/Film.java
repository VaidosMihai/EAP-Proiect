package com.company;


public class Film {
    private String name;
    private int age_required;
    private String start_time;
    private float price;

    public Film(String name, int age_required, String start_time, float price) {
        this.name = name;
        this.age_required = age_required;
        this.start_time = start_time;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge_required() {
        return age_required;
    }

    public float getPrice() {
        return price;
    }
}
