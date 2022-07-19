package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
聊天室服务端
 */
public class Server {

    private ServerSocket serverSocket;
    private PrintWriter[] allOut={};
    public Server(){
        try {
            System.out.println("正在启动服务端，打开8088端口。。。");
            serverSocket =new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {

             while(true) {
                 System.out.println("等待客户端连接。。");
                 Socket socket = serverSocket.accept();
                 System.out.println("一个客户端连接了。");
                 ClientHandler clientHandler=new ClientHandler(socket);//创建了clientHandler对象，参数是socket
                 Thread t1=new Thread(clientHandler);//创建了t1的对象。
                 t1.start();




             }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
    private class ClientHandler implements Runnable{//线程
        private String host;
        private Socket socket;
        public ClientHandler(Socket socket){//构造方法，赋初始值
            this.socket=socket;//成员变量与局部变量重名，访问成员变量，this不能省略
            host = socket.getInetAddress().getHostAddress();
        }

        public void run(){

            try {

                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);

                OutputStream out=socket.getOutputStream();
                OutputStreamWriter osw=new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw=new BufferedWriter(osw);
                PrintWriter pw=new PrintWriter(bw,true);
                allOut= Arrays.copyOf(allOut,allOut.length+1);
                allOut[allOut.length-1]=pw;


                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(host + line);
                   for(int i=0;i<allOut.length;i++){
                       allOut[i].println(host+line);
                   }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
