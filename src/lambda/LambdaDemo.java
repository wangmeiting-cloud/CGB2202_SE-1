package lambda;

import java.io.File;
import java.io.FileFilter;

//JDK8之后java推出了一个特性：lambda表达式
//lambda可以使得程序员面向函数式编程
//直观感受，可以用更精简的语法创建匿名内部类
//但是lambda创建匿名内部类式要求实现的接口中只能有一个抽象方法
//语法：
//（参数列表）->{
// 方法体
// }
public class LambdaDemo {
    public static void main(String[] args) {
            //匿名内部类
     /*   FileFilter filter=new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("D");
            }
        };
        ,.

        FileFilter filter=(File file)->{
             {
                return file.getName().contains("D");
            }
        };

      */
        FileFilter filter=file->file.getName().contains("D");
    }
}
