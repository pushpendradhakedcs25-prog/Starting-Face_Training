package PatternPrinting;

import java.util.Scanner;
class Rectangle{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int a= sc.nextInt();
        for(int i=0; i<a-2; i++){
            for(int j=0; j<a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
