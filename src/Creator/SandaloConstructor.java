package Creator;
import ConcreteProduct.Colore;
import ConcreteProduct.Sandalo;
import Product.Calzatura;

public class SandaloConstructor extends CalzaturaConstructor {

	Integer taglia;
	Colore colore;
	
	
	public SandaloConstructor(Integer t,Colore c) {
		
		this.taglia = t;
		this.colore = c;
		
	}
	
	
	@Override
	protected Calzatura Constructor() {
		// TODO Auto-generated method stub
		return new Sandalo(taglia,colore);
	}

	
	
}
