import java.util.Scanner;
public class lowercornerstar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number :");
        n = scan.nextInt();
        int x = 0;
        for(int i=n; i>0; i--){
            for(int j = n; j>0; j-- ){
                if(x>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            x++;
        }
        scan.close();
    }
}
