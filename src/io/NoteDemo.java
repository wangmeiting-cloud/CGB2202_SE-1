package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class NoteDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入文字：");
        Scanner scanner=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("./txt",true);

       /*  while (!((i=scanner.next()).equals("exit"))){
          b=i.getBytes(StandardCharsets.UTF_8);
          fos.write(b);

        */

      String i;

      while (
              !((i=scanner.next()).equals("exit"))){

         byte[] b=i.getBytes(StandardCharsets.UTF_8);
          fos.write(b);
      }
        System.out.println("关闭");
        fos.close();
    }

}
