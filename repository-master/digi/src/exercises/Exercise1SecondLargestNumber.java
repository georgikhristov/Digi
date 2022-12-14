package exercises;

public class Exercise1SecondLargestNumber {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 7, 4, 12 };

		secondLargestNumber(arr);
	}

	public static void secondLargestNumber(int arr[]) {
		// Creating two variables to hold the largest and the second largest number.
		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {		 // if the current element is > largest number
				secondLargest = largest; // continuously iterate through the list
				largest = arr[i]; 		// and change the values accordingly

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second largest number is " + secondLargest);
	}
}
