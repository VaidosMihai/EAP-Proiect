package com.company;

import java.util.Date;

public class Bilet {

    private int id;
    private Film movie;
    private Client client;
    private LocOcupat occupied_seat;
    private String sell_date;
    private static int numbertickets = 0;

    protected String key_code;
    protected float price;

    public Bilet(Film movie, Client client, LocOcupat occupied_seat) {

        id = ++numbertickets;
        this.movie = movie;
        this.client = client;
        this.occupied_seat = occupied_seat;

        if (client.getAge() != 0) {
            if (client.getAge() <= 14) price = (float) (price - price * 0.5);  //PRET BILET PENTRU COPII
            if (client.getAge() > 14 && client.getAge() < 18)
                price = (float) (price - price * 0.25); //PRET BILET PENTRU ADOLESCENTI
            if (client.getAge() < 18 && client.getAge() < 60) price = price; //PRET BILET ADULTI
            if (client.getAge() >= 60) price = (float) (price - price * 0.5); //PRET BILET PENSIONARI
        }

        key_code = "#" + id + "|" + movie.getName().toUpperCase().substring(0, 3) + "|";
        key_code += String.valueOf(occupied_seat.getRoom()) + "/" + String.valueOf(occupied_seat.getRow()) + String.valueOf(occupied_seat.getColumn());

    }

    public Film getMovie() {
        return movie;
    }

    public Client getClient() {
        return client;
    }

    public LocOcupat getLocOcupat() {
        return occupied_seat;
    }

    public String getSell_date() {
        return sell_date;
    }

    public float getPrice() {
        return price;
    }

    public String getKey_code() {
        return key_code;
    }

    public static void setNumbertickets(int numbertickets) {
        Bilet.numbertickets = numbertickets;
    }

    public static int getNumbertickets() {
        return numbertickets;
    }
}
