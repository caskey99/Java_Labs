package com.max.idea;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        GenericItem book = new GenericItem();
        GenericItem keyboard = new GenericItem();
        GenericItem cup = new GenericItem();
        book.ID = 1;
        book.name = "Java for Dummies";
        book.price = 1000;
        keyboard.ID = 2;
        keyboard.name = "Oklick";
        keyboard.price = 1500;
        cup.ID = 3;
        cup.name = "Basik";
        cup.price = 250;
        cup.category = GenericItem.Category.FOOD;
        book.printAll();
        keyboard.printAll();
        cup.printAll();

        FoodItem Fruit = new FoodItem();
        Fruit.ID = 4;
        Fruit.name = "Banana";
        Fruit.price = 10;
        Fruit.category = GenericItem.Category.FOOD;
        Fruit.dateOfIncome = new Date();
        Fruit.expires = 5;

        TechnicalItem Technic = new TechnicalItem();
        Technic.ID = 5;
        Technic.name = "TV";
        Technic.price = 10000;
        Technic.category = GenericItem.Category.GENERAL;
        Technic.warrantyTime = 1825;

        GenericItem[] items = { Fruit, Technic };
        for (GenericItem item : items)
        {
            item.printAll();
        }

        System.out.println(keyboard.equals(Fruit));
        System.out.println(Fruit.equals(keyboard));
        System.out.println(Technic.equals(Fruit));

        var test = keyboard.clone();
        System.out.println(keyboard.equals(test));

        System.out.println(Fruit.toString());
    }
}
