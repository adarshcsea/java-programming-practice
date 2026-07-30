

public class EvenCount {
    public static void main(String [] args){
        int [] a = {10, 11, 12, 13, 14, 15};
        System.out.print("The even numbers present in the array : ");
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                count++;
                System.out.print(a[i]+ "    ");
            }
        }
        System.out.println(" ");
        System.out.println("Total number of even numbers : "+count);
    }
    
}
