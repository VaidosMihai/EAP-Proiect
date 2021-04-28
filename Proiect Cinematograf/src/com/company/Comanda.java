package com.company;


import Write_Files.Write_Audit;

public class Comanda {
    private final int id;
    private final String[] items;
    private int waiting_time;
    private static int numberOrders = 0;
    private String juice;

    public Comanda(String[] items) {
        id = ++numberOrders;
        this.items = items;
        waiting_time = items.length * 3;
        if (items.length == 1) juice = "Small Juice ";
        else if (items.length == 2) juice = "Medium Juice ";
        else if (items.length > 2) juice = "Great Juice ";
        print_menu_items();
        Write_Audit.writeAudit("New order ["+getId()+"]");
    }

    public int getId() {
        return id;
    }

    public void print_menu_items() {
        System.out.print("Order Nr." + this.id + " contain: ");
        for (int i = 0; i < items.length; i++) {
            if (i != items.length - 1) System.out.print(this.items[i] + ", ");
            else System.out.println(this.items[i] + " with " + juice + ". ");
        }
        System.out.println("And the waiting time is " + waiting_time + " minutes.");
    }

    public String getJuice() {
        return juice;
    }
}