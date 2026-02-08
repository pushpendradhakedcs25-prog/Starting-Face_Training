package PatternPrinting;

import java.util.Scanner;

 class InvertLeftAligned_Triangle {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number :- ");
         int  a=sc.nextInt();
         for(int i=0; i<a; i++){
             for(int j=i; j<a; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }

     }
