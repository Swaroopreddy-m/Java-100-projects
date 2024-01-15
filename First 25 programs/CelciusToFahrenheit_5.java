 
 // To convert fahrenheit to celcius temperature

 import java.util.Scanner;


public class CelciusToFahrenheit_5 {
    public static void main(String [] args){                                  //Declaration of main method
        
        float temperature;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Value In Fahrenheit Temparature :");
        temperature = sc.nextFloat();

        temperature = ((temperature - 32)*5)/9;
        System.out.println("The celcius is :"+temperature);
        sc.close();
    }
    
}
