package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Bar {
    private Queue <Comanda> orders;

    public Bar() {
        this.orders=new Queue<Comanda>() {
            @Override
            public boolean add(Comanda comanda) {
                return false;
            }

            @Override
            public boolean offer(Comanda comanda) {
                return false;
            }

            @Override
            public Comanda remove() {
                return null;
            }

            @Override
            public Comanda poll() {
                return null;
            }

            @Override
            public Comanda element() {
                return null;
            }

            @Override
            public Comanda peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Comanda> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Comanda> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

    public void add_orders(Comanda comanda) {
        orders.add(comanda);
    }

    public Queue<Comanda> getOrders() {
        return orders;
    }
}
