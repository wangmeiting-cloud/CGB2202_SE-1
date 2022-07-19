package thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        Boo b1=new Boo();
        Boo b2=new Boo();
        Thread t1=new Thread(){
            public void run(){
               b1.dosome();
            }
        };
        Thread t2=new Thread(){
            public void run(){
               b2.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}
class Boo{
    public  static void dosome() {

            try {

                Thread t = Thread.currentThread();
                synchronized (Boo.class) {//指定同步块
                    System.out.println(t.getName() + "正在执行dosome方法");
                    Thread.sleep(3000);
                }
                System.out.println(t.getName() + "执行dosme方法完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
