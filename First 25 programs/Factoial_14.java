
// To find factorial to the number by the user.

/*import java.util.Scanner;

public class Factoial_14 {
    public static void main(String[] args) {

        int number;
        int fact = 1;
        int i;
       

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To Find Factorial :");
        number = sc.nextInt();
        sc.close();
        if(number<fact){
            System.out.println("Cannot perform Factorial");
        }else{
            for(i=1;i<=number;i++){
                fact = fact*i;                                  // Here using same variable to getrid of intialization
            }
             System.out.println("The Factorial of Number is :"+fact);
        }
    }

}*/


// For Larger values 

import java.util.Scanner;
import java.math.BigInteger;

public class Factoial_14{
    public static void mian(String [] args){
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer ");
        answer=sc.nextInt();
        sc.close();
        BigInteger obj1 = new BigInteger("1");
        BigInteger obj2 = new BigInteger("1");

        for(int i=1;i<=answer;i++){
            obj1=obj2.multiply(obj2);
            obj2=obj1.add(BigInteger.ONE);

        }
     System.out.println(answer+"! ="+obj1);
    }
}
