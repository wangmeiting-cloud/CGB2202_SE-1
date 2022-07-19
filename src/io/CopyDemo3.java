package io;

import java.io.*;

/*
java流分为：节点流与处理流

 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("fos1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int d;
        long start=System.currentTimeMillis();
        while ((d=fis.read())!=-1){
            bos.write(d);
        }
        long end=System.currentTimeMillis();
        bis.close();
        bos.close();
        System.out.println("复制完毕"+(end-start)+"ms");
    }
}
