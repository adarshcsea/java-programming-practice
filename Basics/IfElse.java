import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        int pen = 10;
        int note = 40;
        if(amount<pen){
            System.out.println("You cannot afford anything");
        }
        else if(amount<note){
            System.out.println("You can only afford pens");
        }
        else if(amount< pen+note){
            System.out.println("You can afford either a note or pens");
        }
        else{
            System.out.println("You can afford both note and pens");
        }
        sc.close();
    }
}
