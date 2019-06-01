import java.util.Scanner;
public class QA{
public static void main(String[]args){
	Scanner sl=new Scanner(System.in);

	System.out.println("Enter a number");
	int p=sl.nextInt();

	System.out.println("Enter a number");
	int q=sl.nextInt();
	
	System.out.println("Enter a number");
	int r=sl.nextInt();
	
	if(p==q && p==r && q==r){
		System.out.println("TRUE");
	}
	else if (q==p && q==r){
		System.out.println("TRUE");
	}
	else if (p==r && q==r){
		System.out.println("TRUE");
	}
}

}