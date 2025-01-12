package CentruSpatial;

import java.util.ArrayList;

public class Racheta extends NavaSpatiala{
    ArrayList<String> statiiSpatiale;
    private int masaMaxima;

    public Racheta(String nume, int combustibil, int viteza, int anFabricatie, ArrayList<String> statiiSpatiale, int masaMaxima){
        super(nume, combustibil, viteza, anFabricatie);
        this.statiiSpatiale = statiiSpatiale;
        this.masaMaxima = masaMaxima;
    }
}
