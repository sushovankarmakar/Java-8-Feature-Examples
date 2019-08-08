package Lamda;

public class ThreadExample1 {
    public static void main(String[] args) {
        ThreadExample1 threadExample1 = new ThreadExample1();
        Thread thread1 = new Thread(()->threadExample1.printNum());
        thread1.start();

        Thread thread2 = new Thread(()->threadExample1.printNum());
        thread2.start();
    }

    void printNum(){
        for (int i = 0; i < 100; i++){
            if(i%2 == 0) {
                System.out.println("two");
            }
            else if(i%3 == 0) {
                System.out.println("three");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
