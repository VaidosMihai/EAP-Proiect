package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Cinema implements CinemaService {
    private List<Camera> hall;
    private Set<Client> client_list;
    private int max_capacity;
    private int nr_of_rooms;

    public Cinema() {
        hall = new LinkedList<Camera>();
        client_list = new HashSet<Client>();
        max_capacity = 0;
        nr_of_rooms = 0;
    }

    @Override
    public void add_new_room(Camera room) {
        hall.add(room);
        nr_of_rooms++;
        max_capacity+=room.getCapacity();
    }

    @Override
    public void add_new_client(Client client) {
        client_list.add(client);
        System.out.println("Bun venit in cinema! "+client.getFullName());
    }

    //getters
    @Override
    public List<Camera> getHall() {
        return hall;
    }

    @Override
    public Set<Client> getClient_list() {
        return client_list;
    }

    @Override
    public int getMax_capacity() {
        return max_capacity;
    }

    @Override
    public int getNr_of_rooms() {
        return nr_of_rooms;
    }

    @Override
    public void Print()
    {
        System.out.println("Acest cinematograf are "+getNr_of_rooms()+" camere si capacitatea maxima este "+getMax_capacity()+" de persoane.");
    }

    @Override
    public void removeClient(Client client)
    {
        client_list.remove(client);
        System.out.println("Clientul "+client.getFullName()+" a plecat de la cinema.");
    }
}
