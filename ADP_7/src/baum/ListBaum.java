package baum;

public class ListBaum<E> extends Baum<E> {
	private Knoten<E> _master;

	@Override
	public Knoten<E> getMaster() {
		return _master;
	}

	@Override
	public void add(Knoten<E> knoten) {
		if(_master == null)
		{
			_master = knoten;
		}
		else
		{
			Knoten<E> sohn = _master;
			Knoten<E> vater = sohn;
			do
			{
				
				if(sohn.getKey() < knoten.getKey())
				{
					sohn = sohn.getSohnRechts();
				}
				else
				{
					sohn = sohn.getSohnLinks();
				}
			}while(sohn != null);
			
			if(vater.getKey() < knoten.getKey())
			{
				vater.setSohnRechts(knoten);
			}
			else
			{
				vater.setSohnLinks(knoten);
			}
		}
		
	}

}
