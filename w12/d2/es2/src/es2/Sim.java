package es2;

import java.util.Arrays;

public class Sim {
  long numero;
  double credito=0;
  Chiamata ultimeChiamate[]= new Chiamata[5];
 
  public Sim(long a) {
	  this.numero= a;
  }
  
  public void stampaSim() {
	  System.out.println(this.numero +" " +this.credito +" " +Arrays.toString(this.ultimeChiamate));
	  
  }
}
