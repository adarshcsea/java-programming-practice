import java.util.Scanner;
public class uppercornerstar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number :");
        n = scan.nextInt();
        int m = n;
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++ ){
                System.out.print("*");
            }
            m--;
            System.out.println("");
        }
        scan.close();
    }
}
