package Creator;
import Product.Colore;
import Product.Scarpa;

public abstract class ScarpaConstructor {
	
	protected Scarpa calz;
	
		
	protected abstract Scarpa Constructor(Integer t,Colore c);
	
	public String toString() {
		return calz.toString();
	}	
	
}


