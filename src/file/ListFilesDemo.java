package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir=new File(".");
        if(dir.isDirectory()){
            File[] subs=dir.listFiles();
            for(int i=0;i<subs.length;i++){
                File sub=subs[i];
                System.out.println(sub.getName());

            }
        }
    }
}
