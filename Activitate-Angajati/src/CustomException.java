public class CustomException extends Exception {

    private String message;
    public CustomException(String message) {
        this.message = message;
    }
    public void displayMessage() {
        System.out.println("CustomException message: " + message);
    }
}