package Exercise3Overriding;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

// In overriding we have inheritance involved which increases the 
// readability and the scale of the program

		Person person = new Person();
		Cat cat = new Cat();
		Dog dog = new Dog();

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(cat);
		animals.add(dog);
		animals.add(person);
//Polymorphism		
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).sleep();
		}

	}

}
