import java.util.*;
class Array_matrix{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int arr[ ][ ] = new int[3][3];

int rows= arr.length;
int col = arr[0].length;
for (int i=0; i<rows; i++){
	for(int j=0; j<col; j++){
arr[i][j]= sc.nextInt();}}



for(int i=0; i<rows; i++){
     for(int j=0; j<col; j++){
	     System.out.print(arr[i][j]+" ");}
		 System.out.println( );
		 }}}
