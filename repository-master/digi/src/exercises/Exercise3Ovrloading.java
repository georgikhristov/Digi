package exercises;

public class Exercise3Ovrloading {

	public static void main(String[] args) {

		String firstName = "Georgi";
		String secondName = "Tsvetanov";
		String thirdName = "Hristov";
		Exercise3Ovrloading nameObject = new Exercise3Ovrloading();
		System.out.println(nameObject.name(firstName));
		System.out.println(nameObject.name(firstName, secondName));
		System.out.println(nameObject.name(firstName, secondName, thirdName));

	}

// Overloading - same name but different parameters.
	public String name(String firstname) {
		return firstname;
	}

	public String name(String firstname, String secondName) {
		return firstname + secondName;
	}

	public String name(String firstname, String secondName, String thirdName) {
		return firstname + secondName + thirdName;
	}
}
