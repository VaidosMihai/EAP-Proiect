/*package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void menu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Bun venit la cinematograful nostru!Alegeti una din actiunile de mai joc:\n");
        System.out.println("1.Adaugati client nou \n2.Adaugati comanda noua \n3.Adaugati un film nou \n4.Adaugati o camera noua");
        System.out.println("5.Cumparati un bilet pentru un client \n6.Afisati loc ocupat. \n7.Afisati clienti dupa varsta. \n");

        while (option >= -1 && option <=9) {
            System.out.println("Your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> { //Adaugati client nou
                    System.out.println("First name: ");
                    String f_name = scanner.next();

                    System.out.println("Last name: ");
                    String l_name = scanner.next();

                    System.out.println("Age: ");
                    int age = scanner.nextInt();

                    Client C1(f_name,l_name,age);
                }
                case 2 -> { //Adaugati comanda noua
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("genre: ");
                    String genre = scanner.next();

                    System.out.println("material: ");
                    String material = scanner.next();

                    System.out.println("age: ");
                    int age = scanner.nextInt();

                    cart.addToCart(new Toys(name, price, amount, age, material, genre));
                }
                case 3 -> { //clothes
                    Clothes clothes = new Clothes();
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("Do you know your size? If not, then write 'size' in console. If you know it, the write 'next'.");
                    String help = scanner.next();

                    if ("size".equals(help)) {
                        System.out.println("Introduce your measures (chest, waist, hip) in cm.");
                        int chest = scanner.nextInt();
                        int waist = scanner.nextInt();
                        int hip = scanner.nextInt();
                        clothes.sizeHelper(chest, waist, hip);
                    }
                    System.out.println("size: ");
                    String size = scanner.next();

                    System.out.println("color: ");
                    String color = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    clothes.setName(name);
                    clothes.setColor(color);
                    clothes.setSize(size);
                    clothes.setPrice(price);
                    clothes.setAmount(amount);
                    cart.addToCart(clothes);
                }
                case 4 -> { //Food
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("expiration date: ");
                    String expirationDate = scanner.next();

                    System.out.println("vegetarian product: ");
                    boolean vegetarian = scanner.nextBoolean();

                    Food food = new Food(name, price, amount, expirationDate,vegetarian);
                    cart.addToCart(food);
                    System.out.println("This product will expire in " + food.timeBeforeExpire() + " days.");
                }
                case 5 -> { //Drinks
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("caffeine: ");
                    boolean caffeine = scanner.nextBoolean();

                    System.out.println("alcohol (%): ");
                    float alcohol = scanner.nextFloat();

                    System.out.println("volume (ml): ");
                    int volume = scanner.nextInt();
                    cart.addToCart(new Drinks(name, price, amount, alcohol, volume, caffeine));
                }
                case 6 -> { //Remove
                    cart.printCart();
                    System.out.println("To remove from cart write the id in the console.");
                    int id = scanner.nextInt();
                    cart.removeFromCart(cart.findId(id));
                    System.out.println("Your item was remove with succes!");
                }
                case 7 -> //show cart
                        cart.printCart();
                case 8 -> { //change amount
                    cart.printCart();
                    System.out.println("Write the ID of the item whose amount you want to modify.");
                    int id = scanner.nextInt();
                    cart.changeAmount(cart.findId(id));
                    System.out.println("Your amount was modified.");
                }
                case 9 -> { //Exit
                    System.out.println("Bye! :) ");
                    option = 10;
                }
            }
        }
        scanner.close();
    }
}


*/
