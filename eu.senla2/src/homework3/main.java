package homework3;

public class main {

	public static void main(String[] args) {
		
		cat cat1 = new cat("Bars", 5);	
	
		int counter =0;	
	/*
	 * 	цикл while
	 */
		while (counter < 10) {
			counter++;
			System.out.println("Cat : " +cat1.name + cat1.age  );
		}
		/*
		 * 	цикл for
		 */
		for (counter =0; counter < 10; counter++) {
			cat1.setName("Vas'ka");
			cat1.setAge(10);
			System.out.println("Cat : " + cat1.getName() + ", " + cat1.getAge() );
			
		}	
		/*
		 * 	цикл do while
		 */
		
		counter=0;				
				do {
					counter++;			
					System.out.print (cat1.name) ;  
					System.out.println (cat1.age) ; 
				}while (counter < 10);
		 /*
		  * 	цикл foreach
		  */
				counter=0;
				
				
				for (String i: cat1.names) {
					System.out.println(i + ": " + cat1.ages[counter]);
					counter++;
				}
				System.out.println(cat1.names[2].equals(cat1.names[3]));
				System.out.println(cat1.toString());
				System.out.println(cat1);
	}
	
}	
	
	
	

	

