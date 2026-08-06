import java.util.*;
public class automorphic {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int j = 0;
        if(n < 10 && n > 0){
            j = 10;
        }
        else if(n<100 && n >10)
        { j = 100; }
        else if(n<1000 && n>100)
        { j = 1000; }

        int sq = n*n;
        int hi = sq%j;

        if(n == hi ){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not an automorphic");
        }
        scan.close();
    }
}
