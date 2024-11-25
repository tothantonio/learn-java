public class TestExceptionHierarchy {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.method();
        } catch (Level1Exception | Level2Exception | Level3Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}