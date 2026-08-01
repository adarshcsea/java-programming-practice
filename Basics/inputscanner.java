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
        System.out.println("Enter a decimal number :");
        double k = scan.nextDouble();
        System.out.println("The decimal number entered :" + k);
        System.out.println("Enter a word :");
        String l = scan.next();
        scan.nextLine();
        System.out.println("The word entered :" + l);
        System.out.print("Enter a sentence in a line :");
        String m = scan.nextLine();
        System.out.println("The sentence entered :" + m);
        scan.close();
    }
    
}
