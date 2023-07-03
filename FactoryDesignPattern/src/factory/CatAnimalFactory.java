package factory;

import animal.Animal;
import animal.Cat;


public class CatAnimalFactory extends AnimalFactory {
	@Override
	 public Animal createAnimal() {
		 return new Cat();
	 }
}
