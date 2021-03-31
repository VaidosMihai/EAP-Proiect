package com.company;

public class Camera {
    private int id;
    private int capacity;
    private boolean seats[][];
    private int rows;
    private int columns;
    private static int nr_of_rooms = 0;

    Camera(int rows, int columns) {
        id = nr_of_rooms++;
        this.capacity = rows * columns;
        this.rows = rows;
        this.columns = columns;
        seats = new boolean[rows][columns];
    }

    public boolean isOccupied(int row, int column) {
        return seats[row][column];
    }

    public int getId() {
        return id;
    }

    public boolean[][] getSeats() {
        return seats;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        return "Room: [" + id + "]";
    }
}
