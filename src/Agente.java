package voli;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Agente extends Persona
{
	ArrayList<Volo>Lista;
	ArrayList<Prenotazione>Prenotazioni;
	public Agente(String Nome, String Cognome) 
	{
	 super(Nome, Cognome);
	 Lista=new ArrayList<Volo>();
	 Prenotazioni=new ArrayList<Prenotazione>();
	}

	
	void stampa() 
	{
		for(int i=0; i<Lista.size(); i++) 
		{
			System.out.println(Lista.get(i).ToString());
		}
	}
	
	
	void Add(Volo v) 
	{
		Lista.add(v);
	}
	
	
	void prenota(Cliente a) 
	{   double prezzo=0;
	    int o=0;
		for(int i=0; i<Lista.size(); i++)
		{
			if(a.Arrivo.equals(Lista.get(i).Arrivo)&&a.Partenza.equals(Lista.get(i).Partenza))
			{
				o++;
				System.out.println("nome e cognome?");
				System.out.println(a.generalita());
				System.out.println("Volo?");
				System.out.println(a.Partenza+" "+a.Arrivo);
				if(a.PostiDaPrenotare<=Lista.get(i).PostiLiberi) 
				{
					
					System.out.println("Sono disponibili dei posti, prima o seconda classe?");
					Scanner r1=new Scanner(System.in);
					String r=r1.nextLine();
					if(r.equals("prima"))
					{
						prezzo=a.PostiDaPrenotare*Lista.get(i).PClasse;
						System.out.println("Posti prenotati");
						Lista.get(i).PostiLiberi-=a.PostiDaPrenotare;
						Prenotazione p = new Prenotazione(Lista.get(i), a.PostiDaPrenotare, prezzo, a.Nome, a.Cognome);
						Prenotazioni.add(p);
					}
					
					else if(r.equals("seconda"))
					{
						prezzo=a.PostiDaPrenotare*Lista.get(i).SClasse;
						System.out.println("Posti prenotati");
						Lista.get(i).PostiLiberi-=a.PostiDaPrenotare;
						Prenotazione p = new Prenotazione(Lista.get(i), a.PostiDaPrenotare, prezzo, a.Nome, a.Cognome);
						Prenotazioni.add(p);
					}
					
					prezzo=0;
					break;
					
				}
				else
					System.out.println("Al momento non sono disponibili posti, mi scuso per l'incoveniente");
				
			}
			
			
		}
		if(o==0)
		{
			System.out.println("Non ho le soluzioni di viaggio che sta cercando");
		}
		
	}
	
	String generalita() 
	{
		return Nome + " " + Cognome;
	}
	
	void stampaP() 
	{
		for(int i=0; i<Prenotazioni.size(); i++) 
		{
			System.out.println(Prenotazioni.get(i).ToString());
		}
	}
	
	
	
	void SpesaMinima() 
	{   
		int pos=0;
		double min=1000000000;
		boolean e=Prenotazioni.isEmpty();
		if(e==false)
		{
		for(int i=0; i<Prenotazioni.size(); i++)
		{
			if(Prenotazioni.get(i).Prezzo<min)
			{
				min=Prenotazioni.get(i).Prezzo;
				pos=i;
			}
		}
		System.out.println("La prenotazione con il prezzo minore è: ");
		System.out.println(Prenotazioni.get(pos).ToString());
		}	
	}
	
	void SpesaMassima() 
	{   
		int pos=0;
		double max=0;
		boolean e=Prenotazioni.isEmpty();
		if(e==false)
		{
		for(int i=0; i<Prenotazioni.size(); i++)
		{
			if(Prenotazioni.get(i).Prezzo>max)
			{
				max=Prenotazioni.get(i).Prezzo;
				pos=i;
			}
		}
		
		System.out.println("La prenotazione con il prezzo maggiore è: ");
		System.out.println(Prenotazioni.get(pos).ToString());
		}	
	}
	
	
	void spesaMedia()
	{
		ArrayList<Prenotazione>copia=Prenotazioni;
		double somma=0; 
		int cont=0; 
		for(int i=0; i<copia.size(); i=0)
		{
			cont=1;
			somma+=copia.get(i).Prezzo;
			for(int k=1; k<copia.size(); k++)
			{
				if(copia.get(i).V.equals(copia.get(k).V))
				{
					cont ++;
				}
			}
			for(int l=1; l<copia.size(); l++)
			{
				if(copia.get(i).V.equals(copia.get(l).V))
				{
					somma=somma+copia.get(l).Prezzo;
					
				}
			}
			
			somma=somma/cont;
			System.out.println("Il prezzo medio per il volo: " + copia.get(i).V.Partenza + " " + copia.get(i).V.OrarioP + " " + copia.get(i).V.Arrivo + " " + copia.get(i).V.OrarioA + " è: " + somma);
			somma=0;
			cont=0;
			for(int j=1; j<copia.size(); j++)
			{
				if(copia.get(i).V.equals(copia.get(j).V))
				{
					copia.remove(j);
				}
			}
			copia.remove(i);
			
		}
	}
	
}