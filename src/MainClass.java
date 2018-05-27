
import Creator.ScarpaConstructor;
import Product.Colore;
import Creator.GinnicaConstructor;
import Creator.SandaloConstructor;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * Software per la generazione di tipo di scarpe ed altro 
         */
		
		
		
		ScarpaConstructor scarpaGinnastica = new GinnicaConstructor(43,Colore.BIANCO);
		ScarpaConstructor sandalo = new SandaloConstructor(38,Colore.ARANCIONE); 
		
		
		
		System.out.println(scarpaGinnastica);
		System.out.println(sandalo);
		
		
	}

}
