
//No 18 th program
// the program is used to print integers and when it is the while loop stops.

import java.util.Scanner;

public class WhileLoop_19 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer to print");

        while((n = sc.nextInt()) != 0){
            System.out.println("Entered Number is :"+n);
            System.out.println("Enter any Integer");
        }
      System.out.println("Out Of The Loop ");
        sc.close();
        
    }
    
}
