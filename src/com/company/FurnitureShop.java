package com.company;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class FurnitureShop {
    private Table[] tables;
    private Chair[] chairs;
    private Bed[] beds;
    private final String[] colors = {"Red", "Yellow", "Grey", "Black", "Brown"};
    private final String[] sizes = {"Big", "Medium", "Small"};
    private final String[] materials = {"Wood", "Plastic", "Metal"};
    private final String[] types = {"Soft", "Not soft"};

    public FurnitureShop(){
        int n = 5;
        Random rand = new Random();
        this.tables = new Table[n];
        this.chairs = new Chair[n];
        this.beds = new Bed[n];
        for(int i=0;i<n;i++) {
                    tables[i] = new Table(colors[rand.nextInt(100)%5], sizes[rand.nextInt(100)%3], materials[rand.nextInt(100)%3], rand.nextInt(100)%10+1, rand.nextInt(100)%1000+1);
                    chairs[i] = new Chair(colors[rand.nextInt(100)%5], sizes[rand.nextInt(100)%3], materials[rand.nextInt(100)%3], types[rand.nextInt(100)%2], rand.nextInt(100)%3, rand.nextInt(100)%1000+1);
                    beds[i] = new Bed(colors[rand.nextInt(100)%5], sizes[rand.nextInt(100)%3], materials[rand.nextInt(100)%3], rand.nextInt(100)%4+1, rand.nextInt(100)%1000+1);
            }
        }


    /*
    public class FurnitureIterator implements Iterator<Furniture>{
        public Furniture[] furniture;
        public String furnituretype;
        public FurnitureIterator(Furniture[] furniture, String furnituretype){
            this.furniture = furniture;
            this.furnituretype = furnituretype;
        }

        public boolean find(Furniture[] mass, int i){
            for(int j=i;j<mass.length)
        }

        @Override
        public boolean hasNext() {
            this.furniture.
            return false;
        }

        @Override
        public Furniture next() {
            return null;
        }
    }
    */

    public static void StartShopping(){
        FurnitureShop shop = new FurnitureShop();
        System.out.println("Hello dear custumer. Welcome to furniture shop. What would you like to buy? Type table, bed or chair");
        Scanner in = new Scanner(System.in);
        String typeFurniture;
        do {
            typeFurniture = in.next();
        } while (!typeFurniture.equals("table") && !typeFurniture.equals("chair") && !typeFurniture.equals("bed"));
        int choosen;
        switch (typeFurniture){
            case "table":
                System.out.println("Choose a table:");
                for(int i=0;i<5;i++){
                    System.out.println(i+" "+shop.tables[i]);
                }
                choosen = in.nextInt();
                System.out.print("Thank you for your choice");
                break;
            case "chair":
                System.out.println("Choose a chair:");
                for(int i=0;i<5;i++){
                    System.out.println(i+" "+shop.chairs[i]);
                }
                choosen = in.nextInt();
                System.out.print("Thank you for your choice");
                break;
            case "bed":
                System.out.println("Choose a bed:");
                for(int i=0;i<5;i++){
                    System.out.println(i+" "+shop.beds[i]);
                }
                choosen = in.nextInt();
                System.out.print("Thank you for your choice");
                break;
        }

        in.close();
    }
}
