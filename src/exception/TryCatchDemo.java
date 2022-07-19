package exception;
//异常处理机制中的try-catch
//语法：try{代码片段}catch(***Exception e){出现错误后的补救措施(b计划)}
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
   //   String str=null;
  //      String str1="";
            String str="a";
        System.out.println(str.length());
        //    System.out.println(str1.charAt(0));
            System.out.println("!!!!");
            System.out.println(Integer.parseInt(str));
        }
       // catch (NullPointerException e){
        //    System.out.println(e);
      //  }catch (StringIndexOutOfBoundsException e){
       //     System.out.println(e);
     //   }
        catch(NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("程序结束了");
    }
}
