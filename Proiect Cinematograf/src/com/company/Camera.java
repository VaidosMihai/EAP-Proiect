package com.company;

import Write_Files.Write_Audit;

public class Camera {
    private final int id;
    private int capacity;
    private boolean seats[][];
    private final int rows;
    private final int columns;
    private static int nr_of_rooms = 0;

    public Camera(int rows, int columns) {
        Write_Audit.writeAudit("New Camera");
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

    public int getCapacity() {
        return capacity;
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
        Write_Audit.writeAudit("Print rooms");
        return "Room: [" + id + "]";
    }
}
