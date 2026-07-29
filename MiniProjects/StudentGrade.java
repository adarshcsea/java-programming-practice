import java.util.Scanner;

public class studentgrade{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int m1, m2, m3, total;
        double avg;
        System.out.println("Enter the first mark:");
 
        m1 = scan.nextInt();
 
        System.out.println("Enter the first mark:");
        m2 = scan.nextInt();
 
        System.out.println("Enter the second mark:");

        m3 = scan.nextInt();
        System.out.println("Enter the third mark:");
        
        total = m1 + m2 + m3;
        
        avg = total/3.0;
        
        System.out.println("Total marks :" + total + "Average :" + avg);
        if(avg<40 && avg> 0){
        System.out.println("Fail");
        }
        else if(avg>40 && avg<50){
        System.out.println("Grade : D");
        }
        else if(avg>50 && avg<60){
        System.out.println("Grade : C");
        }
        else if(avg>60 && avg<70){
        System.out.println("Grade : B");
        }
        else if(avg>70 && avg<80){
        System.out.println("Grade : A");
        }
        else if(avg>80 && avg<90){
        System.out.println("Grade : A+");
        }
        else if(avg>90 && avg<100){
        System.out.println("Grade : O");
        }
        scan.close();
    }
}