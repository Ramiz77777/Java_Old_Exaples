package fordelete.abx;

public class kademo {
    public static void main(String[] args) {
//        kalku.Resultslojeniye Resultslojeniye = new kalku().new Resultslojeniye();
//        System.out.println(Resultslojeniye.metod("plus operation is"));
//        kalku.ResultOfMinus resultOfMinus = new kalku().new ResultOfMinus();
//        System.out.println(resultOfMinus.metod("Minus operation is"));
        interfaceDoOperation interfaceDoOperation = new interfaceDoOperation(){
            @Override
            public double metod(double a,double b){
                return a+b;
            }
        };

//        String s = "mdam";
//        List<Character> list = new ArrayList<>();
//        for (Character a : s.toCharArray()) {
//            list.add(a);
//        }
//        ListIterator<Character> characterListIterator = list.listIterator();
//        ListIterator<Character> reverceListIterator = list.listIterator(list.size());
//        boolean ispalindirom = true;
//        while (characterListIterator.hasNext() && reverceListIterator.hasPrevious()) {
//            if(characterListIterator.next() != reverceListIterator.previous()){
//                ispalindrom = false;
//                break;
//            }
//        }
//        if(ispalindrom){
//            System.out.println("Palindrom");
//        }
//        else {
//            System.out.println("Not Polindrome");
//        }




    }
}
