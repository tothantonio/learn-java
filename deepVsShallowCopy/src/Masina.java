public class Masina implements Cloneable {
    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    //shallow copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //deep copy
    public Masina deepClone() throws CloneNotSupportedException {
        Masina clonedMasina = (Masina) super.clone();
        return clonedMasina;
    }

    public String toString() {
        return marca + " " + culoare;
    }
}
