public class sms{
public static void main(String[] args){
	
	//................................................students........................................
	student student1 =new student();
	student1.setname("Sachie");
	student1.setindex(17020964);
	
	student student2 =new student();
	student2.setname("Isuri");
	student2.setindex(17020374);
	
	student student3 =new student();
	student3.setname("Dilanka");
	student3.setindex(17020069);
	
	student student4 =new student();
	student4.setname("Pasan");
	student4.setindex(17020123);
	
	student student5 =new student();
	student5.setname("Nilan");
	student5.setindex(17020456);
	
	//........................................print.....................................
	
	
	
	System.out.println("Name: "+student1.getname() + " " +student1.getindex());
	System.out.println("Name: "+student2.getname() + " " +student2.getindex());
	System.out.println("Name: "+student3.getname() + " " +student3.getindex());
	System.out.println("Name: "+student4.getname() + " " +student4.getindex());
	System.out.println("Name: "+student5.getname() + " " +student5.getindex());
	
}


}
 class student{
	private int index;
	private String name;
	
	
	//..................getter...............
	
	public String getname(){
		return name;
	}
	//.................setter...............
	public void setname(String newn){
		this.name = newn;
	}
	//........getter............
	public int getindex(){
		return index;
		
	}
	//...........setter................
	public void setindex(int newin){
		this.index = newin;
	}
	
}