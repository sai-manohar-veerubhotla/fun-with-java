package ca.javafunblog.basics;

public class FunOnDayTwo{


	public static void main(String[] args) {
		// boolean
		boolean boolOne = true;
		boolean boolTwo = false;


		// identifiers in java
		// an identifier is how we access something in java
		// literal

		// conditional statements in java
		// conditional statements resolve into a boolean value
		// syntax
		// if(a statement which resolves in a boolean){}
		if(boolOne){
			System.out.println(boolOne);
		}

		int a1 = 100;
		// print even or odd
		// % modulo divison - gives you remainder
		// == equality operator in java
		// which checks for equality of two literals 
		// 
		// else cannot exist with out if
		if(a1 % 2 == 0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}

		// find if the given number is either a multiple of
		// 2 or 3.
		// else if cannot exist with out if
		// it is just an other if which exists after the first if

		if(a1 % 2 == 0){
			System.out.println("multiple of 2");
		}else if(a1 % 3 == 0){
			System.out.println("multiple of 3");
		}else{
			System.out.println("Neither a multiple of 2 nor of 3");
		}

		long long1 = 70l;
		// the above statement is same as long long1 = (long) 70;
		System.out.println(long1);

		//

		if(a1 % 2 == 0){
			System.out.println("multiple of 2");
		}else if(a1 % 3 == 0){
			System.out.println("multiple of 3");
		}else if(a1 % 5 == 0){
			System.out.println("multiple of 5");
		}
		else{
			System.out.println("Neither a multiple of 2 nor of 3");
		}

		// 

		System.out.println("---------------------");
		if(a1 % 2 == 0){
			System.out.println("multiple of 2");
		}

		if(a1 % 3 == 0){
			System.out.println("multiple of 3");
		}

		if(a1 % 5 == 0){
			System.out.println("multiple of 5");
		}
		
		System.out.println("----------end-------------");


		// loops in java
		for(int i = 2; i <= 5; i++){
			if(i != 4 && a1 % i == 0){
				System.out.println("Multiple of " + i);
			}
		}

		System.out.println("-------end of for---------");

		
		// syntax
		// for(initialization;conditional;iterational){}
		// working of a for loop
		// initialization -> you might want to initialize a variable
		// that you need inside the loop
		// conditional -> a condition up to which you want to run this loop
		// iterational -> depending on your condition, either decrement or increment
		// 

		// while
		// you have to initialize initial value outside of while
		// syntax -> while(conditional){do something; incremental;}

		int i2 = 2;
		while(i2 <= 5){
			if(i2 != 4 && a1 % i2 == 0){
				System.out.println("Multiple of " + i2);
			}
			i2++;
		}

		System.out.println("-----------end of while----");


		int i3 = 0;
		if(i3 == 0){
			System.out.println("TANUKU");
		}else if(i3 == 1){
			System.out.println("GUDEM");
		}else if(i3 == 2){
			System.out.println("BVRM");
		}else if(i3 == 3){
			System.out.println("PKL");
		}else{
			System.out.println("JAI JAGAN");
		}

		System.out.println("-------------------");

		switch(i3){
			case 0:
				System.out.println("TANUKU");
				break;
			case 1:
				System.out.println("GUDEM");
				break;
			case 2:
				System.out.println("BVRM");
				break;
			case 3:
				System.out.println("PKL");
				break;
			default:
				System.out.println("JAI JAGAN");
		}




		
	}

}