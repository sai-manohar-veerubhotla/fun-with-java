package ca.javafunblog.basics;

import java.util.*;

public class FunOnDayFive{



	// 1. Count the number of characters in a String.
	// Take a String with spaces in it! You shouldn't count spaces.
	// 2. Find the frequency of a character in a String.
	// method(string, character) -> "vamsi" , 'a' -> 1


	static int a1; // 0
	static boolean b1; // false

	int a2 = 10;


	static void methodOne(){
		// any variable you define inside a method is called local variable
		// any variable defined inside a method has to be initialized explicitly 
		// if you want to use it inside the method
		int a2;

		// System.out.println(a2);  error: variable a2 might not have been initialized



		return ;
	}



	void methodTwo(){
		System.out.println(a2); // 10
		int a2 = 12;
		System.out.println(a2); // 12
		// the theory behind it?
		// this is called variable sharding
		// since a2 is defined in this particular method, when you use a2, the local a2 takes precedence
		System.out.println(this.a2); // 10
		// what does `this` mean here?
		// this refers to this particular object
		// this is a reserved keyword in java

		System.out.println(b1); // false
		return ;
	}


	// variable scoping
	// 1. An instance variable can be accessed inside an instance method.
	// 2. A static variable (fields) can be accessed inside an instance method.
	// 3. If there is a local variable which has the same name as an instance variable,
	// and if you want access the instance variable inside the method, use `this`.
	// 4. be it an instance variable/method, if you want to access any instance thing
	// from a static context, you need an object of the underlying class. 


	static void methodThree(){
		System.out.println(b1); // false
		//System.out.println(a2); //  non-static variable a2 cannot be referenced from a static context
		FunOnDayFive f = new FunOnDayFive();
		System.out.println(f.a2);

		return ;
	}


	static void methodFour(){

		int l1 = 2111;
		System.out.println(l1);
		return ;
	}



	int value1;
	int value2;


	public FunOnDayFive(int value1, int value2){
		System.out.println("this.value1: " + this.value1);
		System.out.println("this.value2: " + this.value2);
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		this.value1 = value1;
		this.value2 = value2;
		System.out.println("this.value1: " + this.value1);
		System.out.println("this.value2: " + this.value2);

	}

	
	// method overloading
	// what is method signature?
	// in a method definiton, anything to the right of method return type
	// addLong(long a, long b)
	// rules:
	// 1. Method signature shouldn't be the same
	// 2. Method signature does not include method's return type

	public int add(int a, int b){
		return a+b;
	}

	public long addLong(long a, long b){
		return a + b;
		// System.out.println(a + b); //  error: unreachable statement
	}


	public long add(long a, long b){
		return a + b;
	}

	public long add(int a, long b){
		return a + b;
	}

	public long add(int a, long b, int c){
		return a + b + c;
	}

	public FunOnDayFive(){

	}


	public static void main(String[] args) {
		// methodOne();
		FunOnDayFive f = new FunOnDayFive();
		// f.methodTwo();
		// methodThree();
		// methodFour();
		//the scope of a local variable is inside the method it is defined in
		// System.out.println(l1); // refer to methodFour()

		FunOnDayFive f2 = new FunOnDayFive(999999, 100101010);

		// var is a keyword 


		// the purpose of var is not meant for this:
		var f3 = new FunOnDayFive();


		// it is meant for this 
		Map<String, String> m = new HashMap<>();

		// is same as 

		var m2 = new HashMap<String, String>();

		// this is calle type inference 


		int sum1 = f3.add(1, 1);
		System.out.println("sum1: " + sum1);

		// int sum2 = f3.add(1l, 1l); // incompatible types: possible lossy conversion from long to int
		// System.out.println("sum2: " + sum2);

		long sum3 = f3.addLong(1l, 1l);
		System.out.println("sum3: " + sum3);


		long sum4 = f3.add(1l, 1l);
		System.out.println("sum4: " + sum4);

		long sum5 = f3.add(1, 1l);
		System.out.println("sum5: " + sum5);

		long sum6 = f3.add(1, 1l, 1);
		System.out.println("sum6: " + sum6);

	}
}