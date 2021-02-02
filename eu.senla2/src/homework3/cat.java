package homework3;

import java.util.Arrays;

public class cat {
	
		
	public   String name = "Bars";
	public  int age = 3;		


	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public  void setName(String name) {
		this.name = name;
	}
		
	final int[] ages = new int[] {1,3,7,5,6};	
	
	final String[] names = new String[] {"Myrka ","Bars ","Ruzh ","Vas'ka ","Pyh  "};
	

	
	public cat() {}
	public  cat (String s[] ,int i[]){
		s = names;
		i = ages;
		}
	
	public String toString () {
		return name+ "," +age;
	}
}
	
	
	
	
