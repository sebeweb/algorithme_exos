//perroquet
//author sebastien
//beWeb

//Ceci importe la class Scanner du package java.util nous n'avons pas juger utile d'importer toutes la bibliotheque java
import java.util.Scanner;

public class exo6{
	//appel du fichier compile
	public static void main(String[] args){
		//on initialise un flag a false
		boolean flag = false;
		//on boucle tant que flage egale false
		while(flag == false){
			//on creer un nouvel objet de type Scanner
			//scanner recuperer ce que vous avez saisi 
			Scanner sc = new Scanner(System.in);
			//Sortie standard
			System.out.println("Veuillez saisir un mot :");
			//la méthode nextLine() => \r\n
			String str = sc.nextLine();
			System.out.println("Vous avez saisi : " + str);
			//Sortie standard qui permet d'afficher la phrase ci-dessus
			Scanner clavier = new Scanner(System.in);
			//on creer un nouvel objet de type Scanner : clavier
			boolean quittez = false;
			while(quittez==false){
				System.out.print("Voulez vous quittez (o ou n)? ");
            			char reponse = clavier.next().charAt(0);
            			if (reponse == 'o' || reponse == 'O') {
					//si la reponse est egale a o ou O on quitte le programme
                			System.exit(0);
				}else if (reponse =='n' || reponse == 'N') {
					quittez = true;
				}else{
					System.out.print("J'ai pas compris\r\n");
				}
			}
		}
	}
}
