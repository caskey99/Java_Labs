package ru.billing.exceptions;

import java.io.FileNotFoundException;

public class CatalogLoadException extends Exception
{
    public CatalogLoadException(ItemAlreadyExistsException message)
    {
        System.err.println("ошибка загрузки каталога");
    }

    public CatalogLoadException(FileNotFoundException e) {
    }
}