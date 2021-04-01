package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Cinema {
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

    public void add_new_room(Camera room) {
        hall.add(room);
        nr_of_rooms++;
    }

    public void add_new_client(Client client) {
        client_list.add(client);
        System.out.println("Bun venit in cinema! "+client.getFullName());
    }

    //getters
    public List<Camera> getHall() {
        return hall;
    }

    public Set<Client> getClient_list() {
        return client_list;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public int getNr_of_rooms() {
        return nr_of_rooms;
    }

    public void removeClient(Client client)
    {
        client_list.remove(client);
        System.out.println("Clientul "+client.getFullName()+" a plecat de la cinema.");
    }
}
