package exception;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        String str="abc";
        try {
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            e.printStackTrace();
            String message=e.getMessage();
            System.out.println(message);
        }
        System.out.println("程序结束了");
    }
}
