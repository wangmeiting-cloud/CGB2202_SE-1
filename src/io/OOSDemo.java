package io;

import java.io.*;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="可可";
        int age=18;
        String gendar="男";
        String []otherInfo={"哈哈","哈哈"};
        Person p=new Person(name,age,gendar,otherInfo);
        FileOutputStream fos=new FileOutputStream("person.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("写出完毕");
        oos.close();


     /*
        File k=new File("./txt");
        k.delete();

      */
    }
}
