package ca.javafunblog.basics;

public class FunOnDaySix {

    static boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == num);
    }


    public static void main(String[] args) {
//        ternaryOperatorDemo();
//        breakDemo();

        primes(20);
    }


    // ternary operator
    // break
    // continue


    static void ternaryOperatorDemo() {
        // it should resolve to a boolean
        // syntax -> (conditional statement) ? "RETURN THIS" : "RETURN THIS";
        int i = 10;
        String result1 = "";
        if (i == 10) {
            result1 = "The value of i is 10";
        } else {
            result1 = "The value of i is not 10";
        }
        System.out.println(result1);

        // can be written as
        String result = i == 10 ? "The value of i is 10" :
                "The value of i is not 10";
        System.out.println(result);

        i = 20;
        // complex ternary
        String complexResult = i == 10 ?
                ((i % 2 == 0) ? "The value of i is 10 and it is even!" :
                        "The value of i is 10 and it is not even!") :
                "The value of i is not 10";

        System.out.println(complexResult);
    }


    public static void breakDemo() {
        // wherever you use break, it applies to the underlying loop
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(findIndex(array, 3));

    }

    public static int findIndex(int[] array, int num) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
                break;
            }
        }

        return index;
    }


    // FOR SHOWING CONTINUE DEMO
    // prime is a number which has 1 and itself as factors
    //
    public static void primes(int num) {
        for (int i = 1; i < num; i++) {
            if(isPrimeImproved(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return true;
        }
        int count = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        return count == 2 ? true : false;
    }

    public static boolean isPrimeImproved(int num) {
        if (num == 1) {
            return true;
        }

        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }


}