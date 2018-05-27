package Creator;
import ConcreteProduct.Sandalo;
import Product.Colore;
import Product.Scarpa;

public class SandaloConstructor extends ScarpaConstructor {


	
	public SandaloConstructor(Integer t,Colore c) {
		
		calz = Constructor(t,c);
		
	}
	
	
	@Override
	protected Scarpa Constructor(Integer t,Colore c) {
		// TODO Auto-generated method stub
		return new Sandalo(t,c);
	}

	
	
}
