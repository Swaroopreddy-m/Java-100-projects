
// Using nested if else program to demonistrate fail and pass with grading sytem 

import java.util.Scanner;

public class NestedIfElse_12 {
    public static void main(String[] args) {
        int passmarks =40;
        int usermarks;
        char Grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks Obtained By You :");
        usermarks =sc.nextInt();
        sc.close();
        if(usermarks>=passmarks){                                // The if Statement Contains more if statements inside.It is known as nested if. 
            if(usermarks>=90){
                Grade = 'A';
                System.out.println("You passed the Examination With Grade :"+Grade);
            }else if(usermarks>=80){
                Grade = 'B';
                System.out.println("You passed the Examination With Grade :"+Grade);
            }else if(usermarks>=70){
                Grade = 'c';
                System.out.println("You passed the Examination With Grade :"+Grade);
            }else{
                Grade = 'D';
                System.out.println("You passed the Examination With Grade :"+Grade);
            }

         
        }else{
            Grade ='F';
            System.out.println("You Failed In Your Examinaiton And Grade Is :" +Grade);
        }
    }
}
