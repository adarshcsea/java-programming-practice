import java.util.Arrays;
import java.util.Scanner;
public class arrayinsertion {
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40, 50};
        int m = a.length;
        System.out.println(m);
        int[] newarr = new int[m + 1];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = scan.nextInt();
        System.out.println("Enter the position");
        int pos = scan.nextInt();

        for(int i=0; i<pos-1; i++){
            newarr[i] = a[i];
        }
        System.out.println(Arrays.toString(newarr));
        
        newarr[pos-1] = value;
        
        System.out.println(Arrays.toString(newarr));

        int n = newarr.length;
        System.out.println(n);
        
        for(int i= pos-1; i<m; i++){
            newarr[i+1] = a[i];
        }
        
        for(int i =0; i<n; i++){
            System.out.println(newarr[i]);
        }

    }
}
