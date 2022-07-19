package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("./demo.txt");
       String name= file.getName();
       long length=file.length();
       boolean cw=file.canRead();
       boolean cr=file.canWrite();
       boolean ish=file.isHidden();
       System.out.println(cw);
       System.out.println(cr);
       System.out.println(ish);

    }
}
