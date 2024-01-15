
//we to get User input using Scanner Program in java
import java.util.Scanner;

public class GetInputFromUser_4 {

    public static void main(String [] args){

        String a;
        int b;
        float c;
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String :");
        a=sc.nextLine();
        System.out.println("You Have entered "+a+" String");

        System.out.print("Enter Any Integer :");
        b=sc.nextInt();
        System.out.println("You Have entered "+b+" Integer");

        System.out.print("Enter Any Float Value :");
        c=sc.nextFloat();
        System.out.println("You Have entered "+c+" Float");
        sc.close();
    }
    
}
