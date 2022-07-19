package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

//字符流
public class OSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("osw.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line="小呼噜是一只温柔的喵喵";
        osw.write(line);

        System.out.println("写出完毕");
        osw.close();
    }
}
