package ConcreteProduct;

import Product.Colore;
import Product.Scarpa;

public class Sandalo extends Scarpa {

	public Sandalo(Integer t,Colore c) {
		
		this.tipo = "Sandalo";
		this.taglia = t;
		this.colore = c;
		
	}
	
}
