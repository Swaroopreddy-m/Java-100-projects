
//Program to demonstrate the swapping between 2 variables without using 3rd variable
import java.util.Scanner;

public class Swapping_7_2{
    
    public static void main(String [] args){
        int x,y;                                   // Declaration of Two Variables

        Scanner swapping = new Scanner(System.in);
        System.out.println("Enter X and Y values");
        x=swapping.nextInt();
        y=swapping.nextInt();

        System.out.println("Before Swapping \n x :"+x+"\n y :"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After  Swapping \n x :"+x+"\n y :"+y);

        swapping.close();

    }
}