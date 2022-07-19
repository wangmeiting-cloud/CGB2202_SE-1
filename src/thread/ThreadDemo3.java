package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {




            Thread t1= new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("hello");
            }
            }
            );

//           Runnable r2=new Runnable() {
//               public void run() {
//                   for (int i = 0; i < 1000; i++) {
//                       System.out.println("你好");
//                   }
//
//           }
//           };

           Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("你好");
            }
        }
        );
           t1.start();
           t2.start();





    }
}
