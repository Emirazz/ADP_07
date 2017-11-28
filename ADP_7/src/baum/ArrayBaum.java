package baum;
/**
 * Array Implementation des binären Suchbaums.
 * @author Emira Zorgati, Menan Abdul Ulfat
 *
 * @param <E>
 */
public class ArrayBaum<E> extends Baum<E> {

	private Knoten<E>[] _arr;
	private int _last;

	@SuppressWarnings("unchecked")
	public ArrayBaum() {
		_arr = new Knoten[10];
	}

	@Override
	public Knoten<E> getWurzel() {
		if (_arr[1] == null) {
			return null;
		}
		return _arr[1];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(Knoten<E> knoten) {
		int length = _arr.length;
		if (_last * 2 + 1 >= length){
			Knoten<E>[] array = new Knoten[length * 2];
			for (int i = 0; i < length; i++) {
				array[i] = _arr[i];
			}
			_arr = array;
		}
		int index = getIndex(knoten, 1);
		if(_last < index)
		{
			_last = index;
		}
		_arr[index] = knoten;
		setKind(index, knoten);
	}

	private void setKind(int index, Knoten<E> knoten) {
		if (index != 1) {
			if (index % 2 == 0) {
				_arr[index / 2 ].setSohnLinks(knoten);
			} else {
				_arr[index / 2 ].setSohnRechts(knoten);
			}
		}

	}

	private int getIndex(Knoten<E> knoten, int index) {
		int result = 0;
		if (_arr[index] == null) {
			result = index;
		} else {
			if (_arr[index].getKey() < knoten.getKey()) {
				result = getIndex(knoten, index * 2 + 1);
			} else {
				result = getIndex(knoten, index * 2);
			}
		}
		return result;
	}

}
