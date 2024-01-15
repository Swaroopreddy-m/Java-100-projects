
//Program used to find even and odd number.

import java.util.Scanner;
public class EvenOrOdd_13 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number from 0 to 128 to find it even or odd ");
        number = sc.nextInt();
        sc.close();
        if(number % 2 == 0){
            System.out.println("Entered Number is Even Number ");
        }else{
            System.out.println("Enteded Number is Odd Number ");
        }

    }
}
