package main.java.myapp.model;

interface Printable {
    // 定数
    double VERSION = 1.2;

    // 抽象メソッド
    void print();

    // defaultメソッド
    public default void getInfo() {
        System.out.println("I/F ver. " + VERSION);
    }

    // staticメソッド
    public static void showInfo() {
        System.out.println("I/F ver. " + VERSION);
    }
}

public class User implements Printable {
    protected String name;
    private static int count;
    private static final double VERSION = 1.1;

    // Static initializer
    static {
        User.count = 0;
        System.out.println("Static initializer");
    }

    // Instance initializer
    {
        System.out.println("Instance initializer");
    }

    public User(String name) {
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }

    public User() {
        // this.name = "Me!";
        this("Me!");
    }

    public void sayHi() {
        System.out.println("hi! " + this.name);
    }

    @Override
    public void print() {
        System.out.println("Now printing user profile...");
    }
}
