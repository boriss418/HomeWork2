package homeWork9;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HeadTest {
	
	private FactoryHead head = new FactoryHead();
	
	@Test
	public void ShapeHead0() {
		
			String actual = head.AddShapeHead(0).toString();
			String exepted ="PARALLELEPIPED";
			assertEquals(exepted, actual);
		}
	}
	
	
	
	
	
	


