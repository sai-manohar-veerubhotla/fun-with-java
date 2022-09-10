package ca.javafunblog.basics;

public class FunOnDayOne{

	int someInt = 10;

	public static void main(String[] args) {
		System.out.println();
		// primitives in java
		// primitive types 
		// syntax -> `type variableName = something;`
		int intOne = 1;
		// naku oka variable kavali -> and ah variable lo value 1 avvali
		System.out.println(intOne);
		int intTwo = 2;
		System.out.println(intTwo);
		int sumOne = intOne + intTwo;
		System.out.println(sumOne);

		byte byteOne = 1;
		short shortOne = 1;
		char charOne = 22;
		// only one char in between ''
		char charTwo = 'C';
		System.out.println(charOne);
		System.out.println(charTwo);

		// internally, char in java is an unsigned int
		//char charOne = -22;

		char charThree = 15;
		// System.out.println((int)charThree);

		// ANY FLOATING POINT NUMBER IN JAVA IS  BY DEFAULT A DOUBLE
		// float floatOne = 1.02;
		float floatTwo = 1.02f;
		double doubleOne = 1.02;
		System.out.println(floatTwo);
		System.out.println(doubleOne);

		long longOne = 2;
		System.out.println(longOne);

		// byte < short <     < int < float < long < double
		//                char 

		// conversions

		// byte -127 to 127
		byte byteConv = 1;
		// byte byteConv2 = -22;
		short shortConv = byteConv;
		int intConv = byteConv;
		float floatConv = byteConv;
		long longConv = byteConv;
		double doubleConv = byteConv;

		System.out.println(byteConv);
		System.out.println(shortConv);
		System.out.println(intConv);
		System.out.println(floatConv);
		System.out.println(longConv);
		System.out.println(doubleConv);
		// System.out.println(byteConv2);

		//short
		// char
		// ANY CONVERSION TO CHAR HAS TO BE EXPLICIT
		// char charConv = byteConv;
		// when you want to store a large type in a small type 
		// we need explicit cast -> called as type casting
		char charConv = (char) byteConv;
		
		// long into int
		long longConv2 = 22;
		int intConv2 = (int)longConv2;
		System.out.println(intConv2);

	}
}