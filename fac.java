package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
     public static void repeat(int s){
           Scanner input = new Scanner(System.in);
        if(s>=5){
                    System.out.print("** press 0 to Exit or any number to continue*** \n Entre :: ");
                    while(!input.hasNextDouble())
                          {                        
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                          }
            int y=input.nextInt();
             if(y==0)
                 System.exit(0);
             
         }
     }
    public static double fact(int n)
    {
         if(n==1||n==0)
            return 1;
      double  result = fact(n-1) * n;
        return result;
    }
 public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        int x=1;
    do{
       int b=1,i=1;
       int number;
              do{  
                     repeat(b);
                     System.out.print("Enter a Number Positive integer ! \n enter integer number ::");
                   while(!input.hasNextInt())
                        { 
                            repeat(b);
                            System.out.print("Enter a Number Positive integer ! \n enter integer number :: ");
                            input.next();
                            b++;
                        }
                    number=input.nextInt();       
                  b++;   
               }while(number < 0);       
            double r=fact(number);
                System.out.println(number+"! = "+ r); 
                System.out.println("**** Entre 1 to To calculate another number or any number to Exit *****");       
           //b=0;
               // repeat(b);
           while(!input.hasNextDouble())
                          {   
                             
                               
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                     //     b++;
                          }
                
          x=input.nextInt();
        }while(x==1);
    System.out.println("****Thanks***");
                                        }
                                       }