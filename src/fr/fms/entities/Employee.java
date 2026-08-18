package fr.fms.entities;

public class Employee extends Person{

	// =========================
    // ATTRIBUTS
    // =========================
	private String company;
	private double salary;
	
    /**
     * Crée un employé.
     *
     * @param name nom de l'employé
     * @param firstName Prénom de l'employé
     * @param address Adresse de l'employé
     * @param birthCity Ville de naissance de l'employé
     * @param company Entreprise dans laquelle travaille l'employé
     * @param salary Salaire de l'employé
     */
	public Employee(String name, String firstName, int age, String address, City birthCity, String company, double salary) {
		super(name, firstName, age, address, birthCity);
		this.company = company;
		this.salary = salary;
	}

    // =========================
    // ACCESSEURS
    // =========================

    /**
     * Retourne l'entreprise de l'employé.
     *
     * @return L'entreprise
     */
	public String getCompany() {
		return company;
	}
    /**
     * Modifie L'entreprise de l'employé.
     *
     * @param company nouvelle entreprise
     */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
     * Retourne le salaire de l'employé.
     *
     * @return Le salaire
     */
	public double getSalary() {
		return salary;
	}
    /**
     * Modifie Le salaire de l'employé.
     *
     * @param salary nouveau salaire
     */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// =========================
    // MÉTHODES
    // =========================

    /**
     * Retourne les informations de l'employé,
     * en complétant celles héritées de Person avec son entreprise et son salaire.
     *
     * @return les informations de l'employé
     */
	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + this.company + ", " + "salaire : " + this.salary;
	}
}
