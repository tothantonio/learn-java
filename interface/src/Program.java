public class Program {
    public void methodWithInterface1(Interface1 interface1) {
        interface1.method1();
        interface1.method2();
    }

    public void methodWithInterface2(Interface2 interface2) {
        interface2.method3();
        interface2.method4();
    }

    public void methodWithInterface3(Interface3 interface3) {
        interface3.method5();
        interface3.method6();
    }

    public void methodWithNewInterface(NewInterface newInterface) {
        newInterface.method1();
        newInterface.method2();
        newInterface.method3();
        newInterface.method4();
        newInterface.method5();
        newInterface.method6();
        newInterface.newMethod();
    }
}
