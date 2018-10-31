package javaapplication4;

import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class JavaApplication4 
  {
  public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
                       System.out.print("Enter Numenator = ");
             while(!input.hasNextDouble())
                {
                       System.out.println("Enter a Number !");
                       System.out.print("Enter Numenerator = ");
                       input.next();
                }
                double num1=input.nextDouble();
       
                double num2 ;
             do {
                       System.out.print("Enter Denominator expect Zero = ");
             while(!input.hasNextDouble())
                {
                       System.out.println("Enter a Number! :");
                       System.out.print("Enter Denominator  = ");
                       input.next();
                }   
                       num2=input.nextDouble ();
                }
             while(num2 == 0);
               
                double r=num1/num2;
                       System.out.println("THE Result = "+ r);
                    
    }

   
    }
  
