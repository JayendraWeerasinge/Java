import java.util.Scanner;

public class convert{
	public static void main(String[]args){
		
		long  bin, remainder;
		long decimal=0,p=1;
		
		Scanner s2=new Scanner(System.in);
		
		System.out.println("Enter the first binary number");
		bin=s2.nextLong();
		
	while (bin != 0){
		remainder= bin%10;
		decimal=decimal+remainder*p;
		p=p*2;
		
		bin=bin/10;
		
		 
	}
	System.out.println("The decimal nember is "+decimal);	
		
	}

}