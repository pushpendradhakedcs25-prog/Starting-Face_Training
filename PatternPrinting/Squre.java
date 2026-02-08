package PatternPrinting;

import java.util.Scanner;
class Squre{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Square Matrix order:- ");
    int a = sc.nextInt();

    for(int i=0; i<a; i++){
        for(int j=0; j<a; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}}