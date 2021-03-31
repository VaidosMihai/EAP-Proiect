package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Cinema {
    private List<Camera> hall;
    private Set<Client> client_list; //we use sets because we don't want any duplicates
    private int max_capacity;
    private int nr_of_rooms;

    public Cinema() {
        hall = new LinkedList<Camera>();
        client_list = new HashSet<Client>();
        max_capacity = 0;
        nr_of_rooms = 0;
    }

    public void add_new_room(int width, int lenght) {
        hall.add(new Camera(width, lenght));
        max_capacity += width * lenght;
        nr_of_rooms++;
    }

    public void add_n_new_rooms(int n, int width, int lenght) { //adds n rooms with w x h seats each
        for (int i = 0; i < n; i++)
            hall.add(new Camera(width, lenght));
        max_capacity += n * width * lenght;
        nr_of_rooms += n;
    }

    public void add_new_client(Client client) {
        client_list.add(client);
    }

    public Bilet reserve_seat(int row, int column, Camera room, Film movie, Client client) {
        if (!room.isOccupied(row, column)) {
            room.getSeats()[row][column] = true;
            Bilet reserved_ticket = new Bilet(movie, client, new LocOcupat(room.getId(), row, column));
            return reserved_ticket;
        } else
            return null;
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
}
