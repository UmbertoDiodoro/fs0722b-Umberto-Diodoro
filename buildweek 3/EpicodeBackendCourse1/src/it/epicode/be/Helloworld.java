package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		System.out.println("This is my first Epicode Java Project!");
		esercizio2();
		concatena("ciao",1);
		esercizio3();
		esercizio4();
		}
			public static void esercizio2 () {
			Scanner sn= new Scanner(System.in);
			
			System.out.print("primo numero:");
			int dato1=sn.nextInt() ;
			System.out.print("secondo numero:");
			int dato2=sn.nextInt () ;
			System.out.print("risultato:");
			System.out.print(moltiplica(dato1,dato2));
	
			System.out.print("fornisci una frase:");
			String abc=sn.next() ;
			System.out.print("fornisci un numero:");
			int dato3=sn.nextInt () ;
			System.out.print("risultato:");
			System.out.print(concatena(abc ,dato3));
			
			System.out.print("fornisci frase numero 1:");
			String arr[]= new String[5];
			arr[0]=sn.next() ;
			System.out.print("fornisci frase numero 2:");
			arr[1]=sn.next() ;
			System.out.print("fornisci frase numero 3:");
			arr[2]=sn.next() ;
			System.out.print("fornisci frase numero 4:");
			arr[3]=sn.next() ;
			System.out.print("fornisci frase numero 5:");
			arr[4]=sn.next() ;
			System.out.print("fornisci frase in mezzo:");
			String strmom =sn.next();
			String[] res = inserisciInArray(arr, strmom);
			System.out.print(res[0]);
			System.out.print(res[1]);
			System.out.print(res[2]);
			System.out.print(res[3]);
			System.out.print(res[4]);
			System.out.print(res[5]);
			
			String str1=sn.next();
			System.out.print("fornisci frase numero 1:");
			String str2=sn.next();
			System.out.print("fornisci frase numero 2:");
			String str3=sn.next();
			System.out.print("fornisci frase numero 3:");
			stringhe(str1,str2,str3);
			stringheInverse(str1,str2,str3);
			}
			
			public static void esercizio3() {
				Scanner sn= new Scanner(System.in);
				System.out.print("fornisci frase numero 1:");
				String str1=sn.next();
				System.out.print("fornisci frase numero 2:");
				String str2=sn.next();
				System.out.print("fornisci frase numero 3:");
				String str3=sn.next();
				
				stringhe(str1,str2,str3);
				stringheInverse(str1,str2,str3);
			}
			public static void esercizio4() {
				Scanner sn= new Scanner(System.in);
				System.out.print("fornisci base rettangolo:");
				double db1=sn.nextDouble();
				System.out.print("fornisci altezza rettangolo:");
				double db2=sn.nextDouble();
				System.out.print(perimetroRettangolo(db1,db2));
				
				System.out.print("fornisci numero intero:");
				double nm1=sn.nextDouble();
				System.out.print(pariDispari(nm1));
				
				System.out.print("fornisci base:");
				double ar1=sn.nextDouble();
				System.out.print("fornisci altezza:");
				double ar2=sn.nextDouble();
				System.out.print(areaTriangolo(ar1,ar2));
				
			}
			
			
		
				
			
		public static int moltiplica(int a, int b) {
			return a*b;
		}
		
		public static String concatena (String abc, int a) {
			String first = String.valueOf(a);
			return abc+first;
		}
		
		public static String[] inserisciInArray(String[] arr, String str) {
		String[] arrmom= {"0","0","0","0","0","0"};
		arrmom[0]= arr[0];
		arrmom[1]= arr[1];
		arrmom[2]= str;
		arrmom[3]= arr[2];
		arrmom[4]= arr[3];
		arrmom[5]= arr[4];
		return arrmom ;
		}
		public static void stringhe(String str1, String str2, String str3) {
			System.out.println(str1+" " +str2+" "+str3);
		}
		
	public static void stringheInverse(String str1, String str2, String str3) {
		System.out.println(str3+" " +str2+" "+str1);
		}
	public static double perimetroRettangolo(double a, double b) {
		return (a+b)*2;
	}
	public static double pariDispari(double var) {
		if(var%2==0) {
			return 0;
		}else return 1;
	}
	public static double areaTriangolo(double a,double h) {
	return (a*h)/2;
	}
}




