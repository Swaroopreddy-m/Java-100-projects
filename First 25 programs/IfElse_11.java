
import java.util.Scanner;
public class IfElse_11{
     static int Passmarks=40;
     
    public static void main(String []args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Your Marks :");
       int usermarks = sc.nextInt();

       if(usermarks >= Passmarks){
        System.out.println("Good You Are Passed ");
       }else{
        System.out.println("You Failed ");
       }
       sc.close();
    }
}