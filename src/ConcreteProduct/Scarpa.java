package ConcreteProduct;

import Product.Calzatura;

public class Scarpa extends Calzatura {

	public Scarpa(Colore c,Integer t) {
		this.tipo = "Scarpa classica";
		this.taglia = t;
		this.colore = c;
	}
	
}
