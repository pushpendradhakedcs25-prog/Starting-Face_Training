package PatternPrinting;

import java.util.Scanner;

public class InversePyrmidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num=sc.nextInt();
        for (int i=1; i<=num;i++){
            for(int j=i; j<num; j++) System.out.print(" ");
            for(int k=1; k<=(2*i-1); k++) System.out.print(" *");
            System.out.println();
            }
        }

    }

