package PatternPrinting;

import java.util.Scanner;

public class LeftAligned_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int  a=sc.nextInt();
        for(int i=0; i<a; i++){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
