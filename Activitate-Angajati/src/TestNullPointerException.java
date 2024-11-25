public class TestNullPointerException {
    public static void main(String[] args) {
        Zi zi = null;
        try {
            zi.getNume();
        } catch (NullPointerException e) {
            System.out.println("A fost prinsa o excepție de tip NullPointerException: " + e.getMessage());
        }
    }
}