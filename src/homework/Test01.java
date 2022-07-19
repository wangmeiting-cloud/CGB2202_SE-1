package homework;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        File dir= new File("./src/io");
       File[] subs= dir.listFiles(f->f.getName().endsWith(".java"));
       for(int i=0;i< subs.length;i++){
           File sub=subs[i];
           try(
                   BufferedReader br=new BufferedReader(
                           new InputStreamReader(new FileInputStream(sub))
                   )
                   ){
               String line;
               while((line=br.readLine())!=null){
                   System.out.println(line);
               }
       }catch (IOException e){
               e.printStackTrace();
           }

       }
    }
}
