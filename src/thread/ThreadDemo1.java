package thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1=new MyThread1();
        Thread t2=new MyThread2();
        t1.start();
        t2.start();
//        for(int i=0;i<1000;i++){
//            System.out.println("hello");
//        }
//        for(int i=0;i<1000;i++){
//            System.out.println("你好");
//        }

    }
}
class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 55; i++) {
            System.out.println("hello");
        }
    }


}
 class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<55;i++){
            System.out.println("你好");
        }
    }
 }
