public class Main {
    public static void main(String[] args) {
        ClasaConcreta clasaConcreta = new ClasaConcreta();

        clasaConcreta.method1();
        clasaConcreta.method2();
        clasaConcreta.method3();
        clasaConcreta.newMethod();

        Program program = new Program();

        program.methodWithInterface1(clasaConcreta);
        program.methodWithInterface2(clasaConcreta);
        program.methodWithInterface3(clasaConcreta);
        program.methodWithNewInterface(clasaConcreta);
    }
}