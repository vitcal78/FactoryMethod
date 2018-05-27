package Creator;
import ConcreteProduct.Ginnica;
import Product.Colore;
import Product.Scarpa;

public class GinnicaConstructor extends ScarpaConstructor {
	
	
	public GinnicaConstructor(Integer t,Colore c) {
		
		calz = Constructor(t,c);
		
	}
	
	@Override
	protected Scarpa Constructor(Integer t,Colore c) {
		// TODO Auto-generated method stub
		return new Ginnica(t,c);
	}
	
	
	


}
