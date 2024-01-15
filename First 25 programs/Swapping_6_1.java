
// The program to swap two numbers using  third  variable

import java.util.Scanner;


public class Swapping_6_1{
    public static void main(String[]args){

        int x,y,temp;                                 // Declaration of three variables

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y integer values");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before swapping \n x : "+x+" \n y :"+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping \n x : "+x+" \n y : "+y);
         sc.close();
         
    }
}