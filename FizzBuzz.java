import java.util.Scanner;
class FizzBuzz{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enetr size ");
int num = sc.nextInt();
while(num<=0){
System.out.println("Invalid Statement");
return ; }
String []result= new String[num];
for(int i=0; i<num; i++){
result =sc.nextLine();}
for(int i=1; i<=num; i++){
if(num%3==0&&num%5==0){
result[i]="FizzBuzz";}
else if(num%3==0){
     result[i]="Fizz";
	 }
	 else if(num%5==0){
     result[i]="Buzz";
}
	 else{
	 result[i]=result[i];}
}result[i]=value.OfString(i);
	 for(int i=0; i<num; i++){
System.out.println(Arrays.toStringt[result]);}}}