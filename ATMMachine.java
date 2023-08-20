package ATMMachine;
import java.util.*;
import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("Enter your PIN number");
        Scanner sc = new Scanner(System.in);
        int PINentered = sc.nextInt();

        if (PINentered==PIN) {
             menu();
             
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option==1) {
            checkBalance();
        }
        else if (option==2) {
            WithdrawMoney();
        }
        else if (option==3) {
           DepositMoney();
        }
        else if (option==4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance:"+ Balance);
        menu();
    }
     
    public void WithdrawMoney(){

        System.out.println("Enter amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("money deposited Successfully");
    }

}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkBalance();
    }
}
