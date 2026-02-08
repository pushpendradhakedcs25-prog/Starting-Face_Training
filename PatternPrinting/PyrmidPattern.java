package PatternPrinting;

import java.util.Scanner;
public class PyrmidPattern {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        for(int i=0; i<num; i++){
            for(int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
