package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner (System.in);
        System.out.println("What are you converting to? C for Celsius and F for Fahrenheit.");
        String unit = input1.nextLine();

        if(unit.equals("C")){
            Scanner input2 = new Scanner (System.in);
            System.out.println("Enter a number in Fahrenheit: ");
            int fahr = input2.nextInt();

            int temp = fahr - 32;
            double c = temp*0.5555555556;

            System.out.println("After converting it comes out to " + c + " degrees celsius.");

        }
        else if(unit.equals("F")){
            Scanner input3 = new Scanner (System.in);
            System.out.println("Enter a number in Celsius: ");
            int cels = input3.nextInt();

            int calc = 9/5;
            int temp = cels * calc;
            int f = temp - 32;

            System.out.println("After converting it comes out to " + f + " Degrees fahrenheit.");

        }
    }
}
