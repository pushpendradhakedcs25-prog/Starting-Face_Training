import java.sql.SQLOutput;
import java.util.Scanner;
class Array{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter row :- ");
		int row = sc.nextInt();
		System.out.println("Enter col :- ");
		int col = sc.nextInt();
		int [][]arr = new int[row][col];
		int []array = new int[row*col];
		while(row<=0||col<=0){
			System.out.println("Invalid");
			return ;
		}
		System.out.println("Enter arrays Element:- ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("....................................................");
		System.out.println("2D array :- ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("......................................................");
		System.out.println("2D to 1D Convert:- ");
		for(int i=0; i<row*col; i++){
			for(int j=0; j<col; j++){
			array[i]=arr[i][j];
			System.out.print(array[i]+" ");
		}}
		System.out.println();
	}}