package baum;
/**
 * Ein abstrakte Klasse eines binärer Suchbaums.
 * @author Emira Zorgati, Menan Abdul Ulfat
 *
 * @param <E> generischer Typ der zuspeichernden Objekte
 */
public abstract class Baum<E> {
	
	/**
	 * Gibt den Wurzel Knoten aus.
	 * @return der Wurzel Knoten
	 */
	abstract public Knoten<E> getMaster();
	
	/**
	 * Dem Baum ein weitern Knoten hinzufügen.
	 * 
	 * @param knoten Der Knoten, welcher hinzugefügt werden soll.
	 */
	abstract public void add(Knoten<E> knoten);
	
	/**
	 * Gibt den Baum in inorder auf der Konsole aus.
	 */
	public void getInOrder() {
		inorder(getMaster());
	}
	
	/**
	 * Gibt den Baum in preorder auf der Konsole aus.
	 */
	public void getPreOrder() {
		preorder(getMaster());
	}
	
	/**
	 * Gibt den Baum in postorder auf der Konsole aus.
	 */
	public void getPostOrder() {
		postorder(getMaster());
	}
	
	/**
	 * Gibt ab dem AnfangsKnoten alle Elemente(inorder) auf der Konsole aus.
	 * 
	 * @param anf Der Anfangsknoten.
	 */
	private void inorder(Knoten<E> anf) {
		Knoten<E> links = anf.getSohnLinks();
		Knoten<E> rechts = anf.getSohnRechts();
		if(links != null) {
			inorder(links);
		}
		System.out.println(anf.getElem());
		if(rechts != null) {
			inorder(rechts);
		}
	}
	
	/**
	 * Gibt ab dem AnfangsKnoten alle Elemente(preorder) auf der Konsole aus.
	 * 
	 * @param anf Der Anfangsknoten.
	 */
	private void preorder(Knoten<E> anf) {
		Knoten<E> links = anf.getSohnLinks();
		Knoten<E> rechts = anf.getSohnRechts();
		System.out.println(anf.getElem());
		if(links != null) {
			preorder(links);
		}
		if(rechts != null) {
			preorder(rechts);
		}
	}
	
	/**
	 * Gibt ab dem AnfangsKnoten alle Elemente(postorder) auf der Konsole aus.
	 * 
	 * @param anf Der Anfangsknoten.
	 */
	private void postorder(Knoten<E> anf) {
		Knoten<E> links = anf.getSohnLinks();
		Knoten<E> rechts = anf.getSohnRechts();
		if(links != null) {
			postorder(links);
		}
		if(rechts != null) {
			postorder(rechts);
		}
		System.out.println(anf.getElem());
	}
}
