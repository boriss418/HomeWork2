package homeWork9;

public class FactoryHead implements Head{
	

	Object head[]= new Object [3];	

	@Override
	public Object AddShapeHead(int e) {
		if (e == 0) {
			return head[e] =ShapeHead.PARALLELEPIPED;						
		}else if (e == 1) {
			return head[e] =ShapeHead.CONE;
		}else if (e == 2) {
			return head[e] =ShapeHead.CYLINDER;
		}else
		return e;
	}

	



	
	

}
