package thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo=new Foo();
        Thread t1=new Thread(){
            public void run(){
                foo.method4();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                foo.method5();
            }
        };
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void method4() {
        Thread t = Thread.currentThread();
        System.out.println("正在执行A方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + ":执行A方法完毕");
    }
        public  void method5() {
        synchronized (this){
        Thread t=Thread.currentThread();
            System.out.println("正在执行B方法");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + ":执行B方法完毕");
        }
    }}
