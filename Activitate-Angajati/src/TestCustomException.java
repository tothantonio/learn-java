public class TestCustomException {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            e.displayMessage();
        }


    }
}