package io;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./mei.jpg");
        FileOutputStream fos=new FileOutputStream("./mei_1.jpg");
        int  len;
        byte [] data=new byte[1024*10];
        long start=System.currentTimeMillis();
        while((len=fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕"+(end-start)+"ms");
        fis.close();
        fos.close();





/*
     File f=new File("./mei_1.jpg");
        f.delete();

 */




    }
}
