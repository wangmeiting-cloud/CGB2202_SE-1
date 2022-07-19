package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("./test.txt");
        FileInputStream fis=new FileInputStream("./test.txt");
        for(int i=0;i<26;i++){
           fos.write(97+i);
            System.out.println(fis.read());
        }
        fos.close();
        fis.close();


    }
}
