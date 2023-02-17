package voli;
public class Prenotazione
{
	Volo V;
	int nPosti;
	double Prezzo;
	String Nome; 
	String Cognome;
	
	public Prenotazione(Volo v, int nposti, double prezzo, String nome, String cognome) 
	{
		V=v;
		nPosti=nposti;
		Prezzo=prezzo;
		Nome=nome;
		Cognome=cognome;
	}
	
	public String ToString() 
	{
		return "Volo: " + V.Partenza + " - "  + V.Arrivo + " Persone: " + nPosti + " Prezzo: " + Prezzo + " " + Nome + " " + Cognome;
	}
}