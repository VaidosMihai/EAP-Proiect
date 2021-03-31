package com.company;

public class BiletVIP extends Bilet {

    BiletVIP(Film movie, Client client, LocOcupat occupied_seat) {
        super(movie, client, occupied_seat);
        price = (float) (price + price * 0.5);
        key_code += "^VP";
    }
}
