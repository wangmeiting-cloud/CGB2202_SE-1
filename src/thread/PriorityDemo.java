package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1= new Thread(() -> {
            for(int i=0;i<10000;i++){
                System.out.println("max");
            }
        });
        Thread t2=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread t3=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("hello");
                }
            }
        };
    //    t2.setPriority(1);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
    //    t1.setPriority(10);
        t1.start();
        t2.start();
        t3.start();

    }
}
