import java.util.Scanner;
public class starsquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number :");
        n = scan.nextInt();
        int m = n;
        for(int i=n; i>=0; i--){
            for(int j = n; j>=0; j-- ){
                if(j == 0 || j == m || i == 0 || i == m ){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        scan.close();
    }
}
