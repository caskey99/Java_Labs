package ru.billing.stocklist;
import java.util.Date;

public class TechnicalItem extends GenericItem {
    private short warrantyTime; // гарантийный срок

    public short GetDateOfIncome() {  return warrantyTime; }
    public void SetDateOfIncome(short warr) { warrantyTime = warr; }


    @Override
    void printAll() {
        super.printAll();
        System.out.printf("WarrantyTime: %-20d \n", warrantyTime);
    }

    public boolean equals(Object o)
    {
        return super.equals(o);
    }
}


