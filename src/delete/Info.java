package delete;

public class Info <T>{
    private T value1;
    private T value2;

    private String value3;

//    public Info(T value1, T value2) {
//        this.value1 = value1;
//        this.value2 = value2;
//    }
    public void printInfo(T value1,T value2){
        System.out.println(value1 + " " +  value2);
    }

    public T getValue1() {
        return value1;

    }

    public T getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
class InfoExample {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>();
        info1.printInfo("Privet","Poka");

//        String s = info1.getValue2();
//        System.out.println(s);

    }
}

