
// Finding a largest number amoung three numbers;

import java.util.Scanner;


public class LargestNum_9{
    public static void main(String [] args){
        int a,b,c;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
       
         if(a>b && a>c){
         System.out.println("Entered Largest Number is :"+a);
        }else if(b>c && b>a){
            System.out.println("Entered Largest Number is :"+b);
        }else if(c>a && c>b){
            System.out.println("Entered Largest Number is :"+c);
        }else{
            System.out.println("Entered Number is distinct");
        }

    }
}