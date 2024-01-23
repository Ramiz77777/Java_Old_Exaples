package Ttees;

public class TreeEx {
    public static void main(String[] args) {
//        Tree tree = new Tree(new Tree(15,
//                new Tree(10,new Tree(5,new Tree(1),new Tree(7)),new Tree(12,null,new Tree(14))),
//                new Tree(25,
//                        null,new Tree(40,new Tree(30),new Tree(55))));
        Tree tree = new Tree(new Tree(15,
                new Tree(10,new Tree(5,new Tree(1),new Tree(7)),new Tree(12,null,new Tree(14))),
                new Tree(25,null,new Tree(40,new Tree(30),new Tree(55)))).sum());
        System.out.println(tree.sum());
    }
}
class  Tree{
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }
    public int sum(){
        int summa = value;
        if(left != null){
            summa = summa + left.sum();
        }
        if(right != null){
            summa = summa+right.sum();
        }
        return summa;
    }
}


