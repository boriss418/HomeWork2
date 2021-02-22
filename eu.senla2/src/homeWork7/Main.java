package homeWork7;

public class Main {
	public static void main(String[] args) {	
		
		FactoryHead head = new FactoryHead();
		FactoryBody body = new FactoryBody();
		
		
		for (int i=1; i<=9; i++ ) {
			Robot robot1 = new Robot( "r"+i,head.AddShapeHead((int)(Math.random()*3)), body.AddShapeBody((int)(Math.random()*3)));
			System.out.println(robot1);
		}
		
	}

}
