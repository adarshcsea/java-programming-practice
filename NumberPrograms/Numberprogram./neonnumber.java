import java.util.*;
public class neonnumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int sq = number*number;
        int result = 0;
        for(int i=sq; i > 0; i-- ){
            int hi = sq%10;
            sq /= 10;
            result += hi;

        }
        if(result == number){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not a neon number");
        }
        scan.close();
    }
}
