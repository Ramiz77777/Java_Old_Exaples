package aaa.CallableInterfaEx;

import java.util.concurrent.Callable;

public class Fact implements Callable<Integer> {
    int f;

    public Fact(int f) {
        this.f = f;
    }


    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Vvedi cislo bolshe 0");
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res*i;

        }
        return res;
    }
}

