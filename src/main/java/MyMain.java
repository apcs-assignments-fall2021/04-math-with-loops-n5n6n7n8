import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double ans = 1;
        for(double i=1; i<x+1; i++)
        {
            ans=ans*i;
        }
        return ans;
    }
    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double evalue = 0;
        for(int i=0; Math.abs(evalue-Math.E)>0.00000000001; i++)
        {
            evalue+=1/factorial(i);
        }

        return evalue;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 10;
        double m = 0;
        for(int i=0; i<500; i++)
        {
            m = (n+x/n)/2;
            if(Math.abs(m-n)<0.00001)
            {
                break;
            }
            n = m;
        }
        return m;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number.");
        int number = scan.nextInt();
        System.out.println("The square root of your number is approximately " + babylonian(number));
        System.out.println("The value of e is approximately " + calculateE());
        scan.close();
    }
}
