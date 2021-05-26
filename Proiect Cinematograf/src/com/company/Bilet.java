package com.company;

import Write_Files.Write_Audit;

import java.util.Scanner;

public class Bilet implements BiletService {

    private int id;
    private Film movie;
    private Client client;
    private Camera room;
    private static int numbertickets = 0;

    protected String key_code;
    protected float price;

    public Bilet(Film movie, Client client, Camera room, int row, int column) {

        if (movie.getAge_required() <= client.getAge()) {
            Write_Audit.writeAudit("Generate new ticket for customer "+client.getFullName());
            id = ++numbertickets;
            this.movie = movie;
            this.client = client;
            this.room = room;
            key_code = client.getFirst_name() + "'s ticket has the code " + "#" + id + "|" + movie.getName().toUpperCase().substring(0, 3) + "|";
            key_code += String.valueOf(room.getId() + "/" + String.valueOf(row) + "-" + String.valueOf(column));
            if (client.getAge() <= 14) {
                price = (float) (movie.getPrice() / 2);
            }//PRET BILET PENTRU COPII
            else if (client.getAge() > 14 && client.getAge() < 18) {
                price = (float) (movie.getPrice() - (movie.getPrice() * 0.25));
            } //PRET BILET PENTRU ADOLESCENTI
            else if (client.getAge() < 18 && client.getAge() < 60) {
                price = movie.getPrice();
            } //PRET BILET ADULTI
            else {
                price = (float) (movie.getPrice() - movie.getPrice() * 0.5);
            } //PRET BILET PENSIONARI
        } else
            System.out.println(client.getFirst_name() + " does not meet the minimum age requirement for this film!");

    }
    /*public Bilet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Filmul dorit: ");
        this.first_name = in.nextLine();
        System.out.println("Last Name:");
        this.last_name = in.nextLine();
        System.out.println("Age:");
        this.age = Integer.parseInt(in.nextLine());

    }*/
    @Override
    public void Print() {
        Write_Audit.writeAudit("Print ticket info");
        System.out.println(client.getFirst_name()+"'s ticket price is " + price +" lei.");
    }


    public Film getMovie() {
        return movie;
    }

    public Client getClient() {
        return client;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String getKey_code() {
        Write_Audit.writeAudit("Print ticket key");
        return key_code;
    }

    public static void setNumbertickets(int numbertickets) {
        Bilet.numbertickets = numbertickets;
    }

    public static int getNumbertickets() {
        return numbertickets;
    }

}
