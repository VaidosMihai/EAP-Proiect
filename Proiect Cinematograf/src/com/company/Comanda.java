package com.company;


public class Comanda {
    private final int id;
    private final String[] items;
    private int waiting_time = 0;
    private static int numberOrders = 0;
    private String juice;

    public Comanda(String[] items) {
        id = ++numberOrders;
        this.items = items;
        waiting_time = items.length * 3;
        if (items.length == 1) juice = "Suc Mic";
        else if (items.length == 2) juice = "Suc Mediu";
        else if (items.length > 2) juice = "Suc Mare";
        print_menu_items();
    }

    public void print_menu_items() {
        System.out.print("Comanda Nr." + this.id + " contine: ");
        for (int i = 0; i < items.length; i++) {
            if (i != items.length - 1) System.out.print(this.items[i] + ", ");
            else System.out.println(this.items[i] + " cu " + juice + ". ");
        }
        System.out.println("Iar timpul de asteptare este de " + waiting_time + " minute.");
    }

    public String getJuice() {
        return juice;
    }
}