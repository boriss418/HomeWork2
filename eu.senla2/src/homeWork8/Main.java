package homeWork8;

public class Main {
	
	public static void main(String[] args) {	
		 
		MyList <String> strings = new MyArrayList<>();
//		 strings.add("first");
//		 strings.add("second");
//		 strings.add("tree");
		
		strings.add(0, "first");
		strings.add(1, "second");
		strings.add(7, "ten");
    	strings.add(5, "five");
    	
    	strings.remove(0);
    	strings.set(24, "wer");
		 
		 System.out.println(strings);
		 
		 
		 
		 
	}

}
