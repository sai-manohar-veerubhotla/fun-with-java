import java.util.Arrays;

public class FunOnDayThree{
	public static void main(String[] args) {
		// 1. print only even numbers from 1 to 100
		// 2. print the first 30 multiples of 3 
		// 3. calculate the sum of first 30 integers

		// String class in java
		// string in java is nothing but an array of characters
		// syntax -> String someIdentifier = "I am a String";
		String string1 = "JAVA"; // -> string literal!
		System.out.println(string1);
		// String in java is not a primitive. it is an object.
		System.out.println(string1.toLowerCase()); // java
		System.out.println(string1.equals("java"));
		System.out.println(string1.equals("JAVA"));
		System.out.println(string1.equalsIgnoreCase("java"));
		// this will create a new String in memory called 
		// "java"
		// string1 -> "JAVA"     "java"
		string1 = string1.toLowerCase(); 
		System.out.println(string1);

		char[] chars = string1.toCharArray();
		System.out.println(Arrays.toString(chars));

		System.out.println("length: " + string1.length());
		// string concatenation in java 
		// combining two strings
		String string2 = "Java" + " " + "Ruby" + " " + 5;
		System.out.println(string2);

		String string3 = 5 + " Java" + " " + "Ruby" + " " + 5;
		System.out.println(string3);

		System.out.println(5 + 1 + " Java" + " " + "Ruby" + " " + 5);
		// arrays
		// array is also an object in java
		// array index starts with 0
		// synatx -> type[] identifier = new type[length]; 
		// identifier[0] = 0;
		// identifier[1] = 1'
		int[] array1 = new int[2];
		array1[0] = 0;
		array1[1] = 1;
		System.out.println(Arrays.toString(array1));
		// array1[2] = 2; // will throw a INDEX OUT OF BOUND EXCEPTION at runtime

		System.out.println(array1.length); // length literal

		for(int i = 0; i < 2; i++){
			System.out.println(array1[i]);
		}

		int[] array2 = new int[3];
		array2[0] = 10;
		array2[1] = 11;
		array2[2] = 12;

		for(int i = 0; i < array2.length; i++){
			System.out.println(array2[i]);
		}

		int[] array3 = new int[10];
		for(int i = 0; i < array3.length; i++){
			array3[i] = i + 1;
		}

	System.out.println(Arrays.toString(array3));

	char[] charArray = new char[4];
	charArray[0] = 'R';
	charArray[1] = 'u';
	charArray[2] = 'b';
	charArray[3] = 'y';

	System.out.println(Arrays.toString(charArray));

	String string4 = "Vamsi";
	char[] charArray2 = string4.toCharArray();
	// the above line is same as follows:
	char[] charArray3 = new char[]{'V', 'a', 'm', 's', 'i'};
	System.out.println(Arrays.toString(charArray2));
	System.out.println(Arrays.toString(charArray3));
	System.out.println(charArray2);

	int[] int4 = new int[]{1, 2, 3, 4};
	System.out.println(int4);

	// toString() is a method in the Object class -> the root of all classes
	// hashCode() is a method in the Object class -> 
	// equals()

	}
}