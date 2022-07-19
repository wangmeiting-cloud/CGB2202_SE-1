package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw=new PrintWriter("pw.txt","utf-8");
        pw.println("我爱你，就像老鼠爱大米。");
        pw.println("我爱你，就像老鼠爱大米。");
        System.out.println("写出完毕");
        pw.close();

    }
}
