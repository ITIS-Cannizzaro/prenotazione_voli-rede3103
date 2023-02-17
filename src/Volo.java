package voli;
public class Volo 
{
	int PClasse;
	int SClasse;
	int PostiLiberi;
	String Partenza;
	String Arrivo;
	String OrarioP;
	String OrarioA;
	public Volo(int pclasse,int sclasse,int postiliberi,String partenza,String arrivo, String orariop, String orarioa)
	{
		PClasse=pclasse;
		SClasse=sclasse;
		PostiLiberi=postiliberi;
		Partenza=partenza;
		Arrivo=arrivo;
		OrarioP=orariop;
		OrarioA=orarioa;
	}

	String ToString() {
		return "Partenza: " + Partenza + " Ore: " + OrarioP + " Arrivo: " + Arrivo + " Ore: "+ OrarioA + " Prezzo prima classe: " + PClasse + " Prezzo seconda classe: "+ SClasse + " Posti liberi: " + PostiLiberi;
	}
}