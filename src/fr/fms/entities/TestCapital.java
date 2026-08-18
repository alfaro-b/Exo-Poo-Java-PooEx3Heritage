package fr.fms.entities;

/**
 * Classe de test de la classe Capital.
 */
public class TestCapital {

    /**
     * Crée plusieurs capitales et affiche leurs informations.
     *
     * @param args arguments de la ligne de commande
     */
	public static void main(String[] args) {

		Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");
		Capital london = new Capital("Londres", "GB", 9400000, "Bigben");
		
		System.out. println(paris);
		System.out. println(london);
	}

}
