package Creator;
import ConcreteProduct.Colore;
import ConcreteProduct.Scarpa;
import Product.Calzatura;

public class ScarpaConstructor extends CalzaturaConstructor {

	Integer taglia;
	Colore colore;
	
	
	public ScarpaConstructor(Integer t,Colore c) {
		
		this.taglia = t;
		this.colore = c;
		
	}
	
	
	@Override
	protected Calzatura Constructor() {
		// TODO Auto-generated method stub
		return new Scarpa(colore,taglia);
	}

		
}
