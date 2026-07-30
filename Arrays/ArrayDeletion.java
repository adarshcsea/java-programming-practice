import java.util.Scanner;
public class ArrayDeletion {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        for(int i = 0; i<n; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println("    ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the position to delete the number from :");
        int pos = scan.nextInt();

        int[] newarr = new int[n-1];
        for(int i = 0; i<pos-1; i++){
            newarr[i] = arr[i];
        }
        

        for(int i = pos; i<n; i++){
            newarr[i-1] = arr[i];
        }

        int m = newarr.length;
        
        for(int i = 0; i<m; i++){
        System.out.print(newarr[i] + "  ");
        }
        scan.close();
    }
}
