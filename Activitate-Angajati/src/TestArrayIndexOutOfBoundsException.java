public class TestArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}