package homework5.model;

import homework5.model.containershapes.ContainerShape;

public class BigContainer extends ContainerShape implements Container {
	private int diagonal = 20;

	public int getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
	}

	@Override
	public int calculateWarter() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	

}
 