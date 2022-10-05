import java.util.Date;

public class Concepteur extends Salarie {

	private int nbAnneeDev;

	public Concepteur(int code, String nom, String prenom, Date d, int nbAD) {
		super(code, nom, prenom, d);
		this.nbAnneeDev = nbAD;
	}
	
	public int getNbAnneeDev() {
		return this.nbAnneeDev;
	}
	
	public void setNbAnneeDev(int a) {
		this.nbAnneeDev = a;
	}
	
	public String toString() {
		return " code : " + this.getCode() + "," + " nom : " + this.getNom() + "," + " prenom : " + this.getNbAnneeDev();
	}

}
