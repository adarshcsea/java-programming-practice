import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int range;
        System.out.println("Enter the range : ");
        range = scan.nextInt();
        System.out.println("0");
        System.out.println("1");
        for(int i=2; i<=range; i++){
            int h = (i-1)+(i-2);
            System.out.println(h+" ");
        }
        scan.close();
    }
}
