import java.util.Scanner;

public class mycalc{
	
		float x,y,z;
	float add1,sub1,div1,mul1;
	public float add(float x,float y){
		float add1 = x+y;
		return add1;
	}
	public float sub(float x,float y){
		float sub1 = x-y;
		return sub1;
	}
	public float div(float x,float y){
		float div1 = x/y;
		return div1;
	}
	public float mul(float x,float y){
		float mul1 = x*y;
		return mul1;
	
	}
	
	public static void main (String args[]){
		
		
			Scanner sl=new Scanner(System.in);
		
		System.out.print("Enter an integer");
		float x=sl.nextFloat();
		
		System.out.print("Enter another integer");
		float y=sl.nextFloat();
		
		
	
	
	
		
		mycalc myObj1 = new mycalc();
		mycalc myObj2 = new mycalc();
		mycalc myObj3 = new mycalc();
		mycalc myObj4 = new mycalc();
		
		//.................................................................//
		
		
		System.out.println(myObj1.add(x,y));
		System.out.println(myObj2.sub(x,y));
		System.out.println(myObj3.div(x,y));
		System.out.println(myObj4.mul(x,y));
		
		
		
		
		
	}




}