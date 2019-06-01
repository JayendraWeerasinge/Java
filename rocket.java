import java.util.Scanner;
public class rocket{
	public static void main(String[]args){
		float weight,force,mass,acceleration,trust;
		float con=(float)9.8;
	
		//scan of mass
	Scanner one1 = new Scanner(System.in);
	System.out.println("Enter mass:");
	mass=one1.nextFloat();
		//scan of trust
	System.out.println("Enter trust:");
	trust=one1.nextFloat();
		//calculating the weight
	weight = con * mass;
	System.out.println("Value of weight :"+weight);
		//calculating the force
	force = trust-weight;
	System.out.println("Value of force :"+force);
		//final step
	acceleration= force/mass;
	System.out.println("Value of acceleration :"+acceleration);
	
	
	
	
	
	
	
	
	
	
	}



}