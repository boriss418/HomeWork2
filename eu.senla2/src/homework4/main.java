package homework4;

import java.util.Arrays;
import java.util.Random;

//import com.sun.tools.javac.util.List;

public class main {
	public static void main(String[] args) {
	
		/*
		 * создаем массив и заполняем его 
		 */
		String[][] mass = new String[10][10];
		
		final String [] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			
				for (int i = 0; i < mass.length; i++) {
					for (int j =0; j < mass.length; j++) {
						if (j %3 !=0) {
							mass [i][j]= letters[0+ (int)(Math.random()*letters.length)];
							for (int e = 0; e < 5; e++) {						
							mass [i][j] = mass [i][j] + letters[0+ (int)(Math.random()*letters.length)];
							}
						} else {
								mass [i][j] = Double.toString(Math.random()*10).substring(0,6);
						}						
					}				
				}			
				for (int i = 0; i < mass.length; i++) {			
				  for (int j =0; j < mass.length; j++) {
					System.out.print(mass [i][j]+ " ");
				}
				    System.out.println() ;
				}
				/*
				 * создаем массивы деогоналей предыдущего массива
				 */
				String [] diagonal1 = new String [10];
				String [] diagonal2 = new String [10];
				for (int i = 0; i < mass.length; i++) {
					for (int j =0; j < mass.length; j++) {
						if (i== j) {
							diagonal1 [i] = mass [i][j];
						}				
					}
				}
				int j= mass.length-1;
				for (int i = 0; i < mass.length; i++) {
					diagonal2 [i] =  mass [i][j];
					j--;
				}
				
				System.out.print("diagonal1:");
				for (int i = 0; i< diagonal1.length; i++ ) {
				System.out.print( diagonal1 [i]+ " ");
				}
				System.out.println();
				
				
				System.out.print("diagonal2:");
				for (int i = 0; i< diagonal2.length; i++ ) {
					System.out.print( diagonal2 [i]+" ");
					}
					System.out.println();
					System.out.println(diagonal1.equals(diagonal2));
					
					/*
					 * выбираем из массива деогоналей буквенные выражения
					 */
					
					String [] summdiagonal = new String [20];
					
					j =0; 
					int y =0;
					for (int i = 0; i < summdiagonal.length; i++) {	
						if (i < diagonal1.length) {							
					summdiagonal [i] = diagonal1 [j];
					j++;
						}else {
							summdiagonal [i] = diagonal2 [y];
						y++;
					}				
					}
					int index =0;
					int o =0;
					StringBuffer sb = new StringBuffer();
					
					/*
					 * ыбираем числовые выражения
					 */
					double [] numbers = new double[10];
					double [] num = new double[o];
															
					for (int i =0; i < summdiagonal.length; i++) {	
					try {
					Double.parseDouble(summdiagonal[i]);					
					if (Double.parseDouble(summdiagonal[i])>= 1.7) {
						numbers [o] = Math.ceil(Double.parseDouble(summdiagonal[i]));
						num  = Arrays.copyOf(numbers, o+1);
						index++;
						o++;
					}else {
						numbers [o] = Math.floor(Double.parseDouble(summdiagonal[i]));
						num  = Arrays.copyOf(numbers, o+1);
						index++;
						o++;
					}
					}catch (NumberFormatException e) {
						sb.append(summdiagonal[i].substring(2,4) + " ");													
					}											
					}
					
					System.out.println(sb);
					
					System.out.print( num [0]+);
					for (int i = 1; i< num.length; i++ ) {
						System.out.print("_"+ num [i]);
						}
	}
}
					
