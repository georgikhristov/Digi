package exercises;

public class Exercise2Fibonacci {

	public static void main(String[] args) {

		int fib = 8;
		System.out.println("Fibbonaci of " + fib + " is " + fibonacci(fib));

	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2); // here I have used a tail recursive function
	}

}
