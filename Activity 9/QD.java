import java.util.Scanner;
public class QD{
	public static void main(String args[]){
	int a=0;
	int b=0;
	Scanner sl=new Scanner(System.in);
	
	System.out.println("Enter the  first number between 50 and 100:");
		int p=sl.nextInt();
	System.out.println("Enter the  second number between 50 and 100:");
		int q=sl.nextInt();
	
	
		if (p<50 || q>100){
		   
	    a = p % 10;
	    b = q % 10;
	   p= p/10;
	   q= q/10;
	   if (p == q || p == b || a == q || a == b){
		   System.out.println("true");
	   }
		else
			System.out.println("false");
		}
	}
}