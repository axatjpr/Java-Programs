 import java.util.Scanner;

class OperatorExample{  
public static void main(String args[]){  
	Scanner sc =new Scanner(System.in);
int a=sc.nextint();  
int b=sc.nextint(); 
int c=sc.nextint();
int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
System.out.println(d);  
}}  