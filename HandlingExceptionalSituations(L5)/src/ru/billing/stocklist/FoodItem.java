package ru.billing.stocklist;
import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome; // дата производства
    private short expires; // гарантийный срок (суток)

    public Date GetDateOfIncome() {  return dateOfIncome; }
    public void SetDateOfIncome(Date date) { dateOfIncome = date; }

    public short GetExpires() {  return expires; }
    public void SetExpires(short pexpires) { expires = pexpires; }

    public FoodItem(String _name, float _price, FoodItem _analog, Date _date, short _expires)
    {
        this.SetName(_name);
        this.SetPrice(_price);
        dateOfIncome = _date;
        expires = _expires;
    }

    public FoodItem(String _name, float _price, short _expires)
    {
        this.SetName(_name);
        this.SetPrice(_price);
        expires = _expires;
        new FoodItem(_name, _price, (FoodItem) this.GetAnalogue(), this.dateOfIncome , this.expires);
    }

    public FoodItem(String _name)
    {
        this.SetName(_name);
        new FoodItem(_name, this.GetPrice(), (FoodItem) this.GetAnalogue(), this.dateOfIncome , this.expires);
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("Date: %s, Expires: %s \n", dateOfIncome, expires);
    }
}
