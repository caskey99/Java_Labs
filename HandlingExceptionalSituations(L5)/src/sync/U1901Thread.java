package sync;

public class U1901Thread extends Thread {
    U1901Bank bankWork;
    int ntTrans;
    long ngSleep;

    public U1901Thread(U1901Bank _bankWork, int _ntTrans,long _ngSleep) {
        bankWork = _bankWork;
        ntTrans = _ntTrans;
        ngSleep = _ngSleep;
    }


}
