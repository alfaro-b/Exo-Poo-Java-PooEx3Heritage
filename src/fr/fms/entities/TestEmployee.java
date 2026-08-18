package fr.fms.entities;

public class TestEmployee {

	/**
	* Crée plusieurs employés et affiche leurs informations.
	*
	* @param args arguments de la ligne de commande
	*/
	public static void main(String[] args) {

		Employee gate = new Employee("Gate", "Bill", 65, "USA", new Capital("Washington", "USA", 7600000, "W-M"),  "Fondation B&M", 100000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "palo alto",new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);
			
		System.out.println(gate);
		System.out. println(musk);
	}

}


