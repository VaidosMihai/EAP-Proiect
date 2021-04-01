package com.company;

import java.util.ArrayList;

public class Comanda {
    private final int id;
    private ArrayList<String> items;
    private int waiting_time = 0;
    private static int numberOrders = 0;

    public Comanda(Client C1,String...values) {
        id = numberOrders++;
        for (String i: values) {
            waiting_time += 2;
            items.add(i);
        }
    }
    public ArrayList<String> getItems() {
        return items;
    }


    public void print_menu_items() {
        for(String i: items)
            System.out.println(i);
    }
}