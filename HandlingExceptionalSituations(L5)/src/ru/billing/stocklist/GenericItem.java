package ru.billing.stocklist;
import javax.lang.model.element.Name;

public class GenericItem {
    static int currentID = 0;
    private int ID;
    private String name;
    private float price;
    private GenericItem analogue;
    private Category category = Category.GENERAL;

    public int GetId() {  return ID; }
    public void SetId(int id) { ID = id; }

    public String GetName() {  return name; }
    public void SetName(String pname) { name = pname; }

    public float GetPrice() {  return price; }
    public void SetPrice(float p) { price = p; }

    public GenericItem GetAnalogue() {  return analogue; }
    public void SetAnalogue(GenericItem genericItem) { analogue = genericItem; }

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