package ca.javafunblog.basics;

import java.util.Optional;

public class FunOnDayFour{
	// Reverse a String in java?
	// Check if a String is a palindrome?
	// Check if a number is a palindrome?

	int a1 = 10;
	int aInstance;
	// rule of thumb?
	// when you see a variable,
	// 1. check if it is defined inside a method
	// 2. check if it has `static` in its definition
	// 3. IF IT DOESN'T, IT IS AN INSTANCE VARIABLE.

	static int a2 = 10;
	// 1. check if it is defined inside a method
	// 2. check if it has `static` in its definition
	// 3. IF IT HAS `static` in its def., IT IS A STATIC VARIABLE.



	// 1. check if the method definition has `static` in it.
	// 2. IF IT HAS `static` in its def., IT IS A STATIC METHOD.

	// syntax -> returnType methodName(Method parameters){}

	// method definition
	static void myFirstStaticMethod(){
		System.out.println("I am the first static method!!~!!!");
	}

	int addOne(){
		System.out.println("I am the first instance method!!~!!!");
		a1 = a1 + 1;
		return a1;
	}

	static int subtractOne(){
		a2 = a2 - 1;
		return a2;
	}


	public static void main(String[] args) {
		// what is the key difference between static and instance?
		String s1 = "Ruby🤣";
		s1.length();

		// https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
		// static method
		Optional<String> o = Optional.of(s1);
		// invocation
		myFirstStaticMethod();

		// instance method invocation from a static context
		// 1. YOU NEED AN OBJECT (WHOSE OBJECT?)
		// 2. THE OBJECT OF THE CLASS WHERE THE METHOD IS DEFINED.
		// 3. objectOfTheClass.methodName();


		// OBJECT CREATION
		// SYNTAX -> ClassName objectName = new ClassName();
		FunOnDayFour object1 = new FunOnDayFour(); 
		int value = object1.addOne();
		System.out.println(value);

		// how to access an instance variable in a static context?
		System.out.println(object1.a1);

		FunOnDayFour object2 = new FunOnDayFour();
		System.out.println(object2.a1); // 10

		System.out.println("a2 before subtractOne is invoked: " + a2); // 10
		subtractOne();
		System.out.println("a2 after subtractOne was invoked: " + a2); // 9


		// 1. Static is class level
		// 2. Instance is object specific.

		// constructor

		FunOnDayFour object3 = new FunOnDayFour(111);
		System.out.println("aInstance for object3: " + object3.aInstance);


	}





	// constructor definition
	// 1. IT WILL NOT HAVE A RETURN TYPE
	// 2. A CONSTRUCTOR'S NAME SHOULD MATCH WITH THE CLASS NAME
	// 3. By default, WHEN A CLASS IS CREATED, JAVA PROVIDES A CLASS WITH A DEFAULT
	// NO-ARGUMENT CONSTRUCTOR PROVIDED IF YOU DO NOT WRITE ANY CONSTRUCTORS.
	// 4. ONCE YOU DEFINE A CONSTRUCTOR, THE JVM WILL NOT PROVIDE YOU WITH A DEFAULT CONSTRUCTOR
	// IT IS YOUR RESPONSIBILITY TO CREATE A NO-ARG CONSTRUCTOR

	FunOnDayFour(){
		System.out.println("I am inside the default constructor");
	}

	FunOnDayFour(int a){
		System.out.println("I am inside a parametrized constructor");
		aInstance = a;
	}




  	







}