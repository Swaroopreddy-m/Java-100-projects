
// The programs shows the break keyword uses.If the user Gives 0 then the integer asking program should stop.

import java.util.Scanner;
public class WhileLoop_21{
    public static void main(String [] args){
int n;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter Any integer");
            n = sc.nextInt();
            
            if(n==0){
                break;
            }
            System.out.println("Entered Integer :"+n);
        }
          sc.close();
        }

        }
    


