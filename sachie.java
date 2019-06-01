import java.util.Scanner;
public class sachie{

public static void main(String args[]){
Scanner sl=new Scanner(System.in);
cal c1=new cal();

System.out.println("Enter a number one:");
			int x=sl.nextInt();
	
	
			System.out.println("Enter a number two:");
			int y=sl.nextInt();
			

System.out.println("Calculator");

System.out.println("01.Addition");

System.out.println("02.substraction");

System.out.println("03.Multiplication");

System.out.println("04.Division");

System.out.println("05.Reverse");

System.out.println("Enter an option");
int opr=sl.nextInt();


		
		switch (opr){
			case 1:
			System.out.println(c1.add(x,y));
			break;
			
			case 2:
			System.out.println(c1.sub(x,y));
			break;
			
			case 3:
			System.out.println(c1.multi(x,y));
			break;
			
			case 4:
			System.out.println(c1.div(x,y));
			break;
			
		/*	case 5:
			System.out.println(c1.rev(x));
			break;*/
			
			
			
			
		}
}

}