package ru.billing.clien;
import ru.billing.exceptions.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException;

}
