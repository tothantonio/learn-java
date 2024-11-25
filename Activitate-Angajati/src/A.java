public class A {
    public void method() throws Level1Exception, Level2Exception, Level3Exception {
        throw new Level1Exception("Exception from class A");
    }
}