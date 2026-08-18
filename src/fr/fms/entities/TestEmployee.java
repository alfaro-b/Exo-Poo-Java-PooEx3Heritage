package fr.fms.entities;

public class TestEmployee {

	/**
	* Crée plusieurs employés et commerciaux et affiche leurs informations.
	*
	* @param args arguments de la ligne de commande
	*/
	public static void main(String[] args) {

		Employee gate = new Employee("Gate", "Bill", 65, "USA", new Capital("Washington", "USA", 7600000, "W-M"),  "Fondation B&M", 100000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "palo alto",new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);
		
		Commercial dupont = new Commercial("Dupont", "Robert", 50, "rue des rosiers à Toulouse", new City("Limoges", "France", 133000), "brico", 5.0);
		
		// Ex3.2 Affichage des emplyés
		System.out. println("Ex3.2");
		System.out.println(gate);
		System.out. println(musk);
		System.out. println();
		
		// Ex3.3 Affichage des commerciaux
		System.out. println("Ex3.3");
		System.out. println(dupont);
	}

}


