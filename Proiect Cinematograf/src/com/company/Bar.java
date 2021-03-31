package com.company;

import java.util.Queue;

public class Bar {
    private Queue<Comanda> orders;
    private float juice_container[];

    public Bar() {
        juice_container = new float[3]; //cola, fanta, sprite for ex.. and the values are indicating how much juice is left
    }

    public void add_orders(Comanda... values) {
        for (Comanda i : values)
            orders.add(i);
    }

    public Queue<Comanda> get_orders() {
        return orders;
    }
}
