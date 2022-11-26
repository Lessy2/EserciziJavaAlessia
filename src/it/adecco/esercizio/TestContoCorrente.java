package it.adecco.esercizio;


public class TestContoCorrente {
	

	public static void main (String[]arg) {
		
		
	ContoCorrente c1 = new ContoCorrente("Alessia", 400);
	ContoCorrente c2 = new ContoCorrente("Nik ", 3000);
	ContoCorrente c3 = new ContoCorrente("Giovanni");
	
	
	
	c1.prelievo(200);
	c1.stampaSaldo();
	c2.prelievo(750);
	c2.deposito(1200);
	c3.stampaSaldo();
	c3.deposito(340);	
	
		
	}

}
