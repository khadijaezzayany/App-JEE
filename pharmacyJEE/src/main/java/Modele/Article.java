package Modele;

public class Article {
	private int id;
	private String nom;
	private int prix;
	private int quantite;

	public Article() {
		super();
	}

	public Article(String nom, int prix, int quantite) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Article(int id, String nom, int prix, int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
