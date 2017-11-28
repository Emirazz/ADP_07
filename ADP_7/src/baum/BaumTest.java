package baum;

import org.junit.jupiter.api.Test;

class BaumTest {
	
	private Baum<String> _baum;
	private Baum<String> _baum1;
	
	public BaumTest()
	{
		_baum = new ListBaum<String>();
		_baum1 = new ArrayBaum<String>();
	}
	@Test
	void test() {
		_baum.add(new Knoten<String>("b", 2));
		_baum.add(new Knoten<String>("f", 6));
		_baum.add(new Knoten<String>("a", 1));
		_baum.add(new Knoten<String>("d", 4));
		_baum.add(new Knoten<String>("c", 3));
		_baum.add(new Knoten<String>("e", 5));
		System.out.println("Inorder:");
		_baum.getInOrder();
		System.out.println("Preorder:");
		_baum.getPreOrder();
		System.out.println("Postorder:");
		_baum.getPostOrder();
		
		_baum1.add(new Knoten<String>("b", 2));
		_baum1.add(new Knoten<String>("f", 6));
		_baum1.add(new Knoten<String>("a", 1));
		_baum1.add(new Knoten<String>("d", 4));
		_baum1.add(new Knoten<String>("c", 3));
		_baum1.add(new Knoten<String>("e", 5));
		System.out.println("Inorder:");
		_baum1.getInOrder();
		System.out.println("Preorder:");
		_baum1.getPreOrder();
		System.out.println("Postorder:");
		_baum1.getPostOrder();
	}

}
