package thread;

public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    int bean = table.getBean();
                  //  Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }

            }

        };
        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    int bean = table.getBean();
                   // Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }

            }

        };
        t1.start();
        t2.start();
    }
}
        class Table{
            private int beans=20;
            public synchronized int getBean(){//synchronized  同步   可解决多线程并发安全问题
                if(beans==0){
                    throw new RuntimeException("没有豆子了");

                }
         // Thread.yield();//让出 模拟执行到这里CPU时间片用尽发生线程切换
                return beans--;
            }
        }


