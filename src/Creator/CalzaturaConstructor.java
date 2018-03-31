package Creator;
import Product.Calzatura;

public abstract class CalzaturaConstructor {
	
	protected abstract Calzatura Constructor();
	
	public Calzatura getCalzatura() {
		return Constructor();
	}
	
}


