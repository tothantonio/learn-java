package CentruSpatial;

public class Tehnician extends Angajat{
    private String nume;

    public Tehnician(String nume){
        this.nume = nume;
    }

    public String getNume(){
        return this.nume;
    }

    public void lucreaza() {
        System.out.println("Tehnicianul " + this.nume + " lucreaza.");
    }

    public void mananca() {
        System.out.println("Tehnicianul " + this.nume + " mananca.");
    }

    public void doarme() {
        System.out.println("Tehnicianul " + this.nume + " doarme.");
    }
}
