package aaa.N;

public class MobileCall implements Runnable{
    MethodsForCall methodsForCall = new MethodsForCall();
    @Override
    public void run() {
        methodsForCall.MobileCall();
    }
}
