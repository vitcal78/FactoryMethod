package ConcreteProduct;

import Product.Calzatura;

public class Sandalo extends Calzatura {

	public Sandalo(Integer t,Colore c) {
		
		this.tipo = "Sandalo";
		this.taglia = t;
		this.colore = c;
		
	}
	
}
