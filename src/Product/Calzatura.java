package Product;

import ConcreteProduct.Colore;

public abstract class Calzatura {
	
	protected Integer taglia;
	protected Colore colore; 
	protected String tipo;
	
	public String toString() {
		
		return tipo+" "+colore+" taglia:"+taglia.toString()+"\n";
		
	}

}
