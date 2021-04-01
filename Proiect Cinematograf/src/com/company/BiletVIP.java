package com.company;

public class BiletVIP extends Bilet {

    public BiletVIP(Film movie, Client client, Camera room, int row, int column) {
        super(movie, client, room, row, column);
        key_code += "^VIP";

        price = (float) (movie.getPrice() *2);

    }
}
