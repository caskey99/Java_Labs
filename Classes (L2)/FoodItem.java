package com.max.idea;

import java.util.Date;

public class FoodItem extends GenericItem {
    public Date dateOfIncome; // дата производства
    public short expires; // гарантийный срок (суток)

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("Date: %s, Expires: %s \n", dateOfIncome, expires);
    }
    public boolean equals(Object o)
    {
        return  super.equals(o);
    }

    public Object clone()
    {
        super.clone();
        FoodItem foodItem = new FoodItem();
        if(foodItem.analogue != null)
            foodItem.analogue = this.analogue;
        foodItem.price = this.price;
        foodItem.dateOfIncome = this.dateOfIncome;
        foodItem.expires = this.expires;
        return foodItem;
    }
}
