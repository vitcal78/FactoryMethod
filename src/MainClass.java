
import Creator.CalzaturaConstructor;
import Creator.GinnicaConstructor;
import Creator.SandaloConstructor;
import Product.Calzatura;
import ConcreteProduct.Colore;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * Software per la generazione di tipo di scarpe ed altro 
         */
		
		Calzatura Reebok;
		Calzatura Guess;
		
		CalzaturaConstructor scarpaGinnastica = new GinnicaConstructor(43,Colore.BIANCO);
		CalzaturaConstructor sandalo = new SandaloConstructor(38,Colore.ARANCIONE); 
		
		Reebok = scarpaGinnastica.getCalzatura();
		Guess = sandalo.getCalzatura();
		
		System.out.println(Reebok);
		System.out.println(Guess);
		
		
	}

}
