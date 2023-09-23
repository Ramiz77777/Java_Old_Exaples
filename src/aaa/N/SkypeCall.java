package aaa.N;

public class SkypeCall implements Runnable{
    MethodsForCall methodsForCall = new MethodsForCall();
    @Override
    public void run() {
        methodsForCall.SkypeCall();
    }
}
