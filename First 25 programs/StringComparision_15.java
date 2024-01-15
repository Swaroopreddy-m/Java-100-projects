
// The Program is used to compare the strings.

import java.util.Scanner;

public class StringComparision_15 {
    public static void main(String[] args) {
        String answer1,answer2;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Two Strings ");
        answer1 = sc.nextLine();
        answer2 = sc.nextLine();
         sc.close();
        if(answer1.compareTo(answer2)>0){                                      // The compareTo word is used to compare two strings.
           System.out.println("Entered First String is Greater :"+answer1);
        }else if(answer1.compareTo(answer2)<0){
            System.out.println("Entered Second String is Greater :"+answer2);
        }else{
            System.out.println("Both Strings are Equal");
        }
        
    }
}
