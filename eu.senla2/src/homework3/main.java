package homework3;

public class main {

	public static void main(String[] args) {
		
		
	/*
	 * 	цикл while
	 */
		int counter =0;	
		while (counter < 10) {
			counter++;
			System.out.println(new cat().toString()  );
		}
		/*
		 * 	цикл for
		 */
		for (counter =0; counter < 10; counter++) {
			cat Cat = new cat();
			Cat.setName("Vas'ka");
			Cat.setAge(10);
			System.out.println("Cat : " + Cat );
			
		}	
		/*
		 * 	цикл do while
		 */
		
		counter=0;				
				do {
					counter++;			
					System.out.println (new cat().toString()) ;  					
				}while (counter < 10);
		 /*
		  * 	цикл foreach
		  */
				counter=0;
				
				cat Cat = new cat();
				for (String i: Cat.names) {
					System.out.println(i + ": " + Cat.ages[counter]);
					counter++;
				}
				System.out.println(Cat.names[2].equals(Cat.names[3]));
	
	
	}
	
}	
	
	
	

	

