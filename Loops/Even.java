import java.util.Scanner;

public class even {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int startrange, endingrange;
        System.out.println("Enter the starting range : ");
        startrange = scan.nextInt();
        System.out.println("Enter the ending range : ");
        endingrange = scan.nextInt();
        for(int i=startrange; i<endingrange; i++){
            if(i==5){
                continue;
            }
            else if(i%2 == 0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
