public class TestException {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}