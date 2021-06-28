package ru.billing.exceptions;

public class NegativeQuantityException extends Exception{
    public String GetMess() {
        return "Attempt to write off the quantity of goods from the warehouse more than the available one!";
    }
}
