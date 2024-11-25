public class TestCustomExceptions {
    public void g() throws CustomException1 {
        throw new CustomException1("Exception from method g()");
    }

    public void f() throws CustomException2 {
        try {
            g();
        } catch (CustomException1 e) {
            throw new CustomException2("Exception from method f() after catching: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TestCustomExceptions test = new TestCustomExceptions();
        try {
            test.f();
        } catch (CustomException2 e) {
            System.out.println("Caught CustomException2: " + e.getMessage());
        }
    }
}