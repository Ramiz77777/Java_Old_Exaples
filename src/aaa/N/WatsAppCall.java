package aaa.N;

public class WatsAppCall implements Runnable{
    MethodsForCall methodsForCall = new MethodsForCall();
    @Override
    public void run() {
        methodsForCall.WatsAppCall();
    }
}
