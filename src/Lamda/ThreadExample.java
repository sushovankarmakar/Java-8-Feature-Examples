package Lamda;

public class ThreadExample {
    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();

        Thread t1 = new Thread(()->thread.numberPrinter());
        t1.start();

        Thread t2 = new Thread((thread::numberPrinter));
        t2.start();

        /*thread.numberPrinter();
        thread.numberPrinter();
        thread.numberPrinter();*/
    }

    void numberPrinter() {
        for (int i=0; i < 100; i++){
            System.out.println("\t"+i);
        }
    }
}
