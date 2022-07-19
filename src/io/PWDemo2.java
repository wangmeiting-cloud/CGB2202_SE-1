package io;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("mmm.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(bw, true);
        Scanner sc=new Scanner(System.in);
        String data;
        while(!((data=sc.nextLine()).equals("exit"))){
            pw.println(data);

        }

        System.out.println("写出完毕");
        pw.close();

    }
}
