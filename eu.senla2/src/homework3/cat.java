package homework3;

import java.util.Arrays;

public class cat {
	
		
	public  String name = "Bars";
	public  int age = 3;
		  
	int counter =0;	
	
	

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public cat() {}
	public  cat (String name ,int age){
		setName ("Leo");
		setAge (8);
	}
	
		
	int[] ages = new int[] {1,3,7,5,6};	
	
	String[] names = new String[] {"Myrka - 2","Bars - 4","Ruzh - 8","Vas'ka - 2","Pyh  - 5"};
	
	
	public  cat (String [] n ,int []a){
		names=n;
		ages=a;
		}
}
	
	
	
	
