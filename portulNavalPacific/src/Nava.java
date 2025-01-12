public abstract class Nava {
    private String nume;
    private int capacitate;
    private int lungime;
    private int anFabricatie;
    private int an;
    private int luna;
    private int zi;

    public Nava(String nume, int capacitate, int lungime, int anFabricatie) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.lungime = lungime;
        this.anFabricatie = anFabricatie;
    }

    public String plecareDupa(int an, int luna, int zi) {
        if (this.an > an) {
            return "Da";
        } else if (this.an == an) {
            if (this.luna > luna) {
                return "Da";
            } else if (this.luna == luna) {
                if (this.zi > zi) {
                    return "Da";
                }
            }
        }
        return "Nu";
    }

    public void afiseazaNaveCuPlecareaDupa(int an, int luna, int zi) throws Exception {
        if (plecareDupa(an, luna, zi).equals("Da")) {
            System.out.println(this);
        } else {
            throw new Exception("Nu exista nave cu plecare dupa data introdusa");
        }
    }
}
