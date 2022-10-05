import java.util.Date;

public class Analyste extends Salarie{
	
	private int nbDeplacement;

	public Analyste(int code, String nom, String prenom, Date d, int nbDeplacement) {
		super(code, nom, prenom, d);
		this.nbDeplacement = nbDeplacement;
	}
	
	public int getNbDeplacement() {
		return this.nbDeplacement;
	}
	
	public void setNbDeplacement(int nbD) {
		this.nbDeplacement = nbD;
	}
	
	public String toString() {
		return " code :" + this.getCode() + " nom : " + this.getNom() + " prenom : " + this.getNbDeplacement();
	}

}
