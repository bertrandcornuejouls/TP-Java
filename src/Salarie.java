import java.util.Date;

public class Salarie {
	
	private int code;
	private String nom;
	private String prenom;
	private Date date;
	
	
	
	
	public Salarie(int code, String nom, String prenom, Date d) {
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.date = d;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String getNom() {
		return this.nom;		
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public Date getDate() {
		return this.getDate();
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setNom(String n) {
		this.nom = n;
	}
	
	public void setPrenom(String p) {
		this.prenom = p;
	}
	
	public void setDate(Date d) {
		this.date = d;
	}
	
}