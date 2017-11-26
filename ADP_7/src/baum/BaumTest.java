package baum;

import org.junit.jupiter.api.Test;

class BaumTest {
	
	private Baum<String> _baum;
	
	public BaumTest()
	{
		_baum = new ArrayBaum<String>();
	}
	@Test
	void test() {
		_baum.add(new Knoten<String>("b", 2));
		_baum.add(new Knoten<String>("a", 1));
		_baum.add(new Knoten<String>("d", 4));
		_baum.add(new Knoten<String>("c", 3));
		_baum.add(new Knoten<String>("f", 6));
		_baum.add(new Knoten<String>("e", 5));
		_baum.getPreOrder();
	}

}
