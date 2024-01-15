
/*  The program to print addition of two integers 

import java.util.Scanner;

public class AddingNum_8 {
    public static void main(String [] args){
        int x,y,z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two integers to print ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("The sum of two integers are :"+z);
        sc.close();


    }
    
}
*/

// Program to print Big Integer using math.BigInteger()

import java.math.BigInteger;
import java.util.Scanner;

public class AddingNum_8{
    public static void main(String[]args){
        String number1,number2;                 //Declaration of 2 Strings

        Scanner sc =new Scanner(System.in);
       System.out.println("Enter first numbers and enter and second number and enter");   // Getting 2 strings 
       number1=sc.nextLine();
       number2=sc.nextLine();

       BigInteger first = new BigInteger(number1);                    // Adding number1 and number2 to the BigInteger as first and second
       BigInteger second = new BigInteger(number2);
       BigInteger sum;                                                // Allocating Space for sum to store value as Big integer

       sum=first.add(second);                                         //calling add function from the class BigInteger
    
       System.out.println("The addition of two numbers are :"+sum);
       sc.close();

    }
}

