package homeWork9;

public class Robot extends FactoryHead{
	
	private String name;
	private Object head;
	private Object body;
	

	public Robot(String name, Object head, Object body) {
		super();
		this.name = name;
		this.head = head;
		this.body= body;
	}


	@Override
	public String toString() {
		return "Robot [name=" + name + ", head=" + head + ", body=" + body + "]";
	}


	

	

}
