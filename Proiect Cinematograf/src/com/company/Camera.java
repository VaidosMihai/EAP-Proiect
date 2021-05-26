package com.company;

import Write_Files.Write_Audit;

import java.util.Scanner;

public class Camera {
    private int id;
    private int capacity;
    private int rows;
    private int columns;
    private static int nr_of_rooms = 0;

    public Camera(int rows, int columns) {
        Write_Audit.writeAudit("New Room");
        id = nr_of_rooms++;
        this.capacity = rows * columns;
        this.rows = rows;
        this.columns = columns;
    }

    public Camera(int x) {
    }

    public Camera() {
        Scanner in = new Scanner(System.in);
        System.out.println("Room ID: ");
        this.id = Integer.parseInt(in.nextLine());
        System.out.println("Number of rows:");
        this.rows = Integer.parseInt(in.nextLine());
        System.out.println("Number of columns:");
        this.columns = Integer.parseInt(in.nextLine());
        this.capacity = rows * columns;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }


    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        Write_Audit.writeAudit("Print rooms");
        return "Room: [" + id + "]";
    }
}
