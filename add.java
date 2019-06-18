import java.util.Scanner;

public class add{
	public static void main(String []args){
		Scanner s1=new Scanner(System.in);
		int x=0;
		int y=0;
		int arr[]=new int[10];
		
		System.out.print("Enter binary number one: ");
		long one=s1.nextLong();
		System.out.print("Enter binary number two: ");
		long two=s1.nextLong();
		
		while(one!=0 || two!=0){
			arr[x++]=(int)((one%10+two%10+y)%2);
			y=(int)((one%10+two%10+y)/2);
			one=one/10;
			two=two/10;	
		}
		if(y!=0){
			arr[x++]=y;
		}
		--x;
		System.out.print("addition : ");
		while(x>=0){
			System.out.print(arr[x--]);
		}
		System.out.print("\n");
	}
}