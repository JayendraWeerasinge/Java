public class CQ{
public static void main(String[]args){

int x;
for (x=0;x<100;x++){
	if (x%3==0&&x%5==0){
		System.out.println(x+"can divided by 5");
	}
	else if(x%3==0)
		System.out.println(x+"can divided by 3");
	
	else if(x%5==0)
		System.out.println(x+"can be divided by both 3 and 5");
	else{
		System.out.println("invalid number");
	}
}

}


}