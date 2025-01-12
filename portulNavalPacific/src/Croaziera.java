import java.util.ArrayList;

public class Croaziera extends Nava{
    private Capitan capitan;
    private ArrayList<Angajat> angajati;

    public Croaziera(String nume, int capacitate, int lungime, int anFabricatie, Capitan capitan, ArrayList<Angajat> angajati) {
        super(nume, capacitate, lungime, anFabricatie);
        this.capitan = capitan;
        this.angajati = angajati;
    }
}
