package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppg5 {
	
public static void main(String[] args) {
		
		char karakter = ' ';
		boolean gyldig = false;
		for (int antall = 1; antall<=10; antall++){		
		
		gyldig = false;
		
		while(!gyldig) { 
			
		int p = parseInt(showInputDialog("Studentnr:" + antall + "\n" +  "Fikk antall poeng: "));
		if(antall>=0 && antall <101) {
		gyldig = true;
		}
		
		if 
		(0 <= p && p <= 39) {
		karakter = 'F';
		}
		
		else if (39 < p && p <= 49) {
		karakter = 'E';
		}
		
		else if
		(49 < p && p <= 59) {
		karakter = 'D';
		}
		
		else if
		(59 < p && p <= 79) {
		karakter = 'C';
		}	
		
		else if
		(79 < p && p <= 89) {
		karakter = 'B';
		}
		
		else if
		(89 < p && p <= 100) {
		karakter = 'A';
		}
		
		else {
			showMessageDialog(null,"Ikke Gyldig");
			gyldig = false;
		}
		
	}
	showMessageDialog(null,"Studenten fikk karakter: " + karakter);	
		}		
}

}
