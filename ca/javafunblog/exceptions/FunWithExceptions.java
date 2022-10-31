package ca.javafunblog.exceptions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FunWithExceptions {
    private static void fun1() {
        int x = 1 / 0;
        System.out.println(x);

    }

    // How to handle checked exceptions in java?
    // 1. You either use `throws` keyword. --> meaning, I will not handle the exception
    // 2. You can use a try catch block --> meaning, I will handle the exception.
    private static void fun2() throws FileNotFoundException {
        FileInputStream gfg
                = new FileInputStream("/Desktop/GFG.txt");

    }

    //
    private static void fun3() {
        try {
            FileInputStream gfg
                    = new FileInputStream("/Desktop/GFG.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file you specified does not exist!! ");
        }


    }

    private static void fun4() {
        try {
            FileInputStream gfg
                    = new FileInputStream("/Desktop/GFG.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            // how to throw an exception
            // using `throw` keyword
            throw new RuntimeException("File you specified does not exist!");
        }
    }

    private static void fun5() {
        try {
            FileInputStream gfg
                    = new FileInputStream("/Desktop/GFG.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            // how to throw an exception
            // using `throw` keyword
            throw new MyCustomFileNotFoundException("File does not exist!!");
        }


    }


    private static void fun6() {
        try {
            FileInputStream gfg = new FileInputStream("/Desktop/GFG.txt");
            throw new RuntimeException();
        } catch (FileNotFoundException fileNotFoundException) {
            // how to throw an exception
            // using `throw` keyword
            throw new MyCustomFileNotFoundException("File does not exist!!");
        } catch (RuntimeException runtimeException) {

        }


    }

    private static void fun7() {
        FileInputStream gfg = null;
        try {
            gfg = new FileInputStream("/Desktop/GFG.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            // how to throw an exception
            // using `throw` keyword
            fileNotFoundException.printStackTrace();
        }finally {
            try {
                if(gfg != null){
                    gfg.close();
                }
            }catch (IOException ioException){
                ioException.printStackTrace();
            }
        }


    }

    // a() b() -> a(b()) b(a())

   /* public static void main(String[] args) throws FileNotFoundException {
//        fun1();
//        fun2();
    }*/


    private static void tryWithResources() {
        try(BufferedInputStream bufferedInputStream =
                    new BufferedInputStream(new FileInputStream("/Desktop/GFG.txt"))
        ) {

        } catch (FileNotFoundException e) {
            System.out.println("file not found!!!");
        }catch (IOException e){

        }
    }

    public static void main(String[] args) {
//        fun3();
//        fun4();
//        fun5();
        fun7();
    }

}
