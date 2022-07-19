package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
      /*  FileOutputStream fos=new FileOutputStream("./fos.txt");
        String line="我爱你，就像老鼠爱大米。";
        byte [] data=line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕");
        fos.close();

       */
        FileOutputStream fos=new FileOutputStream("./fos.txt1",true);
        String a="你是我的眼，带我看遍世界。";
        byte[] data=a.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕");
        fos.close();
    }
}
