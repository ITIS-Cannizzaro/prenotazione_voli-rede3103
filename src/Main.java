package voli;
public class Main {

	public static void main(String[] args) {
		Volo a= new Volo(50, 35, 257, "Roma", "Berlino", "12.30", "15.00");
		Volo b= new Volo(70, 55, 327, "Roma", "New York", "13.30", "01.00");
		Volo c= new Volo(60, 45, 257, "Roma", "Tokyo", "14.30", "00.00");
		Agente z=new Agente("Marco", "Lorenzetti");
		Cliente g=new Cliente("Giorgio", "Napolitano", "Roma", "Berlino", 5);
		Cliente f=new Cliente("Federico", "Locarno", "Roma", "Berlino", 5);
		Cliente h=new Cliente("Federico", "Locarno", "Roma", "Tokyo", 5);
		Cliente i=new Cliente("Federico", "Locarno", "Roma", "Tokyo", 5);
		Cliente y=new Cliente("Federico", "Locarno", "Roma", "New York", 5);
		z.Add(a);
		z.Add(b);
		z.Add(c);
        z.stampa();
        z.prenota(g);
        
        //g.Disdire(z);
        z.stampaP();
        z.prenota(f);
        z.prenota(h);
        z.prenota(i);
        z.prenota(y);
        z.stampaP();
        z.SpesaMinima();
        z.SpesaMassima();
        z.spesaMedia();
	}

}