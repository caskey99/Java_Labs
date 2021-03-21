package max.idea;

import java.util.Date;

public class FoodItem extends GenericItem {
    public Date dateOfIncome; // дата производства
    public short expires; // гарантийный срок (суток)

    public FoodItem(String _name, float _price, FoodItem _analog, Date _date, short _expires)
    {
        this.name = _name;
        price = _price;
        dateOfIncome = _date;
        expires = _expires;
    }

    public FoodItem(String _name, float _price, short _expires)
    {
        name = _name;
        price = _price;
        expires = _expires;
        new FoodItem(_name, _price, (FoodItem) this.analogue, this.dateOfIncome , this.expires);
    }

    public FoodItem(String _name)
    {
        name = _name;
        new FoodItem(_name, this.price, (FoodItem) this.analogue, this.dateOfIncome , this.expires);
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.printf("Date: %s, Expires: %s \n", dateOfIncome, expires);
    }
}
