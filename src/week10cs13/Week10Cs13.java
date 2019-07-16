package week10cs13;

import java.util.Scanner;

public class Week10Cs13 {
    //task1:
    public static void sayHello()
    {
    System.out.println("Hello");
    }
     
    //task2:
    public static void main(String[] args)
    {
        int x = 8;
        showValue(x);
    }
    public static void showValue(int x){
        System.out.println("x = " + x );
    }
    
    //task3:
    public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);
        double total, value1, value2;
        System.out.print("Enter first number: ");   
        value1 = keyIn.nextDouble();
        System.out.print("Enter second number: ");
        value2 = keyIn.nextDouble();
        
        total = timesTwo(value1, value2);
        System.out.println("The total multiplied is: " + total);

                
    }
    public static double timesTwo(double num, double num1)
    {
        double result;
        result = num * num1;
        return result;
     }
     
    //task4:
     public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);
        double total, value1, value2;
        System.out.print("Enter first number: ");   
        value1 = keyIn.nextDouble();
        System.out.print("Enter second number: ");
        value2 = keyIn.nextDouble();
        
        total = half(value1, value2);
        System.out.println((int)value1 + " + " + (int)value2 + " then /2 " + total);

                
    }
       public static int half(double num, double num1){
           double result;
           result = (num + num1) / 2.0;
           return (int) result;
       }   
      
}
    
    

