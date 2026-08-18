package fr.fms.entities;

public class Commercial extends Person{

	// =========================
    // ATTRIBUTS
    // =========================
	private String company;
	private double percentageCA;
	
    /**
     * Crée un commercial.
     *
     * @param name nom du commercial
     * @param firstName Prénom du commercial
     * @param address Adresse du commercial
     * @param birthCity Ville de naissance du commercial
     * @param company Entreprise dans laquelle travaille le commercial
     * @param salary Salaire du commercial
     */
	public Commercial(String name, String firstName, int age, String address, City birthCity, String company, double salary) {
		super(name, firstName, age, address, birthCity);
		this.company = company;
		this.percentageCA = salary;
	}

    // =========================
    // ACCESSEURS
    // =========================

    /**
     * Retourne l'entreprise du commercial.
     *
     * @return L'entreprise
     */
	public String getCompany() {
		return company;
	}
    /**
     * Modifie L'entreprise du commercial.
     *
     * @param company nouvelle entreprise
     */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
     * Retourne la rémunération (càd le pourcetage du CA) du commercial.
     *
     * @return Le pourcentage du CA
     */
	public double getPercentageCAy() {
		return percentageCA;
	}
    /**
     * Modifie la rémunération (càd le pourcetage du CA) du commercial.
     *
     * @param percentageCA nouveau salairepourcentage du CA
     */
	public void setPercentageCA(double percentageCA) {
		this.percentageCA = percentageCA;
	}
	
	// =========================
    // MÉTHODES
    // =========================

    /**
     * Retourne les informations du commercial,
     * en complétant celles héritées de Person avec son entreprise et sa rémunération ( pourcentage du CA).
     *
     * @return les informations du commercial
     */
	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + this.company + ", " + "% CA : " + this.percentageCA;
	}
}
