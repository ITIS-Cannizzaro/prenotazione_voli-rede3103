package voli;
public abstract class Persona 
{   
	String Nome, Cognome;
	public Persona(String nome, String cognome) 
	{
		Nome=nome;
		Cognome=cognome;
	}
	
	 abstract String generalita();
	}