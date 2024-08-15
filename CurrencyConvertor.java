//basic program 

import java.util.Scanner;
class CurrencyConvertor{
    public static void main (String args[]){
        System.out.println("1 Rupees");
                System.out.println("2 DOller");
                  System.out.println("3 Euro");
           Scanner sc=new Scanner(System.in);
           System.out.println("Choose the currency");
           int choice = sc.nextInt();
           System.out.println("Enter the amount : ");
           double amount=sc.nextDouble();
           
           switch(choice){
               case 1:
                Rupee_To_Other(amount);
                   break;
               case 2: 
                   Doller_To_Other(amount);
                   break;
               case 3:
                   Euro_To_Other(amount);
                   break;
                   
           }
           
    }
    
     static void Rupee_To_Other(double amt){
        System.out.println("1 Rupee =" + 0.012 + " Doller");
        System.out.println(amt+" Rupee =" + (amt*0.012)+" Doller");
        
       System.out.println("1 Rupee="+0.011+"Euro");
        System.out.println(amt+" Rupee "+(amt*0.011)+" Euro");
    }       
     static  void Doller_To_Other(double amt){
         System.out.println("1 doller = "+ 83.95 + "Rupee");
         System.out.println(amt+ " Doller "+(amt*83.95)+ "Rupee");
         System.out.println();
         System.out.println("1 doller ="+ 0.91+ " Euro" );
         System.out.println(amt+" doller="+ (amt*0.91)+" Euro");
     }
                static void Euro_To_Other(double amt){
                    System.out.println("1 Euro"+92.45+"rupee");
                    System.out.println(amt+"Euro"+(amt*92.45)+"Rupee");
                    
                    System.out.println("1 Euro " + 1.10+ " Doller");
                    System.out.println(amt+"Euro"+(amt*1.10)+"Doller");
                }
            
    
}
