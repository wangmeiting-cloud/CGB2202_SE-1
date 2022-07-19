package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p=new Person();
        try {
            p.setAge(1000000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("年龄为"+p.getAge());
    }
}
