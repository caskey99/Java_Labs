package max.idea;

public class GenericItem {
    static int currentID = 0;
    public int ID;
    public String name;
    public float price;
    public GenericItem analogue;
    public Category category = Category.GENERAL;
    public enum Category { FOOD, PRINT, DRESS, GENERAL }

    public GenericItem(String _name, float _price, Category _category)
    {
        this.ID = GenericItem.currentID++;
        name = _name;
        price = _price;
        category = _category;
    }

    public GenericItem(String _name, float _price, GenericItem _analog)
    {
        name = _name;
        price = _price;
        analogue = _analog;
    }

    public GenericItem() { }

    void printAll(){
        System.out.printf("ID: %d, Name: %-20s, Category: %-20s, price:%5.2f \n", ID, name, category, price);
    }
}
