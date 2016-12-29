//comptage du nombre de caractere 
//author sebastien
//beWeb

import java.util.*;
//importation de la bibliotheque java

public class exo3{
//appel du fichier compile
	public static void main(String[] args){
	//on recupere les parametre passer dans le terminal
	//on stocke le 1er parametre dans le string word
		String word = args[0];
	//on stocke le 1er parametre dans le string word
		String carac = args[1];
		int resultat = 0;
		int i = 0;
	//on boucle tanque i est inferieur a la longueur de word
		while(i < word.length()){
		//word.charAt(i) => on recupere le caractere a l'index i de word
		//carac.charAt(0) => on recupere le caractere a l'index 0 de carac
			if(word.charAt(i) == carac.charAt(0)){
				resultat++;
			}
		i++;
		}
	System.out.println("le nombre de caractereRecherche est : "+resultat);
	}

}
