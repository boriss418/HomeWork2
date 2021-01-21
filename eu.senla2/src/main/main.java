package main;

import java.util.Scanner;

import rainbow.rainbow;

public class main {

	public static void main(String[] args) {
		 rainbow rainbow1 = new rainbow();		 
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("number: ");
			int i = input.nextInt();
			
			int index = i -1;
			int one = (index / 10)-1;
			int ten = index % 10;
			
			switch (index) {
			   case 0,1,2,3,4,5,6:
				   System.out.println(rainbow1.getColour()[index]);
			       break;     
		      		       			   
			   default:
				   if(i==77 || i==11 || i==22 || i==33 || i==44 || i==55|| i==66) {
					   System.out.println(rainbow1.getColour()[one]);
					   
				   }else  if ((one >= 0 && one <7 ) && (ten >=0 && ten <7)) {
					   System.out.print(rainbow1.getColour2()[one]);
					   System.out.println("-" + rainbow1.getColour()[ten]);
				   }else
				   
			    	System.out.println("probably number");
			}
			
	}
}
		