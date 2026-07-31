import java.util.*;
public class inputscanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = scan.nextInt();
        System.out.println("The number entered :" + i);
        System.out.println("Enter a character :");
        char j = scan.next().charAt(0);
        System.out.println("The character entered :" + j);
        scan.close();
    }
    
}
