package factory;

import animal.Animal;

public abstract class AnimalFactory {
    
	public void renderAnimal() {
		
		Animal ca = createAnimal();
		ca.getName();
		ca.getSound();
		ca.getFood();
		
	}
	
	public abstract Animal createAnimal();
}
