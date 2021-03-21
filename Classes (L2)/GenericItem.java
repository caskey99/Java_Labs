package com.max.idea;

public class GenericItem {
    public int ID;
    public String name;
    public float price;
    public GenericItem analogue;
    public Category category = Category.GENERAL;
    public enum Category { FOOD, PRINT, DRESS, GENERAL }

    void printAll(){
        System.out.printf("ID: %d, Name: %-20s, Category: %-20s, price:%5.2f \n", ID, name, category, price);
    }

    public boolean equals(Object o)
    {
        if(o.getClass() == this.getClass())
            return true;
        else
            return false;
    }

    public Object clone()
    {
        GenericItem genericItem = new GenericItem();
        genericItem.ID = this.ID;
        genericItem.category = this.category;
        genericItem.name = this.name;
        if(this.analogue != null)
            genericItem.analogue = this.analogue;
        genericItem.price = this.price;
        return genericItem;
    }

    public String toString()
    {
        return this.name + this.ID + this.price + this.analogue + this.category;
    }
}
