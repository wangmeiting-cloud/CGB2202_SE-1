package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
       Thread main=Thread.currentThread();
        System.out.println(main);

    }
    public static void dosome(){
        Thread t=Thread.currentThread();
        System.out.println("dosome线程："+t);
    }

}
