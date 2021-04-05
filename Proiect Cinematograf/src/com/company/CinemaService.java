package com.company;

import java.util.List;
import java.util.Set;

public interface CinemaService {
    void add_new_room(Camera room);

    void add_new_client(Client client);

    //getters
    List<Camera> getHall();

    Set<Client> getClient_list();

    int getMax_capacity();

    int getNr_of_rooms();

    void Print();

    void removeClient(Client client);
}
