
// Program is used to print entered number in reverse

import java.util.Scanner;

public class ReverseNum_20 {
    public static void main(String[] args) {
         int n;
        int reverse=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to show in reverse ");
        n = sc.nextInt();
        sc.close();
        
        while(n !=0){
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
     System.out.println("Entered number reverse form is :"+reverse);
    }
}
