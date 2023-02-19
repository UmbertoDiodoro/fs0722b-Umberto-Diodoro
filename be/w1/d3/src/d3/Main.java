package d3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	boolean res =stringaPariDispari("Is this supposed to be a challenge?");
		System.out.println(res);
	boolean anno=annoBisestile(400);
	System.out.println(anno);
	stampaSwitch(2);
	dividiLettere();
	contoAllaRovescia(20);
	}
	public static boolean stringaPariDispari(String a) {
		if (a.length()%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int a) {
		if(a%4==0 ||a%100==0 && a%400==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void stampaSwitch(int a) {
		
		switch(a) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("errore");
			break;
		}
	}
	static Scanner input1 = new Scanner(System.in);
	public static void dividiLettere() {
		System.out.println("inserire stringa, per uscire inserisci :q ");
		String str= input1.nextLine().trim();
	while (!str.equalsIgnoreCase(":q")) {
		System.out.println(String.join(",",str.split("")));
		System.out.println("inserisci una stringa, per uscire inserisci :q");
		str= input1.nextLine().trim();
		}
	System.out.println("bravo hai inserito la stringa di uscita");
	}
	
	static Scanner input2 = new Scanner(System.in);
	public static void contoAllaRovescia(int a) {
		
		for( int i=a;i>0;i--) {
			System.out.println(i+ " ");
		}
	}
}
