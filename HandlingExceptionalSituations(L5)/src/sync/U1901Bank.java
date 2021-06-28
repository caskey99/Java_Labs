package sync;

import java.io.IOException;

public class U1901Bank {
    int intTo, intFrom = 220;

    public void calc(int intTransaction , long lngTimeout) {
        System.out.println("Operation before!");
        System.out.println("intFrom: " + intFrom + ", intTo: " + intTo);
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(lngTimeout);
        }
        catch (InterruptedException  e) {
            System.out.println(e.getMessage());
        }
        intFrom -= intTransaction ;
        intTo += intTransaction ;
        System.out.println("Operation completed!");
        System.out.println("intFrom: " + intFrom + ", intTo: " + intTo);
        System.out.println(Thread.currentThread().getName());
    }
}
