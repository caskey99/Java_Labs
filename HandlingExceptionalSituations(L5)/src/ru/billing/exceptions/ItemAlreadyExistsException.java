package ru.billing.exceptions;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException()
    {
        this("The added item is already present in the catalog!");
    }
    public ItemAlreadyExistsException(String message)
    {
        super(message);
    }
}
