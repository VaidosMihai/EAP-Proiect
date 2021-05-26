package com.company;

import Write_Files.Write_Audit;

import java.util.*;

public class Cinema implements CinemaService {
    private List<Camera> hall;
    private Set<Client> client_list;
    private String Cinema_name;
    private int max_capacity;
    private int nr_of_rooms;
    public Cinema(String Name) {
        Write_Audit.writeAudit("New Cinema");
        Cinema_name = Name;
        hall = new LinkedList<>();
        client_list = new HashSet<>();
        max_capacity = 0;
        nr_of_rooms = 0;
    }
    public Cinema(){
        Scanner in = new Scanner(System.in);
        System.out.println("Cinema Name: ");
        this.Cinema_name = in.nextLine();
    }
    public Cinema(int x){}
    public void setCinemaName(String name){
        this.Cinema_name=name;
    }
    @Override
    public void add_new_room(Camera room) {
        hall.add(room);
        nr_of_rooms++;
        max_capacity += room.getCapacity();
    }

    @Override
    public void add_new_client(Client client) {
        Write_Audit.writeAudit("Client added to cinema "+getCinema_name());
        client_list.add(client);
        System.out.println("Welcome to " + getCinema_name() + "! " + client.getFullName());
    }

    public String getCinema_name() {
        return Cinema_name;
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
    public void Print() {
        Write_Audit.writeAudit("Print cinema info");
        System.out.println("Cinema "+getCinema_name()+" has " + getNr_of_rooms() + " rooms and maximum capacity is  " + getMax_capacity() + " of people.");
    }

    @Override
    public void removeClient(Client client) {
        client_list.remove(client);
        System.out.println("Client " + client.getFullName() + " left the cinema "+getCinema_name()+" .");
    }
}
