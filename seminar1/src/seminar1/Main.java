package seminar1;

import clase.Animal;
import clase.Lion;
import clase.WildCat;
import clase.Zoo;

public class Main {
	
	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Animal lion1=new Lion("Leo");
		Animal lion2=new Lion("Leona");
		zoo.addAnimal(lion1);
		zoo.addAnimal(lion2);
		zoo.feedAllAnimals();
		
		WildCat cat=new WildCat("Pisica1");
		WildCat cat2=new WildCat("Pisica2","Mancare2");
		zoo.addAnimal(cat);
		zoo.addAnimal(cat2);
		zoo.feedAllAnimals();
	}
	
	
}
