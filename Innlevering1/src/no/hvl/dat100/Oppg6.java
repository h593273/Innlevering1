package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppg6 {
	
	public static void main(String[] args) {

		
		int fakultet = sum(parseInt(showInputDialog("skriv inn et heltall:")));		
		
		showMessageDialog(null, fakultet);
	    }
	
		public static int sum(int n) {	
		
		if (n<0) {
			showMessageDialog(null,"Ugyldig verdi");
		}
			
		if (n>0) {
		
		return n*sum(n-1); }
		
		else {return 1;}	
	}

}
