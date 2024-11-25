public class B extends A {
    public void method() throws Level2Exception, Level3Exception {
        throw new Level2Exception("Exception from class B");
    }
}