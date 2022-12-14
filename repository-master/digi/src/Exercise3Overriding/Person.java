package Exercise3Overriding;

public class Person extends Animal {
	@Override
	public void sleep() {
		System.out.println("The person is sleeping");
	}
}
