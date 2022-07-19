package io;

import java.io.*;

//java的输入与输出
public class FOSDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("./test1.txt");
        fos.write(97);
        System.out.println("写出完毕");
        fos.close();


    }
}
