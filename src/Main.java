import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	//private Map <Integer, Salarie>hmap = new HashMap<Integer,Salarie>();
	
	public Main() {
		//this.hmap = new HashMap();
	}	
	
	
	public static void main(String[] args) {
	Map <Integer, Salarie>hmap = new HashMap<Integer,Salarie>();	
	//System.out.println("test");
	int number = 0;
	
	while(number!=3) {
	
	Scanner inputReader = new Scanner(System.in);
	System.out.println("Entrez un chiffre entre entre 1 et 6");
	number = inputReader.nextInt();
	
	System.out.println("Ton nombre est : "+number);
	
	
	if (number == 1) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Entrez le code du concepteur"); //code concepteur
		int concepteur_code = inputReader.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Entrez le nom du concepteur");  //nom concepteur
		String concepteur_nom = inputReader.next();      
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("Entrez le prenom du concepteur"); //prenom concepteur
		String concepteur_prenom = inputReader.next();
		
		//Scanner s4 = new Scanner(System.in);
		//System.out.println("Entrez le code du concepteur");
		//Date date = inputReader.nextDate();                    //On peut pas rentrer une date new SimpleFormateDate()
		
		Scanner s5 = new Scanner(System.in);
		System.out.println("Entrez le nombre d'années d'activités du concepteur");
		int nbAnnee = inputReader.nextInt();
		
		Date date = new Date();
		
		Concepteur c1 = new Concepteur(concepteur_code, concepteur_nom, concepteur_prenom, date, nbAnnee);
		hmap.put( c1.getCode(), c1 );
		//System.out.println(hmap);
	}//fin (si input == 1)
	
	if(number == 2) {				
		Scanner s0 = new Scanner(System.in);
		System.out.println("Entrez le code du concepteur");
		int r = inputReader.nextInt();
		
		if ( hmap.get(r) instanceof Concepteur ) {
		hmap.remove(r);	}
		else {
			System.out.println("Le code entré n'est pas un concepteur.");
		}
		if (hmap.containsKey(r) == false) {
			System.out.println("La clé n'existe pas");
		}
		
	}//fin si ==2
	
	if(number == 4) {
		Scanner s10 = new Scanner(System.in);
		System.out.println("Entrez le code de l'analyste"); //code analyste
		int A_code = inputReader.nextInt();
	
		Scanner s11 = new Scanner(System.in);
		System.out.println("Entrez le nom de l'analyste"); //nom analyste
		String A_nom = inputReader.next();
		
		Scanner s12 = new Scanner(System.in);
		System.out.println("Entrez le code du concepteur"); //prenom analyste
		String A_prenom = inputReader.next();
		
		Date d = new Date();
	
		Scanner s13 = new Scanner(System.in);
		System.out.println("Entrez le nombre de deplacement de l'analyste"); //deplacement analyste
		int A_deplacement = inputReader.nextInt();
		
		Analyste a1 = new Analyste(A_code, A_nom, A_prenom, d, A_deplacement);
		hmap.put(a1.getCode(), a1);
	}//fin si == 

	if(number == 5) {				
		Scanner s14 = new Scanner(System.in);
		System.out.println("Entrez le code du analyste que vous souhaitez supprimer");
		int r = inputReader.nextInt();
		if ( hmap.get(r) instanceof Analyste ) {
		hmap.remove(r);
		}
	}//fin si == 5
	
	if (number == 6) {
		/*
		Map <Integer, String>hmap_string = new HashMap<Integer,String>();
		for(int i=1; i <= hmap.size(); i++) {
			if(hmap.get(i) instanceof Concepteur) {
				hmap_string.put(i, "Concepteur");
			}
			else if (hmap.get(i) instanceof Analyste) {
				hmap_string.put(i, "Analyste");
			}
		}
		System.out.println(hmap_string);
		*/
		for (Map.Entry mapentry : hmap.entrySet()) {
			if (mapentry.getValue() instanceof Concepteur) {
				System.out.println("Concepteur : " + " clé: "+mapentry.getKey() + " | valeur: " + mapentry.getValue().toString());
			}
			else if (mapentry.getValue() instanceof Analyste) {
				System.out.println("Analyste : " + " clé: "+mapentry.getKey() + " | valeur: " + mapentry.getValue().toString());
			}
		}
		
	}//fin si == 6
	
	
	}//fin while (donc == 3)
	
	for (Map.Entry mapentry : hmap.entrySet()) {
		if (mapentry.getValue() instanceof Concepteur) {
			System.out.println("Concepteur : " + "clé: "+mapentry.getKey() + mapentry.getValue().toString());
			//System.out.println("clé: "+mapentry.getKey() + " | valeur: " + mapentry.getValue().toString());
		}
	}
	
	

	
	}//fin methode main

}//fin class Main
