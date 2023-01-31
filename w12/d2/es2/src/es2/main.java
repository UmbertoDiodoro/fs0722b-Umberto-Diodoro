package es2;

public class main {

	public static void main(String[] args) {
		//es1
		Rettangolo ret= new Rettangolo(3,5);
		stampaRettangolo(ret);		
		Rettangolo ret2= new Rettangolo (10,20);
		stampaDueRettangoli(ret,ret2);
		//es2
		Sim s= new Sim(3342310090L);
		s.stampaSim();
		//es3
		Cliente cliente1 = new Cliente(1, "Mario Rossi", "cliente@cliente.it", "1/1/1900");
		
		Articolo art =new Articolo(6666, "brutto", 13, 2);
		Articolo art2 =new Articolo(66665, "bruttoa", 133, 21);
		Articolo arr[]= {art,art2};
		Carrello c = new Carrello (cliente1,arr);
		System.out.println(c.totaleCostoArticoli);
	}
	
	public static void stampaRettangolo(Rettangolo a) {
		System.out.println(a.calcolaPerimetro());
		System.out.println(a.calcolaArea());
	}
	
	public static void stampaDueRettangoli(Rettangolo a,Rettangolo b){
		System.out.println(a.calcolaPerimetro());
		System.out.println(a.calcolaArea());
		System.out.println(b.calcolaPerimetro());
		System.out.println(b.calcolaArea());
		System.out.println(a.calcolaPerimetro()+b.calcolaPerimetro());
		System.out.println(a.calcolaArea()+b.calcolaArea());
		
	}
	
}
