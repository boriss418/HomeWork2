package homeWork7;

public class FactoryBody {
	
	Object body[]= new Object [3];	

	public Object AddShapeBody(int e) {
		if (e == 0) {
			return body[e] =ShapeHead.PARALLELEPIPED;						
		}else if (e == 1) {
			return body[e] =ShapeHead.CONE;
		}else if (e == 2) {
			return body[e] =ShapeHead.CYLINDER;
		}else
		return e;
	}

}
