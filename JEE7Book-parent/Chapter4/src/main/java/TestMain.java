public class TestMain {

    public static void main(String args[]) throws Exception {
        method1();
    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception ex){
            throw new Exception("from method 1", ex);
        }
    }

    private static void method2() throws Exception {
        throw new Exception(new Exception("from method 2"));
    }
}
