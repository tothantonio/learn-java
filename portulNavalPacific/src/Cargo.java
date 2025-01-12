public class Cargo extends Nava{
    private String tip;
    private int cantitate;
    private int an;
    private int luna;
    private int zi;

    public Cargo(String nume, int capacitate, int lungime, int anFabricatie, String tip, int cantitate, int an, int luna, int zi) {
        super(nume, capacitate, lungime, anFabricatie);
        this.tip = tip;
        this.cantitate = cantitate;
        this.an = an;
        this.luna = luna;
        this.zi = zi;
    }
}
