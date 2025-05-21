package main.java.myapp;

import main.java.myapp.model.User;
import main.java.myapp.model.AdminUser;

enum Result {
    SUCCESS, // 0
    ERROR, // 1
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class MyApp {

    public static void div(int a, int b) {
        try {
            if (b < 0) {
                throw new MyException("not minus!");
            }
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" -- end -- ");
        }
    }

    public static void main(String[] args) {
        User tom = new User("Tom");
        tom.sayHi();
        tom.print();
        tom.getInfo();

        AdminUser bob = new AdminUser("Bob");
        bob.sayHi();
        bob.sayHello();

        Result res = Result.ERROR;
        switch (res) {
            case SUCCESS:
                System.out.println("OK!");
                System.out.println(res.ordinal()); // 0
                break;
            case ERROR:
                System.out.println("NG!");
                System.out.println(res.ordinal()); // 1
                break;
        }

        div(3, 0);
        div(5, -2);

        // Integer i = new Integer(32);
        Integer i = 32; // auto boxing
        int n = i.intValue(); // auto unboxing
        System.out.println(n);

    }
}
