package fr.fms.entities;

/**
 * Représente une ville avec son nom, son pays et sa population.
 * La classe permet également de compter le nombre de villes créées.
 */
public class City {
	// =========================
    // ATTRIBUTS
    // =========================

	private String name;
	private String country;
	private int population;
	
	// Compteur commun à toutes les instances de City
	private static int counter = 0;
	
	// =========================
    // CONSTRUCTEURS
    // =========================
	
	/**
     * Crée une ville avec son nom, son pays et sa population.
     *
     * @param name       nom de la ville
     * @param country    pays de la ville
     * @param population nombre d'habitants
     */
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country; 
		this.population = population;
		counter++;
	}
	 /**
     * Crée une ville avec son nom et sa population.
     * Le pays est défini par défaut à "unknown".
     *
     * @param name       nom de la ville
     * @param population nombre d'habitants
     */
	public City(String name, int population) {
		this.name = name;
		this.country = "unknown"; 
		this.population = population;
		counter++;
	}
	 /**
     * Crée une ville avec son nom et son pays.
     * La population est initialisée à 0.
     *
     * @param name    nom de la ville
     * @param country pays de la ville
     */
	public City(String name, String country) {
		this.name = name;
		this.country = country; 
		this.population = 0;
		counter++;
	}
	
	// =========================
    // ACCESSEURS
    // =========================
	
	/**
     * Retourne le nom de la ville.
     *
     * @return le nom de la ville
     */
	public String getName() {
		return name;
	}
	/**
     * Modifie le nom de la ville.
     *
     * @param name nouveau nom de la ville
     */
	public void setName(String name) {
		this.name = name;
	}
	/**
     * Retourne le pays de la ville.
     *
     * @return le pays de la ville
     */
	public String getCountry() {
		return country;
	}
	/**
     * Modifie le pays de la ville.
     *
     * @param country nouveau pays de la ville
     */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
     * Retourne la population de la ville.
     *
     * @return le nombre d'habitants
     */
	public int getPopulation() {
		return population;
	}
	/**
     * Modifie la population de la ville.
     *
     * @param population nouveau nombre d'habitants
     */
	public void setPopulation(int population) {
		this.population = population;
	}
	/**
     * Retourne le nombre d'instances de City créées.
     *
     * @return le nombre de villes créées
     */
	public static int getCounter() {
		return counter;
	}

	
	// =========================
    // MÉTHODES
    // =========================
	
	/**
     * Retourne une représentation textuelle de la ville.
     *
     * @return les informations de la ville sous forme de phrase
     */
    @Override
	public String toString() {
		return  this.name + ", " +
				this.country + ", " +
				this.population + " d'habitants ";
	}

	/**
     * Retourne le nom et le pays d'une ville de naissance.
     *
     * @return les informations de la ville de naissance
     */
	public String getBirthCityInfo() {	
	    return "Ville de naissance : " + this.name + ", " +
		           this.country;
	}
	
}
