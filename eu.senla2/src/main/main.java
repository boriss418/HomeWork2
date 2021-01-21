package main;

import java.util.Scanner;

import rainbow.rainbow;

public class main {

	public static void main(String[] args) {
		 rainbow rainbow1 = new rainbow();		 
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("number: ");
			int i = input.nextInt();
			
			int one = i / 10;
			int ten = i % 10;
			
			switch (i) {
			   case 0,1,2,3,4,5,6:
				   System.out.println(rainbow1.getColour()[i]);
			       break;
			   
			   default:
				   if ((one >= 0 && one <7 ) && (ten >=0 && ten <7)) {
					   System.out.println(rainbow1.getColour()[one] + "-" + rainbow1.getColour()[ten]);
				   }else
				   
			    	System.out.println("nevernoe chislo");
			}
			
			
			
	}
}
