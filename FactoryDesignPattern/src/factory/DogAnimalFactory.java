package factory;

import animal.Animal;
import animal.Dog;

public class DogAnimalFactory extends AnimalFactory {
	 @Override
	 public Animal createAnimal() {
		 return new Dog();
	 }
}
