package Creator;
import ConcreteProduct.Colore;
import ConcreteProduct.Ginnica;
import Product.Calzatura;

public class GinnicaConstructor extends CalzaturaConstructor {

	Integer taglia;
	Colore colore;
	
	
	public GinnicaConstructor(Integer t,Colore c) {
		
		this.taglia = t;
		this.colore = c;
		
	}
	
	@Override
	protected Calzatura Constructor() {
		// TODO Auto-generated method stub
		return new Ginnica(taglia,colore);
	}
	


}
