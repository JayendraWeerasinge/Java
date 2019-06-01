import java.util.Scanner;
public class EQ{
public static void main(String[]args){
	Scanner sl=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int p=sl.nextInt();
	
	System.out.println("Enter a number");
	int q=sl.nextInt();
	
	System.out.println("Enter a number");
	int r=sl.nextInt();
	
	System.out.println("Add 1st and 2nd number");
	System.out.println("Add 1st and 3rd number");
	System.out.println("Add 3rd and 2nd number");
	
	System.out.println("Enter option");
	int f=sl.nextInt();
	switch(f){
	
	case 1:
		int x=p+q;
		if(x==r){
		System.out.println("True");}
	System.out.println(x);
		
	break;
	
	case 2:
		int y=p+r;
		if(y==r){
		System.out.println("True");}
	System.out.println(y);
		
	break;
	
	case 3:
			int z=r+q;
			if(z==r){
			System.out.println("True");}
	System.out.println(z);
	break;
		}
	
	
	
	

	
	
	
	
	
	
	}
	
}




