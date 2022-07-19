package socket;
import com.sun.tools.javadoc.Start;
import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
构造方法，初始化客户端
 */
public class Client {
    private Socket socket;

    public Client(){
        try {
            System.out.println("正在连接服务端...");
            socket=new Socket("localhost",8088);
            System.out.println("与服务端建立连接.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    客户端开始工作的方法
     */
    public void start(){
        try {
            ServerHandler serverHandler=new ServerHandler();
            Thread t=new Thread(serverHandler);
            t.start();
            OutputStream out=socket.getOutputStream();
            OutputStreamWriter osw=new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw=new BufferedWriter(osw);
            PrintWriter pw=new PrintWriter(bw,true);

            System.out.println("请输入内容:");
            Scanner sc=new Scanner(System.in);
            String data;
            while(!((data=sc.nextLine()).equals("enter"))){
                pw.println(data);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client=new Client();
       client.start();
    }
    private class ServerHandler implements Runnable{
        public void run(){
            try {
                InputStream is=socket.getInputStream();
                InputStreamReader isr=new InputStreamReader(is,StandardCharsets.UTF_8);
                BufferedReader br=new BufferedReader(isr);
                String data;
                while (((data=br.readLine())!=null)){
                    System.out.println(data);}
            } catch (IOException e) {

            }
        }
    }
}
