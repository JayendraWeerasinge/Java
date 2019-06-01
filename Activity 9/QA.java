import java.util.*;

public class QA{
	public static void main(String[] args){
	String w,reword="";
	Scanner scanObject = new Scanner(System.in);
	
	System.out.println("Enter the word to reverse  :");
		w = scanObject.nextLine();
		
		int length = w.length();
		for(int i = length-1;i>=0; i--){
			reword = reword + w.charAt(i);
		
	
	}
	System.out.println("Reverse Word:"+reword);
	
}
}