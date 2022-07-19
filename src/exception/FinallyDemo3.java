package exception;

public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("a")+","+test(null)+","+test(""));
    }
        public static int test (String str){
            try {
                return str.charAt(0)-'a';

            } catch (NullPointerException e) {
                return 1;
            }catch (Exception e){
                return 2;
            }
            finally {
             // return 3;

        }
    }
}