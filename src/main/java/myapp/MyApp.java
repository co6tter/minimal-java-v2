package main.java.myapp;

import java.util.*;
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

class MyData<T> {
    public void getThree(T x) {
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print('*');
        }
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
        Integer i1 = 32; // auto boxing
        int n = i1.intValue(); // auto unboxing
        System.out.println(n);

        // 参照型のみ
        MyData<Integer> d1 = new MyData<>();
        d1.getThree(100);

        MyData<String> d2 = new MyData<>();
        d2.getThree("Hello");

        // MyRunnable r = new MyRunnable();
        // Thread t = new Thread(r);
        // t.start();

        // new Thread(new MyRunnable()).start();

        // 無名クラス
        // インターフェースをインスタンス化しているように見えるが、実際はそのインターフェースを実装しているクラスをインスタンス化している
        // 抽象メソッドを一つだけ持つインターフェースのことを入力に対して出力が一つだけに定まるという意味で「関数型インターフェース」と呼ぶ
        // new Thread(new Runnable() {
        // @Override
        // public void run() {
        // for (int i = 0; i < 500; i++) {
        // System.out.print('*');
        // }
        // }
        // }).start();

        // ラムダ式
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.print('*');
            }
        }).start();

        for (int i = 0; i < 500; i++) {
            System.out.print('.');
        }

        String s1 = "ab";
        String s2 = "ab";
        if (s1.equals(s2)) {
            System.out.println("same!");
        }

        // ==は参照型データ場合のメモリアドレスを比較する
        // 文字列型は基本データ型となるべく同じように振る舞うように調整がされていて、すでに宣言されている文字列と同じものを宣言した場合は同じメモリ領域を使い回す
        if (s1 == s2) {
            System.out.println("same!same!");
        }

        // 明示的にnewを使って新しく作成した場合はメモリアドレスが異なる
        String ss1 = new String("ab");
        String ss2 = new String("ab");
        if (ss1 == ss2) {
            System.out.println("same!same!same!");
        }

        // ArrayList<Integer> sales = new ArrayList<>();
        List<Integer> sales = new ArrayList<>();
        sales.add(10);
        sales.add(20);
        sales.add(30);

        for (int i = 0; i < sales.size(); i++) {
            System.out.println(sales.get(i));
        }

        sales.set(0, 100);
        sales.remove(2);

        for (Integer sale : sales) {
            System.out.println(sale);
        }

        // HashSet<Integer> sales2 = new HashSet<>();
        Set<Integer> sales2 = new HashSet<>();
        sales2.add(10);
        sales2.add(20);
        sales2.add(30);
        sales2.add(10);

        System.out.println(sales2.size()); // 3

        for (Integer sale : sales2) {
            System.out.println(sale);
        }

        sales2.remove(30);

        for (Integer sale : sales2) {
            System.out.println(sale);
        }

        HashMap<String, Integer> sales3 = new HashMap<>();
        sales3.put("Tom", 10);
        sales3.put("Bob", 20);
        sales3.put("John", 30);

        System.out.println(sales3.get("Tom")); // 10
        System.out.println(sales3.size()); // 3

        for (Map.Entry<String, Integer> sale : sales3.entrySet()) {
            System.out.println(sale.getKey() + " : " + sale.getValue());
        }

        List<Integer> sales4 = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));

        sales4.stream().filter(e -> e % 3 == 0).map(e -> "(" + e + ")").forEach(System.out::println);
    }
}
