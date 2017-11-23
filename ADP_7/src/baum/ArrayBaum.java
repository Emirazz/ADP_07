package baum;

public class ArrayBaum<E> extends Baum<E>{

	private Knoten<E>[] _arr;
	private int _size;
	
	@SuppressWarnings("unchecked")
	public ArrayBaum() {
		_arr = new Knoten[10];
	}
	@Override
	public Knoten<E> getMaster() {
		if(_arr[0] == null)
		{
			return null;
		}
		return _arr[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(Knoten<E> knoten) {
		int length = _arr.length;
		if(_size >= length){
			Knoten<E>[] array = new Knoten[length*2];
			for(int i = 0; i < length;i++ )
			{
				array[i] = _arr[i];
			}
		}
//		else if(_size == 0)
//		{
//			_arr[0] = knoten;
//		}
		else
		{
			_arr[getIndex(knoten, 0)] = knoten;
		}
		
	}
	
	private int getIndex(Knoten<E> knoten, int index) {
		int result = 0;
		if(_arr[index] == null)
		{
			result = index;
		}
		else
		{
			if(_arr[index].getKey()< knoten.getKey())
			{
				getIndex(knoten, index*2 +1);
			}
			else
			{
				getIndex(knoten, index*2);
			}
		}
		return result;
	}
	
}
