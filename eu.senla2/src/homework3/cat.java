package homework3;

import java.util.Arrays;

public class cat {
	
		
	public String name = "Bars";
	public int age = 3;
	
	public void Cat1(String x, int a){
	      name = x;
	      age = a;
	 } 
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
	
	
	
	public void CatWhile () {
		
		while (counter < 10) {
			counter++;
			System.out.println("Cat : " + name + ", " + age );
		}
	}
	
	
	public void CatFor () {
		for (counter =0; counter < 10; counter++) {
			setName("Vas'ka");
			setAge(10);
			System.out.println("Cat : " + getName() + ", " + getAge() );
			
		}	
	}
	public void CatDoWhile () {
		name ="puh";
		age = 7;
				
		counter=0;
				
		do {
			counter++;			
			System.out.println("Cat : " + "name" + name + "age " + age);
		}while (counter < 10);
	}
	
	public void CatForeach () {
		
	int[] arrays = new int[] {1,3,7,5,6};	
	int index = 0;
	
	String[] array = new String[5];
	Iterable<String> list =Arrays.asList("Myrka","Bars","Ruzh","Vas'ka","Pyh");
	
	
	for (String i: list) {
		System.out.print(i + ": ");
		System.out.println(arrays[index]);
		System.out.println(list.equals(arrays[index]));
		index++;
		
	}
	

	//String toString() {
	//	return "Cat:" + " Name - " + name + "Age - "+age
	//}
	
}
}		