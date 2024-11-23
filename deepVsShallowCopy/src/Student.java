public class Student implements Cloneable {
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    //shallow copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //deep copy
    public Student deepClone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
        clonedStudent.masina = (Masina) masina.clone();
        return clonedStudent;
    }

    public String toString() {
        return nume + " " + prenume + " " + masina;
    }
}
