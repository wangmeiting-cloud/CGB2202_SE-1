package thread;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin=new Thread(){
            public void run(){
                System.out.println("哈哈");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢");
                }
                System.out.println("林：醒了");
            }


        };
        Thread t1=new Thread(){
            public void run(){
                System.out.println("黄：90,90");
                for(int i=0;i<15;i++){
                    System.out.println("100");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("咣当");
                System.out.println("大哥搞定");
                lin.interrupt();
            }
        };
        lin.start();
        t1.start();
    }
}
