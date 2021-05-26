package com.company;

import DB_Files.ClientDB;
import DB_Files.SysConnect;

import java.sql.*;
import java.util.Scanner;

public class Menu {
    boolean exit;

    public void runMenu() throws SQLException {
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader() {
        System.out.println("--------------------------------");
        System.out.println("        Welcome to Cinema!      ");
        System.out.println("--------------------------------");
    }

    private void printMenu() {
        System.out.println("\nPlease make a selection");
        System.out.println("1)Add a new cinema.");
        System.out.println("2)Add a new customer.");
        System.out.println("3)Add a new movie.");
        System.out.println("4)Add a new room.");
        System.out.println("5)Update Film name.");
        System.out.println("6)Select Film.");                   //meniu cu comenzi pentru baza de date
        System.out.println("7)Delete Film.");
        System.out.println("8)Update Customer name.");
        System.out.println("9)Select Customer.");
        System.out.println("10)Delete Customer.");
        System.out.println("11)Update Cinema.");
        System.out.println("12)Select Cinema.");
        System.out.println("13)Delete Cinema.");
        System.out.println("14)Update Room.");
        System.out.println("15)Select Room.");
        System.out.println("16)Delete Room.");
        System.out.println("0)Exit.");
    }

    private int getInput() {
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice > 17)
            try {
                System.out.print("\nEnter your choice:");
                choice = Integer.parseInt(in.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection.Please try again.");
            }
        return choice;
    }

    private void performAction(int choice) throws SQLException {
        Connection con = DataBaseConn.getConnection();
        SysConnect run = new SysConnect();
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Thank you for coming!");
                break;
            case 1:
                try {
                    run.AddCinema();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case 2:
                try {
                    run.AddClient();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case 3:
                try {
                    run.AddFilm();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case 4:
                try {
                    run.AddCamera();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            /*case 5:
                Scanner type = new Scanner(System.in);
                System.out.println("Do you want to buy a VIP ticket?(yes/no)");
                String x = type.nextLine();
                switch (x) {
                    case "no":
                        ClientDB clienti = new ClientDB();

                        System.out.println("Okey you are buying a basic ticket.Choose who you want to buy a ticket:");
                        String query = "select * from Client";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(query);
                        while (rs.next()) {
                            System.err.println(rs.getString(1) + " " + rs.getString(2));
                        }
                        boolean stop = false;
                        while (stop == false) {
                            Scanner in = new Scanner(System.in);
                            System.out.println("Enter customer first name:");
                            String customer_name = in.nextLine();
                            System.out.println("Enter movie name:");
                            String movie_name = in.nextLine();
                            System.out.println("Enter room id:");
                            Integer room_id = Integer.parseInt(in.nextLine());
                            System.out.println("Enter row:");
                            Integer row = Integer.parseInt(in.nextLine());
                            System.out.println("Enter column:");
                            Integer column = Integer.parseInt(in.nextLine());
                            stop = true;
                        }

                }

            case 6:
                Scanner in = new Scanner(System.in);
                System.out.println("What can we serve you? You can buy a maximum of 4 dishes. ");
                System.out.println("First :");
                String food1 = in.nextLine();
                System.out.println("Second :");
                String food2 = in.nextLine();
                if (food2 == "stop") new Comanda();break;
                else {
                    System.out.println("Third :");
                    String food3 = in.nextLine();
                    if (food3 == "stop") break;
                    else {
                    System.out.println("Fourth :");
                    String food4 = in.nextLine();
                    break;}
                }
                Comanda(food1,food2);*/
            case 5:
                System.out.println("Existing movies :");
                String query = "select * from Film";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.UpdateFilm();
                break;
            case 6:
                System.out.println("Existing movies :");
                query = "select * from Film";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.SelectFilm();
                break;
            case 7:
                System.out.println("Existing movies :");
                query = "select * from Film";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.DeleteFilm();
                break;
            case 8:
                System.out.println("Existing customers :");
                query = "select * from Client";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.UpdateClient();
                break;
            case 9:
                System.out.println("Existing customers :");
                query = "select * from Client";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.SelectClient();
                break;
            case 10:
                System.out.println("Existing customers :");
                query = "select * from Client";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.DeleteClient();
                break;
            case 11:
                System.out.println("Existing cinema :");
                query = "select * from Cinema";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.UpdateCinema();
                break;
            case 12:
                System.out.println("Existing cinema :");
                query = "select * from Cinema";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.SelectCinema();
                break;
            case 13:
                System.out.println("Existing cinema :");
                query = "select * from Cinema";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.DeleteCinema();
                break;
            case 14:
                System.out.println("Existing rooms :");
                query = "select * from Camera";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.UpdateCamera();
                break;
            case 15:
                System.out.println("Existing rooms :");
                query = "select * from Camera";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getString(1));
                }
                run.SelectCamera();
                break;
            case 16:
                System.out.println("Existing rooms :");
                query = "select * from Camera";
                st = con.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    System.err.println(rs.getInt(1));
                    run.DeleteCamera();
                }
                break;
            default:
                System.out.println("An unknown error has occured.");
                break;
        }
    }
}

