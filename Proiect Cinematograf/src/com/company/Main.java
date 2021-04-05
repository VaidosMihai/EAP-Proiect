package com.company;

public class Main {

    public static void main(String[] args) {
        Client C1 = new Client("Andrei", "Ion", 28, 50);
        Client C2 = new Client("Ana", "Maria", 14, 30);
        Client C3 = new Client("Daniel", "Olar", 17, 40);
        Client C4 = new Client("Mircea", "Racovita", 21, 100);

        Film F1 = new Film("Avangers 1", 18, "14:00", 7.5f);
        Film F2 = new Film("Lion King", 4, "14:30", 5.5f);
        Film F3 = new Film("SuperWoman", 14, "15:00", 6.4f);

        Cinema AFI = new Cinema();

        Bar barAFI = new Bar();

        Camera camera_0 = new Camera(5, 5);
        Camera camera_1 = new Camera(4, 5);
        Camera camera_2 = new Camera(3, 6);

        AFI.add_new_room(camera_0);
        AFI.add_new_room(camera_1);    ///Adauga o camera noua la lista hall
        AFI.add_new_room(camera_2);

        AFI.add_new_client(C1);
        AFI.add_new_client(C2); ///Se adauga clienti la lista cinematografului respectiv
        AFI.add_new_client(C3);
        AFI.add_new_client(C4);

        Bilet bilet1=new Bilet(F1,C1,camera_0,2,2);
        Bilet bilet2=new Bilet(F2,C2,camera_0,2,3);  ///Bilete pentru clienti
        Bilet bilet3=new Bilet(F1,C3,camera_0,4,2);
        BiletVIP bilet4=new BiletVIP(F2,C4,camera_1,3,2); ///Bilet VIP

        System.out.println(bilet1.key_code);
        System.out.println(bilet2.key_code); /// afisare COD bilet
        System.out.println(bilet4.key_code);

        bilet1.Print();
        bilet2.Print();     ///Afisare pret bilet
        bilet4.Print();

        AFI.Print(); /// afisare camere disponibile pentru filme

        AFI.removeClient(C3);    ///Stergem clientul 3 din lista clientilor cinematografului

        Comanda comanda1=new Comanda(new String[]{"pizza","popcorn"});
        Comanda comanda2=new Comanda(new String[]{"inghetata"}); ///Comenzi pentru bar
        Comanda comanda3=new Comanda(new String[]{"ciocolata","arahide","covrigei","cips-uri","alune"});

        barAFI.add_orders(comanda1);
        barAFI.add_orders(comanda2);    /// Adaugam comenzile in coada din clasa Bar
        barAFI.add_orders(comanda3);
    }

}
