package fr.fms.entities;

import java.util.ArrayList;

public class TestEntities {

	/**
	* Crée une liste d'objets avec plusieurs employés et commerciaux et affiche leurs informations.
	*
	* @param args arguments de la ligne de commande
	*/
	public static void main(String[] args) {

		Employee gate = new Employee("Gate", "Bill", 65, "USA", new Capital("Washington", "USA", 7600000, "W-M"),  "Fondation B&M", 100000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "palo alto",new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);
		Commercial dupont = new Commercial("Dupont", "Robert", 50, "rue des rosiers à Toulouse", new City("Limoges", "France", 133000), "brico", 5.0);
		
		ArrayList<Object> entities = new ArrayList<>();
		entities.add(gate);
		entities.add(musk);
		entities.add(dupont);
		
		System.out.println("Ex3.6 Affichage des infos à partir d'une liste d'objets");
		System.out.println();
		for (Object entity: entities) {
			if(entity instanceof Employee) System.out.println(((Employee) entity).displayInfosWithoutPopulation());
			else if (entity instanceof Commercial) System.out.println(((Commercial) entity).displayInfosWithoutPopulation());
		}
	}

}
