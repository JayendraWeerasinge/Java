import java.util.Scanner;
public class calculator{
	
	public static void main (String[]args) {
		try {
		Scanner sl=new Scanner(System.in);
		
		System.out.print("Enter the first number");
		float x=sl.nextFloat();
		
		System.out.print("Enter the first number");
		float y=sl.nextFloat();
		
		System.out.print("Enter the operator");
		char operator=sl.next().charAt(0);
		
		switch (operator){
			
			case '+':
			float a= x+y;
			System.out.print("The addition of the number is "+a);
			break;
			
			case '-':
			float s= x-y;
			System.out.print("The subtraction of the number is "+s);
			break;
			
			case '*':
			float m= x*y;
			System.out.print("The multiplication of the number is "+m);
			break;
			
			case '/':
			
				float d= x/y;
			System.out.print(" "+d);
				
			break;
			
			default:
			System.out.print("Invalid operation");
			
			
		} 
		}
	catch (Exception e){
			System.out.print("Infinity"+e);
			}
		}
}
