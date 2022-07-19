package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("bos.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String line="小呼噜";
        byte[] data=line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);
        System.out.println("复制完毕");
        bos.flush();
        
    }
}
