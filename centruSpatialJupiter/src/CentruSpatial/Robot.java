package CentruSpatial;

public class Robot extends Angajat{
    private String nume;

    public Robot(String nume){
        this.nume = nume;
    }

    public String getNume(){
        return this.nume;
    }

    public void lucreaza() {
        System.out.println("Robotul " + this.nume + " lucreaza non-stop.");
    }

    public void mananca() {
        System.out.println("Robotul " + this.nume + " mananca baterii.");
    }

    public void doarme() {
        System.out.println("Robotul " + this.nume + " nu doarme.");
    }
}
