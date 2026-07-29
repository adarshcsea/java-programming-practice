import java.util.Scanner;

public class banksystem{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double balance, deposit, withdraw;
        System.out.println("Enter the initial balance : ");
        balance = scan.nextInt();
        System.out.println("Enter the deposit amount : ");
        deposit = scan.nextInt();
        System.out.println("Enter the withdrawal amount : ");
        withdraw = scan.nextInt();
        if(balance<withdraw){
            System.out.println("Insufficient balance");   
        }
        else{
            balance += deposit;
            balance -= withdraw;
            System.out.println("Remaining balance : " + balance);
        }
        scan.close();
    }
}
