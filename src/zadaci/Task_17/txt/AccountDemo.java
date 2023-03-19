package zadaci.Task_17.txt;

public class AccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.ownerFirstName;
        String ownerlastName = bankAccount.ownerLastName;
        int moneyAmount = bankAccount.moneyAmount;
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerlastName);
        System.out.println("Money amount = " + moneyAmount);

    }


}
