package fr.fms.entities;

/**
 * Représente une capitale.
 * Une capitale est une ville possédant également un monument.
 */
public class Capital extends City{

    // =========================
    // ATTRIBUTS
    // =========================
	private String monument;
	
    /**
     * Crée une capitale avec son nom, son pays, sa population et son monument.
     *
     * @param name nom de la capitale
     * @param country pays de la capitale
     * @param population nombre d'habitants
     * @param monument monument de la capitale
     */
	public Capital(String name, String country, int population, String monument) {
		super(name, country, population);
		this.monument = monument;
	}

    // =========================
    // ACCESSEURS
    // =========================

    /**
     * Retourne le monument de la capitale.
     *
     * @return le monument
     */
	public String getMonument() {
		return monument;
	}
    /**
     * Modifie le monument de la capitale.
     *
     * @param monument nouveau monument
     */
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
    // MÉTHODES
    // =========================

    /**
     * Retourne les informations de la capitale,
     * en complétant celles héritées de City avec son monument.
     *
     * @return les informations de la capitale
     */
	@Override
	public String toString() {
		return super.toString() + " monument : " + monument + " ";
	}

}
