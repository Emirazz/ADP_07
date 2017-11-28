package baum;
/**
 * Die Klasse Knoten, soll für Suchbäume eingesetzt werde.
 * Sie speichert ein Objekt, den linken- und rechten-Sohn.
 * @author Emira Zorgati, Menan Abdul Ulfat
 *
 * @param <E> Objekt-Typ
 */
public class Knoten<E>{
	private E _obj;
	private int _key;
	private Knoten<E> _linkerSohn;
	private Knoten<E> _rechterSohn;
	
	/**
	 * Ein Knoten, der ein Objekt und einen Key speichert
	 * 
	 * @param obj das zu speichernde Objekt
	 * @param key der Key mit dem verglichen wird
	 */
	public Knoten(E obj, int key) {
		_obj = obj;
		_key = key;
	}
	
	/**
	 * Gibt das Element des Knoten zurück.
	 * 
	 * @return das Element
	 */
	public E getElem() {
		return _obj;
	}
	
	/**
	 * Gibt den Key des Elements zurück
	 * 
	 * @return der Key
	 */
	public int getKey() {
		return _key;
	}
	
	/**
	 * Setzt den linken Sohn des Knotens
	 * 
	 * @param knoten der Sohn-Knoten, welcher kleiner ist als der Vater-Knoten
	 */
	public void setSohnLinks(Knoten<E> knoten) {
		_linkerSohn = knoten;
	}

	/**
	 * Setzt den rechten Sohn des Knotens
	 * 
	 * @param knoten der Sohn-Knoten, welcher groesser ist als der Vater-Knoten
	 */
	public void setSohnRechts(Knoten<E> knoten) {
		_rechterSohn = knoten;
	}
	
	/**
	 * Gibt den linken Sohn zurück
	 * 
	 * @return linker Sohn
	 */
	public Knoten<E> getSohnLinks() {
		return _linkerSohn;
	}
	
	/**
	 * Gibt den rechten Sohn zurück
	 * 
	 * @return rechter Sohn
	 */
	public Knoten<E> getSohnRechts() {
		return _rechterSohn;
	}
	
	/**
	 * Gibt den Vater zurück
	 * 
	 * @return Vater Knoten
	 */
	public Knoten<E> getKnoten() {
		return this;
	}
}
