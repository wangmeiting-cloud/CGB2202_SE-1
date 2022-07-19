package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner s1=new Scanner(System.in);
        int  s;
        for(s=s1.nextInt();s>0;s--){
            System.out.println(s);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("时间到");
                System.out.println("程序结束了");

            }
            }




}
