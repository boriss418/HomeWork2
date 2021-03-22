package homework5.model;

public class ContainerImpl implements Container {
	
	private int height;
	
	private ContainerType type;

	public ContainerImpl(int height,int diagonal, ContainerType type) {
		this.height = height;
		this.type = type; 
	}
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public int getWater() {
		// formyla
		return 100;
	}



}
