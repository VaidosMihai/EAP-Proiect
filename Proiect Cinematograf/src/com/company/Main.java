package com.company;

public class Main {

    public static void main(String[] args) {
        Client C1 = new Client("Andrei", "Ion", 28);
        Client C2 = new Client("Ana", "Maria", 14);
        Client C3 = new Client("Daniel", "Omar", 17);

        Film F1 = new Film("Avangers 1", 18, "14:00", 7.5f);
        Film F2 = new Film("Lion King", 4, "14:30", 5.5f);
        Film F3 = new Film("SuperWoman", 14, "15:00", 6.4f);

        Cinema AFI = new Cinema();
        Bar B1=new Bar();
        AFI.add_new_room(3, 3);
        AFI.add_new_room(3, 2);    ///Adauga o camera noua
        AFI.add_n_new_rooms(3, 4, 3); ///Adauga n=3 camere noi
        AFI.add_new_client(C1);
        AFI.add_new_client(C2); ///Se adauga clienti la lista cinematografului respectiv
        System.out.println(AFI.getHall());
        System.out.println(AFI.getClient_list());
        //AFI.reserve_seat(2,2,AFI.getHall(),F1,C1);

    }
}
