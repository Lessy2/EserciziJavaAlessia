package it.adecco.esercizio;


/*Ogni conto è caratterizzato da un numero (assegnato all’atto della creazione), 
 * dal nome dell’intestatario e dal saldo disponibile (in euro). 

E’ richiesta l’implementazione di

- Due costruttori, che può prendere in ingresso un valore di saldo
iniziale opzionale (altrimenti default  = 500) e  il nome dell'intestatario

- la definizione delle funzioni  deposito e il prelievo di una somma; 
nel caso in cui si cerchi di fare il prelievo di una somma non disponibile, messaggio di errore.

- il metodo stampaSaldo, che consente di ottenere la somma disponibile;*/
public class ContoCorrente {

	String nomeintestatario;
	int numeroconto;
	double saldo;
	
	
	public void deposito(double importodep) {
		this.setSaldo(getSaldo() + importodep);
		stampaSaldo();
	}
	
	public void prelievo(double importoprel) {
		if(importoprel > this.getSaldo()) {
			System.out.println(getNomeintestatario()+" L'importo di: "+importoprel+ " richiesto è superiore al saldo disponibile ");
		}else {
			this.setSaldo(getSaldo()-importoprel);
		}
		
		
	}
	
	public ContoCorrente(String nomeintestatario) {
		super();
		this.setNomeintestatario(nomeintestatario);
		this.setSaldo(500);
	}

	
	public ContoCorrente(String nomeintestatario, double saldo) {
		super();
		this.setNomeintestatario(nomeintestatario);
		this.setSaldo(saldo);
	}

	public String getNomeintestatario() {
		return nomeintestatario;
	}
	public void setNomeintestatario(String nomeintestatario) {
		this.nomeintestatario = nomeintestatario;
	}
	public int getNumeroconto() {
		return numeroconto;
	}
	public void setNumeroconto(int numeroconto) {
		this.numeroconto = numeroconto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void stampaSaldo() {
		System.out.println( nomeintestatario+ " il tuo saldo disponibile è: "+getSaldo());
		
	}
	
	
	
	

	
	
	
	
}