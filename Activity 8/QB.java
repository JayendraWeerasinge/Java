import java.util.Scanner;
public class QB{
public static void main(String[]args){
	Scanner sl=new Scanner(System.in);
	
	
	System.out.println("...............Time converter...............");
	
	System.out.println("01.Convert seconds in to hours");
	System.out.println("02.Convert minutes in to seconds");
	System.out.println("Enter the option");
	int p=sl.nextInt();
	
	switch(p){
		case 1:
		System.out.println("Enter seconds");
		float h=sl.nextInt();
		float s=h/3600;
		float m=h/60;
		float x=h*1;
			System.out.println("hours"+s);
			System.out.println("minutes"+m);
			System.out.println("seconds"+x);
	break;
		
		case 2:
		System.out.println("Enter minutes");
		int y=sl.nextInt();
		int z=y*60;
			System.out.println("seconds"+z);
	
		
		
		
	}
	
	
	



}

}