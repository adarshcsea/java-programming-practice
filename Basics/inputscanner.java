import java.util.Scanner;
public class inputscanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = scan.nextInt();
        System.out.println("The number entered :" + i);
        scan.close();
    }
    
}
