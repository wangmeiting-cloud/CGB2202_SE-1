package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose=new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊");
                System.out.println("扑通！");
            }
        };


        Thread jack=new Thread(){
            public void run(){
                while(true){
                    System.out.println("jack:别跳了，这海水可凉了！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        jack.setDaemon(true);
        jack.start();
        while(true);
      //  System.out.println("main方法执行完毕了，主线程结束了");
    }
}
