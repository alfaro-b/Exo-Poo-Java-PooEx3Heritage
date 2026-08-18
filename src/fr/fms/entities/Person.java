package fr.fms.entities;

/**
 * Représente une personne avec son nom, son prénom, son âge, son adresse et
 * éventuellement sa ville de naissance.
 */
public class Person {

	// =========================
	// ATTRIBUTS
	// =========================

	private String name;
	private String firstName;
	private int age;
	private String address;
	private City birthCity;

	// =========================
	// CONSTRUCTEURS
	// =========================

	/**
	 * Crée une personne avec toutes ses informations.
	 *
	 * @param name      nom de la personne
	 * @param firstName prénom de la personne
	 * @param age       âge de la personne
	 * @param address   adresse de la personne
	 * @param birthCity ville de naissance de la personne
	 */
	public Person(String name, String firstName, int age, String address, City birthCity) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.birthCity = birthCity;
	}

	/**
	 * Crée une personne avec son nom, son prénom et son âge. L'adresse est définie
	 * par défaut à "unknown".
	 *
	 * @param name      nom de la personne
	 * @param firstName prénom de la personne
	 * @param age       âge de la personne
	 */
	public Person(String name, String firstName, int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = "unknown";
	}

	/**
	 * Crée une personne avec son nom et son prénom. L'âge est initialisé à 0 et
	 * l'adresse à "unknown".
	 *
	 * @param name      nom de la personne
	 * @param firstName prénom de la personne
	 */
	public Person(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
		this.age = 0;
		this.address = "unknown";
	}

	// =========================
	// ACCESSEURS
	// =========================

	/**
	 * Retourne le nom de la personne.
	 *
	 * @return le nom de la personne
	 */
	public String getName() {
		return name;
	}

	/**
	 * Modifie le nom de la personne.
	 *
	 * @param name nouveau nom
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Retourne le prénom de la personne.
	 *
	 * @return le prénom de la personne
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Modifie le prénom de la personne.
	 *
	 * @param firstName nouveau prénom
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Retourne l'âge de la personne.
	 *
	 * @return l'âge de la personne
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Modifie l'âge de la personne.
	 *
	 * @param age nouvel âge
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Retourne l'adresse de la personne.
	 *
	 * @return l'adresse de la personne
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Modifie l'adresse de la personne.
	 *
	 * @param address nouvelle adresse
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Retourne la ville de naissance de la personne.
	 *
	 * @return la ville de naissance
	 */
	public City getBirthCity() {
		return birthCity;
	}

	/**
	 * Modifie la ville de naissance de la personne.
	 *
	 * @param birthCity nouvelle ville de naissance
	 */
	public void setBirthCity(City birthCity) {
		this.birthCity = birthCity;
	}

	// =========================
	// MÉTHODES
	// =========================

	/**
	 * Retourne les informations de la personne sous forme de chaîne.
	 *
	 * @return les informations de la personne
	 */
	@Override
	public String toString() {
		String result = this.name + ", " + this.firstName + ", " + 
				this.age + "ans, " + "habitant " + this.address + ", ";

		if (this.birthCity != null) {
			result += "Ville de naissance : " + this.birthCity;
		}

		return result;
	}

	/**
	 * Affiche les informations détaillées de la personne.
	 */
	public void displayPersonalities() {
		String result = this.name + ", " + this.firstName + ", " + this.age + "ans, " + "habitant " + this.address;
		if (this.birthCity != null) {
			result += ", " + this.birthCity.getBirthCityPersonality();
		}
		System.out.println(result);
	}

	/**
	 * Affiche la personne si elle est née en France ou si son adresse contient "Paris".
	 */
	public void displayFilterPersonalities() {
	    if ((this.birthCity != null && this.birthCity.getCountry().equalsIgnoreCase("France"))
	            || (this.address != null && this.address.toLowerCase().contains("paris"))) {
	        displayPersonalities();
	    }
	}
}

