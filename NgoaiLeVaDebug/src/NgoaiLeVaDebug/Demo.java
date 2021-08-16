package NgoaiLeVaDebug;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 2};
        try {
            System.out.println(array[2]);
        } catch (Exception e) {
            System.out.println("error.");
        } finally {
//            finally luôn thực hiện khối lệnh bên trong nó, dù Exception có xãy ra hay không
            System.out.println("finally");
        }
        System.out.println("finish");
    }
}
