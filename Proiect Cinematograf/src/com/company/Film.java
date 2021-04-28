package com.company;


import Write_Files.Write_Audit;

public class Film {
    private final String name;
    private final int age_required;
    private final String start_time;
    private float price;

    public Film(String name, int age_required, String start_time, float price) {
        Write_Audit.writeAudit("New Movie");
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
