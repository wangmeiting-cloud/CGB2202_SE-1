package io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
   public static final long serialVersionUID = 1L;
   private String name;
   private int age;
   private String gendar;
   private transient String[] otherInfo;
//java bean
   public Person(){

   }

    public Person(String name, int age, String gendar, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gendar = gendar;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gendar='" + gendar + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
