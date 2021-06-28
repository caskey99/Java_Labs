package ru.itmo.client;

import ru.billing.clien.CatalogLoader;
import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.ItemCatalog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class CatalogFileLoader implements CatalogLoader {
    private String fileName;
    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void load(ItemCatalog items) throws CatalogLoadException {
        File f = new File(fileName);
        FileInputStream fis;
        String line;
        try {
            fis = new FileInputStream(f);
            Scanner s = new Scanner(fis);

            while (s.hasNextLine()) {
                line = s.nextLine();
                if (line.length() == 0) break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FoodItem item = new FoodItem(name, price, null, new Date(), expires);
                ItemCatalog cat = null;
                cat.addItem(item);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }

    }
}


