package io;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./mei.jpg");
        FileOutputStream fos=new FileOutputStream("./mei_3.jpg");
        int d;
        while((d=fis.read())!=-1){
            fos.write(d);
        }
        System.out.println("复制完毕");
        fis.close();
        fos.close();




        File f=new File("./mei_2.jpg");
        f.delete();


    }

}
