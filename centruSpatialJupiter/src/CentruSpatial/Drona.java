package CentruSpatial;

import java.util.ArrayList;

public class Drona extends NavaSpatiala{
    ArrayList<String> senzori;
    ArrayList<String> planete;

    public Drona(String nume, int combustibil, int viteza, int anFabricatie, ArrayList<String> senzori, ArrayList<String> planete){
        super(nume, combustibil, viteza, anFabricatie);
        this.senzori = senzori;
        this.planete = planete;
    }
}
