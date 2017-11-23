package baum;

public class ArrayBaum<E> extends Baum<E> {

	private Knoten<E>[] _arr;
	private int _last;

	@SuppressWarnings("unchecked")
	public ArrayBaum() {
		_arr = new Knoten[10];
	}

	@Override
	public Knoten<E> getMaster() {
		if (_arr[0] == null) {
			return null;
		}
		return _arr[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(Knoten<E> knoten) {
		int length = _arr.length;
		if (_last * 2 + 1 >= length) {
			Knoten<E>[] array = new Knoten[length * 2];
			for (int i = 0; i < length; i++) {
				array[i] = _arr[i];
			}
			_arr = array;
		}
		// else if(_size == 0)
		// {
		// _arr[0] = knoten;
		// }
		int index = getIndex(knoten, 1);
		_last = index;
		_arr[index] = knoten;
		setKind(index + 1, knoten);
	}

	private void setKind(int index, Knoten<E> knoten) {
		if (index != 1) {
			if (index % 2 == 0) {
				_arr[index / 2 - 1].setSohnLinks(knoten);
			} else {
				_arr[index / 2 - 1].setSohnRechts(knoten);
			}
		}

	}

	private int getIndex(Knoten<E> knoten, int index) {
		int result = 0;
		if (_arr[index - 1] == null) {
			result = index - 1;
		} else {
			if (_arr[index - 1].getKey() < knoten.getKey()) {
				result = getIndex(knoten, index * 2 + 1);
			} else {
				result = getIndex(knoten, index * 2);
			}
		}
		return result;
	}

}
