package ru.billing.clien;
import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.*;
import ru.itmo.client.CatalogFileLoader;


public class Main{

    public static void main(String[] args) throws CatalogLoadException {

//        GenericItem keyboard = new GenericItem("Oklick", 1500, GenericItem.Category.GENERAL);
//        GenericItem mouse = new GenericItem("Blody", 1000, GenericItem.Category.GENERAL);
//        GenericItem phone = new GenericItem("Mi", 12000, GenericItem.Category.GENERAL);
//        GenericItem headphones = new GenericItem("Samsung", 2000, GenericItem.Category.GENERAL);
//        GenericItem jeans = new GenericItem("Miller", 3000, GenericItem.Category.DRESS);
//        GenericItem cap = new GenericItem("Goochi", 500, GenericItem.Category.DRESS);
//        GenericItem jacket = new GenericItem("Skin", 5000, GenericItem.Category.DRESS);
//        GenericItem t_shirt = new GenericItem("Russia", 300, GenericItem.Category.DRESS);
//        GenericItem gloves = new GenericItem("NoSkin", 700, GenericItem.Category.DRESS);
//        GenericItem skirt = new GenericItem("Smam", 1400, GenericItem.Category.DRESS);
        ItemCatalog itemCatalog = new ItemCatalog();
        try
        {
            itemCatalog.addItem(new GenericItem("Oklick", 1500, Category.GENERAL));
            itemCatalog.addItem(new GenericItem("Blody", 1000, Category.GENERAL));
            itemCatalog.addItem(new GenericItem("Mi", 12000, Category.GENERAL));
            itemCatalog.addItem(new GenericItem("Samsung", 2000, Category.GENERAL));
            itemCatalog.addItem(new GenericItem("Miller", 3000, Category.DRESS));
            itemCatalog.addItem(new GenericItem("Goochi", 500, Category.DRESS));
            itemCatalog.addItem(new GenericItem("Skin", 5000, Category.DRESS));
            itemCatalog.addItem(new GenericItem("Russia", 300, Category.DRESS));
            itemCatalog.addItem(new GenericItem("NoSkin", 700, Category.DRESS));
        }
        catch (Exception e)
        {
            throw e;
        }
        //itemCatalog.addItem(skirt);
       // itemCatalog.addItem(new GenericItem("Smam", 1400, Category.DRESS));
//        System.out.println(itemCatalog.GetCount());
//
//        long begin = new Date().getTime();
//        for(int i=0; i<100000;i++)
//            itemCatalog.findItemByID(10);
//        long end = new Date().getTime();
//        System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime();
//
//        for(int i=0; i<100000;i++)
//            itemCatalog.findItemByIDAL(10);
//        end = new Date().getTime();
//        System.out.println("In ArrayList: "+(end-begin));

       // itemCatalog.printItems();


//        CatalogLoader loader = new CatalogStubLoader();
//        loader.load(itemCatalog);
//        CatalogFileLoader loadutf = new CatalogFileLoader("UTF-8.txt");
//        loadutf.load(itemCatalog);
//        CatalogFileLoader loadwin = new CatalogFileLoader("WINDOWS-1251.txt");
//        loadwin.load(itemCatalog);
//        itemCatalog.printItems();
    }

}
