package baum;

public class Knoten<E>{
	private E _obj;
	private int _key;
	private Knoten<E> _linkerSohn;
	private Knoten<E> _rechterSohn;
	
	public Knoten(E obj, int key) {
		_obj = obj;
		_key = key;
	}
	
	public E getElem() {
		return _obj;
	}
	
	public int getKey() {
		return _key;
	}
	
	public void setSohnLinks(Knoten<E> knoten) {
		_linkerSohn = knoten;
	}

	public void setSohnRechts(Knoten<E> knoten) {
		_rechterSohn = knoten;
	}
	
	public Knoten<E> getSohnLinks() {
		return _linkerSohn;
	}
	
	public Knoten<E> getSohnRechts() {
		return _rechterSohn;
	}
	public Knoten<E> getKnoten() {
		return this;
	}
}
