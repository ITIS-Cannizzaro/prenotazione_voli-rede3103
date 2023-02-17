package voli;
public class Cliente extends Persona
{   
	String Partenza, Arrivo;
	int PostiDaPrenotare;
	public Cliente(String Nome, String Cognome, String partenza, String arrivo, int postidaprenotare) 
	{
		super(Nome, Cognome);
		Partenza=partenza;
		Arrivo=arrivo;
		PostiDaPrenotare=postidaprenotare;
	}
	
	public int getPostiDaPrenotare() {
		return PostiDaPrenotare;
	}

	public void setPostiDaPrenotare(int postiDaPrenotare) {
		PostiDaPrenotare = postiDaPrenotare;
	}

	public String getPartenza() {
		return Partenza;
	}
	public void setPartenza(String partenza) {
		Partenza = partenza;
	}
	public String getArrivo() {
		return Arrivo;
	}
	public void setArrivo(String arrivo) {
		Arrivo = arrivo;
	}
	
	String generalita() {
		return Nome + " " + Cognome;
	}
	
	void Disdire(Agente a) {
		for(int i=0; i<a.Prenotazioni.size(); i++)
		{
			if(a.Prenotazioni.get(i).Nome.equals(Nome)&&a.Prenotazioni.get(i).Cognome.equals(Cognome))
			{
				System.out.println("Vorrei disdire la mia prenotazione");
				a.Prenotazioni.remove(i);
			}
		}
	}
	
}