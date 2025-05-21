public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String signal = "red";
        switch (signal) {
            case "red":
                System.out.println("stop!");
                break;
            case "blue":
            case "green":
                System.out.println("go!");
                break;
            case "yellow":
                System.out.println("caution!");
                break;
            default:
                System.out.println("wrong signal!");
                break;
        }

        // int[] sales;
        // sales = new int[3];
        // sales[0] = 100;
        // sales[1] = 200;
        // sales[2] = 300;

        // for (int i = 0; i < sales.length; i++) {
        // System.out.println(sales[i]);
        // }

        int[] sales = { 100, 200, 300 };

        for (int sale : sales) {
            System.out.println(sale);
        }

    }
}
