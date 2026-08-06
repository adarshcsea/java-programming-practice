import java.util.*;
public class armstrongnumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int number1 = number;
        int result = 0;
        for(int i=number1; i > 0; i-- ){
            int hi = number1%10;
            number1 /= 10;
            result += (hi*hi*hi);

        }
        if(result == number){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
        scan.close();
    }
}
