
//the program used to know how the continue and bread statements work.
import java.util.Scanner;

public class WhileLoopContinueAndBreak_22 {
    public static void main(String [] args){
        int n;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter any Integer");
            n=sc.nextInt();
            if(n!=0){
                System.out.println("Enter any Integer");
            n=sc.nextInt();
            continue;
            }else{
                break;
            }
            }
            sc.close();
        }

    }

