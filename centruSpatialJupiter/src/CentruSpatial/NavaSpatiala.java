package CentruSpatial;

public abstract class NavaSpatiala {
    private String nume;
    private int combustibil;
    private int viteza;
    private int anFabricatie;

    public NavaSpatiala(String nume, int combustibil, int viteza, int anFabricatie){
        this.nume = nume;
        this.combustibil = combustibil;
        this.viteza = viteza;
        this.anFabricatie = anFabricatie;
    }

    public void plecare(NavaSpatiala nava, int an, int luna, int zi) {
        System.out.println("Nava " + nava.nume + " a plecat la data de " + zi + "/" + luna + "/" + an);
    }
}
