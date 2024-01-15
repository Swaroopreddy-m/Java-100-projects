
import java.util.Scanner;
public class MultiplicationTable_25 {
    public static void main(String [] args){
     int table;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any table you want");
        table = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table+" * "+i+" = "+(table*i));
        }
        sc.close();
    }
}
