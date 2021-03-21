package com.max.idea;

public class TechnicalItem extends GenericItem {
    public short warrantyTime; // гарантийный срок

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("WarrantyTime: %-20d \n", warrantyTime);
    }

    public boolean equals(Object o)
    {
        return super.equals(o);
    }

    public Object clone()
    {
        TechnicalItem technicalItem = new TechnicalItem();
        technicalItem.ID = this.ID;
        technicalItem.category = this.category;
        technicalItem.name = this.name;
        if(this.analogue != null)
            technicalItem.analogue = this.analogue;
        technicalItem.price = this.price;
        technicalItem.warrantyTime = this.warrantyTime;
        return technicalItem;
    }

    public String toString()
    {
        return super.toString();
    }
}

