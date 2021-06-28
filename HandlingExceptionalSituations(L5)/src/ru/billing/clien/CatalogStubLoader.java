package ru.billing.clien;
import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.*;

import java.io.IOException;
import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    public void load(ItemCatalog cat)
    {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        GenericItem item2 = new GenericItem("Samsung TV",20000, Category.GENERAL);
        //FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
//        try {
//            cat.addItem(item1);
//            cat.addItem(item2); }
//        catch (ItemAlreadyExistsException e) { // TODO Auto-generated catch block
//            e.printStackTrace();
//            throw new CatalogLoadException(e);
//        }


    }
}
