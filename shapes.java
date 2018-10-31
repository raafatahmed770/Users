package pro2;
import java.util.Scanner;
public class Pro2 {
   public static void unit( ){
    
        System.out.println("********************");
        System.out.println(" Select unit length measurement !!");
        System.out.println(" 1- Centimeter");
        System.out.println(" 2- metre");
        System.out.println(" 3- kilometre");
        System.out.println("********************"); 
    System.out.println("Select unit length measurement !! Entre 1 , 2 OR 3 :");
    System.out.print("Entre :: ");}
    public static void area_premetre(){
          System.out.println("********************");
        System.out.println(" choose 1 , 2 or 3 !!");
        System.out.println(" 1- Area");
        System.out.println(" 2-premetre ");
        System.out.println(" 3- Area and premetre");
        System.out.println("********************");
      }
   public static void area_size(){
          System.out.println("********************");
        System.out.println(" choose 1 , 2 or 3 !!");
        System.out.println(" 1- Area");
        System.out.println(" 2-size ");
        System.out.println(" 3- Area and size");
        System.out.println("********************");
      }
   //function 1 squara ....
    public static void square(double x)
            { 
                    Scanner input=new Scanner(System.in);            
                            System.out.println("****Square****");
                        int n;
                         
                        unit();
                         
                         while(!input.hasNextDouble())
                {
                       System.out.println("Enter a Number !");
                       System.out.print("Enter again = ");
                       input.next();
                }
                        int u1=input.nextInt();
                            System.out.println("********************"); 
                            System.out.print("Entre Length of the side : : ");
                           while(!input.hasNextDouble())      
                           {   
                               System.out.println("Enter a Number except 0 or minse !"); 
                               System.out.print("Enter again = ");
                               input.next();
                           }
                           x=input.nextDouble();
                           
                         
                 switch(u1){
                             case 1:{System.out.println("Length= "+x+" Cm");break;}
                             case 2:{x=x*100;
                                     System.out.println("Length= "+x+"Cm");break;}
                             case 3:{x=x*100000;
                                     System.out.println("Length= "+x+" Cm");break;}
                            default:{System.out.println("Length= "+x+" Cm");break;}
                            }     
                        double area= x*x;
                        double pra=x*4;
                         area_premetre();
                          while(!input.hasNextDouble())
                          {                        
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                          }
                          
                            n=input.nextInt();    
                 switch(n){
                            case 1:{System.out.println(" ** Area of Shape ** ");
                                       System.out.println("Area= "+area +" Cm2");
                                       System.out.println("Area= "+area/100 +" M2");
                                       System.out.println("Area= "+area/100000 +" Km2");
                                        break;}
                            case 2:{System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                       
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;}
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;
                                }
                            default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");break;}
                          }
                }
            
            
    //function 2 Rectangle .... 
    public static void Rectangle(double x,double y)
                {
                        Scanner input=new Scanner(System.in);            
                           System.out.println("**** Rectangle ****");
                        
                        unit();
                            while(!input.hasNextDouble())                
                            {                      
                                System.out.println("Enter a Number !");     
                                System.out.print("Enter again = ");         
                                input.next();              
                            }  
                         int u1=input.nextInt();
                           System.out.println("********************"); 
                           System.out.print("Entre Length : ");
                          while(!input.hasNextDouble()||x<=0)                 
                          {
                              System.out.println("Enter a Number !");     
                              System.out.print("Enter again = ");         
                              input.next();        
                          }  
                        x=input.nextDouble();
                    switch(u1){
                            case 1:{System.out.println("Length= "+x+" Cm");break;}
                            case 2:{x=x*100;
                                    System.out.println("Length= "+x+"Cm");break;}
                            case 3:{x=x*100000;
                                    System.out.println("Length= "+x+" Cm");break;}
                            default:{
                                    System.out.println("Length= "+x+" Cm");break;}
                               }
                    System.out.println("**********");
                            System.out.println(" Select unit length measurement !!");
                            System.out.println(" 1- Centimeter");
                            System.out.println(" 2- metre");
                            System.out.println(" 3- kilometre");
                            System.out.println("********************"); 
                            System.out.println("Select unit Wide measurement!! Entre 1 , 2 OR 3 :");
                            System.out.print("Entre :: ");
                          while(!input.hasNextDouble())                 
                          {                        
                              System.out.println("Enter a Number !");
                              System.out.print("Enter again = ");
                              input.next();
                          }  
                         int u2=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre Wide : ");
                          while(!input.hasNextDouble())                 
                          {       
                              System.out.println("Enter a Number !");   
                              System.out.print("Enter again = ");    
                              input.next(); 
                          }  
                         y=input.nextDouble();
                    switch(u2){
                                case 1:{System.out.println("Wide = "+y+" Cm");break;}
                                case 2:{y=y*100;
                                    System.out.println("Wide = "+y+"Cm");break;}
                                case 3:{y=y*100000;
                                    System.out.println("Wide = "+y+" Cm");break;}
                                 default:{System.out.println("Wide = "+y+" Cm");break;}
                              }
                        double area= x*y;
                        double pra=(x+y)*2;
                         
                        unit();
                        area_premetre();
                          while(!input.hasNextDouble())
                          {
                              System.out.println("Enter a Number !");
                              System.out.print("Enter again = ");
                              input.next();
                          }  
                         
                         int n=input.nextInt();
                         
                    switch(n){
                                case 1:{System.out.println(" ** Area of Shape ** ");
                                        System.out.println("Area= "+area +" Cm");
                                        System.out.println("Area= "+area/100 +" M");
                                        System.out.println("Area= "+area/100000 +" Km");break;
                                       }
                                case 2:{System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                       
                                        System.out.println("Perimeter= "+pra/100000 +" Km");break;
                                       }
                                case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;
                                }
                                default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;}
                             }
                }
    //function 3 Cuboid ....  
    
public static void Cuboid(double x,double y,double z)
        {
                       Scanner input=new Scanner(System.in);            
                            System.out.println("**** Cuboid ****");
                            
                           
                            unit();
                          while(!input.hasNextDouble()) 
                          {
                              System.out.println("Enter a Number !"); 
                              System.out.print("Enter again = ");
                              input.next();
                          }  
                        int u1=input.nextInt();
                           System.out.println("********************"); 
                           System.out.print("Entre Length : ");
                          while(!input.hasNextDouble())
                          {
                              System.out.println("Enter a Number !");
                              System.out.print("Enter again = ");
                              input.next();
                          }  
                        x=input.nextDouble();
                    switch(u1){
                            case 1:{System.out.println("Length= "+x+" Cm");break;}
                            case 2:{x=x*100;
                                    System.out.println("Length= "+x+"Cm");break;}
                            case 3:{x=x*100000;
                                    System.out.println("Length= "+x+" Cm");break;}
                            default:{
                                    System.out.println("Length= "+x+" Cm");break;}
                               }
                           
                    unit();    
                     while(!input.hasNextDouble())                
                     {                       
                         System.out.println("Enter a Number !");                       
                         System.out.print("Enter again = ");                      
                         input.next();                
                     }  
                        int u2=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre Wide : ");
                          while(!input.hasNextDouble())               
                          {
                              System.out.println("Enter a Number !");              
                              System.out.print("Enter again = ");                  
                              input.next();  
                          }  
                        y=input.nextDouble();
                    switch(u2){
                                case 1:{System.out.println("Wide = "+y+" Cm");break;}
                                case 2:{y=y*100;
                                    System.out.println("Wide = "+y+"Cm");break;}
                                case 3:{y=y*100000;
                                    System.out.println("Wide = "+y+" Cm");break;}
                                 default:{System.out.println("Wide= "+y+" Cm");break;}
                              }
                    
                    
                    unit();
                     while(!input.hasNextDouble())          
                     {                      
                         System.out.println("Enter a Number !");                      
                         System.out.print("Enter again = ");                       
                         input.next();           
                     }  
                        int u3=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre Heigh : ");
                          while(!input.hasNextDouble())                
                          { 
                              System.out.println("Enter a Number !");               
                              System.out.print("Enter again = ");                  
                              input.next();             
                          }  
                         z=input.nextDouble();
                 switch(u3){
                                case 1:{System.out.println("High = "+z+" Cm");break;}
                                case 2:{z=z*100;
                                    System.out.println("High = "+z+"Cm");break;}
                                case 3:{z=z*100000;
                                    System.out.println("High = "+z+" Cm");break;}
                                 default:{System.out.println("High = "+z+" Cm");break;}
                            }
                       double area= (2*x*y)+(2*z*y)+(2*x*z);
                       double siz=x*y*z;
                            System.out.println("**********");
                            System.out.println("1- Area of Shape ");
                            System.out.println("2- Size of Shape ");
                             System.out.println("3- Area and Size of Shape ");
                            System.out.println("**********");
                            System.out.print("Choose number 1 , 2 OR 3 :: ");
                         while(!input.hasNextDouble())                 
                         {
                             System.out.println("Enter a Number !");   
                             System.out.print("Enter again = ");   
                             input.next();  
                         }  
                      area_size();
                         int n=input.nextInt();    
                 switch(n){
                    case 1:{System.out.println("**Area of Shape**");
                            System.out.println("Area= "+area +" Cm");
                            System.out.println("Area= "+area/100 +" M");
                            System.out.println("Area= "+area/100000 +" Km");break;
                           }
                    case 2:{System.out.println("**Size of Shape** ");
                            System.out.println("Size= "+ siz );break;
                           }
                    case 3:{System.out.println("  ** Area and Size of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Size of Shape ** ");
                                        System.out.println("Size= "+siz +" Cm3");                       
                                        System.out.println("Size= "+siz/100 +" M3");                      
                                        System.out.println("Size= "+siz/100000 +" Km3");
                                        break;
                                }
                    default:{System.out.println("High = "+z+" Cm");}
                          } 
        }
    //function 4 Cube ....  
    public static void Cube(double x)
            {
                        Scanner input=new Scanner(System.in);            
                            System.out.println("**** Cube ****");
                    
                            unit();
                       while(!input.hasNextDouble())                
                       {
                           System.out.println("Enter a Number !");   
                           System.out.print("Enter again = ");       
                           input.next();   
                       }  
                        int u1=input.nextInt();
                            System.out.println("********************"); 
                            System.out.print("Entre Length of the side : : ");
                         while(!input.hasNextDouble())                
                         {
                             System.out.println("Enter a Number !"); 
                             System.out.print("Enter again = ");  
                             input.next();  
                         }   
                        x=input.nextDouble();
                   switch(u1){
                               case 1:{System.out.println("L = "+x+" Cm");break;}
                               case 2:{x=x*100;
                                       System.out.println("L = "+x+"Cm");break;}
                               case 3:{x=x*100000;
                                       System.out.println("L = "+x+" Cm");break;}
                              default:{System.out.println("Length = "+x+" Cm");break;}
                             }
                            
                         double area= 6 * x * x ;
                         double siz= x * x * x ;
                         area_size();    
                         while(!input.hasNextDouble())           
                         {
                             System.out.println("Enter a Number !");
                             System.out.print("Enter again = ");
                             input.next(); 
                         }  
                         area_size();
                         int n=input.nextInt();    
                   switch(n){
                               case 1:{System.out.println("**Area of Shape**");
                                       System.out.println("Area= "+area +" Cm");
                                       System.out.println("Area= "+area/100 +" M");
                                       System.out.println("Area= "+area/100000 +" Km");break;
                                      }
                               case 2:{System.out.println("**Size of Shape** ");
                                       System.out.println("Size= "+ siz );break;
                                      }
                                case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Size of Shape ** ");
                                        System.out.println("Size= "+siz +" Cm3");                       
                                        System.out.println("Size= "+siz/100 +" M3");                      
                                        System.out.println("Size= "+siz/100000 +" Km3");
                                        break;
                                }
                              default:{System.out.println("Size= "+siz+" Cm");}
                            } 
            }
    //function 5 Parallelogram ....
    public static void Parallelogram(double x,double y)
                        {
                            Scanner input=new Scanner(System.in);            
                                    System.out.println("**** Parallelogram ****");
                            
                                    unit();
                                     while(!input.hasNextDouble())              
                                     { 
                                         System.out.println("Enter a Number !");  
                                         System.out.print("Enter again = "); 
                                         input.next(); 
                                     }  
                        int u1=input.nextInt();
                           System.out.println("********************"); 
                           System.out.print("Entre Length of base : ");
                          while(!input.hasNextDouble())
                          {                
                              System.out.println("Enter a Number !");                 
                              System.out.print("Enter again = ");
                              input.next();  
                          }  
                         x=input.nextDouble();
                    switch(u1){
                            case 1:{System.out.println("Length of base= "+x+" Cm");break;}
                            case 2:{x=x*100;
                                    System.out.println("Length of base= "+x+"Cm");break;}
                            case 3:{x=x*100000;
                                    System.out.println("Length of base= "+x+" Cm");break;}
                            default:{
                                    System.out.println("Length of base= "+x+" Cm");break;}
                               }
                 
                    unit();
                     while(!input.hasNextDouble()) 
                     {
                         System.out.println("Enter a Number !");  
                         System.out.print("Enter again = ");
                         input.next(); 
                     }  
                        int u2=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre high :  ");
                          while(!input.hasNextDouble())          
                          {
                              System.out.println("Enter a Number !");
                              System.out.print("Enter again = "); 
                              input.next();
                          }  
                         y=input.nextDouble();
                    switch(u2){
                                case 1:{System.out.println("High = "+y+" Cm");break;}
                                case 2:{y=y*100;
                                    System.out.println("High = "+y+"Cm");break;}
                                case 3:{y=y*100000;
                                    System.out.println("High = "+y+" Cm");break;}
                                 default:{System.out.println("High = "+y+" Cm");break;}
                              }
                                    
                                   
                             double area = x * y ;
                             double pra  =( x + y ) * 2 ;
                                    area_premetre();
                            while(!input.hasNextDouble())                 
                            {                        
                                System.out.println("Enter a Number !");
                                System.out.print("Enter again = ");
                                input.next();
                            }  
                        
                            int n=input.nextInt();    
                        switch(n){
                            case 1:{System.out.println(" ** Area of Shape ** ");
                                    System.out.println("Area= "+area +" Cm2");
                                       System.out.println("Area= "+area/100 +" M2");
                                       System.out.println("Area= "+area/100000 +" Km2");
                                    }
                            case 2:{System.out.println(" ** Perimeter of Shape ** ");
                                    System.out.println("Perimeter= "+pra +" Cm");
                                    System.out.println("Perimeter= "+pra/100 +" M");
                                    System.out.println("Perimeter= "+pra/100000 +" Km");break;
                                   }
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;
                                }
                           default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km"); break;
                                   }
                         }   
                        }
     //function 1 squara ....
    public static void circal(double r)
            { 
                    Scanner input=new Scanner(System.in);            
                            System.out.println("****Square****");
                        int n;
                         
                        unit();
                         
                         while(!input.hasNextDouble())
                {
                       System.out.println("Enter a Number !");
                       System.out.print("Enter again = ");
                       input.next();
                }
                        int u1=input.nextInt();
                            System.out.println("********************"); 
                            System.out.print("Entre Radius : : ");
                           while(!input.hasNextDouble())      
                           {   
                               System.out.println("Enter a Number !"); 
                               System.out.print("Enter again = ");
                               input.next();
                           }  
                         r=input.nextDouble();
                 switch(u1){
                             case 1:{System.out.println("Radius= "+r+" Cm");break;}
                             case 2:{r=r*100;
                                     System.out.println("Radius= "+r+"Cm");break;}
                             case 3:{r=r*100000;
                                     System.out.println("Radius= "+r+" Cm");break;}
                            default:{System.out.println("Radius= "+r+" Cm");break;}
                            }     
                        double area=3.14*r*r;
                        double pra=.5*r*r;
                         area_premetre();
                          while(!input.hasNextDouble())
                          {                        
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                          }
                          
                            n=input.nextInt();    
                 switch(n){
                            case 1:{System.out.println(" ** Area of Shape ** ");
                                       System.out.println("Area= "+area +" Cm2");
                                       System.out.println("Area= "+area/100 +" M2");
                                       System.out.println("Area= "+area/100000 +" Km2");
                                        break;}
                            case 2:{System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                       
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;}
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");
                                        break;
                                }
                            default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                        System.out.println("Area= "+area +" Cm2");
                                        System.out.println("Area= "+area/100 +" M2");
                                        System.out.println("Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Perimeter of Shape ** ");
                                        System.out.println("Perimeter= "+pra +" Cm");                       
                                        System.out.println("Perimeter= "+pra/100 +" M");                      
                                        System.out.println("Perimeter= "+pra/100000 +" Km");break;}
                          }
                }
            
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x=1,y=1,z=1,r=1;
        int num,h;       
        do{
                   System.out.println("***************************************");
                   System.out.println("1- Square ");
                   System.out.println("2- Rectangle");
                   System.out.println("3- Cuboid");
                   System.out.println("4- Cube ");
                   System.out.println("5- Parallelogram");
                   System.out.println("6- circal");
                   System.out.println("***************************************");
                   System.out.print("Choose number from Last shaps :");
                num=input.nextInt();
            switch(num){
                case 1:{square(x); break; }
                case 2:{Rectangle( x, y);break; }
                case 3:{Cuboid(x,y,z);break; }
                case 4:{Cube(x);break; }
                case 5:{Parallelogram(x,y);break; }
                case 6:{circal(r);break;}
                default:{ System.out.println("errer ");break;}
            }
         System.out.println("you want exit ?? ");
         System.out.println("press 1 to continue");   
           while(!input.hasNextDouble())                 
           {              
               System.out.println("Enter a Number ( 1  to continue or any number to Exit)!");
               System.out.print("Enter again = ");
               input.next(); 
           } 
       h=input.nextInt();
     
        }while(h==1);
    System.out.println("Thanks For Using Our Program ..Users Team ..");
    }
    
}
