import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nava nava1 = new Cargo("Nava1", 100, 50, 2000, "tip1", 1000, 2010, 10, 13);
        Nava nava2 = new Cargo("Nava2", 200, 60, 2001, "tip2", 2000, 2009, 10, 15);

        Capitan capitan1 = new Capitan("Burcea", "Ioan", 50, 3);

        ArrayList<Angajat> angajati = new ArrayList<>();
        ArrayList<Nava> nave = new ArrayList<>();

        Om angajat1 = new Om("Popescu Marcel");
        Om angajat2 = new Om("Ionescu Gigel");
        Om angajat3 = new Om("Vasilescu Ion");
        Robot angajat4 = new Robot("R2D2");

        angajati.add(angajat1);
        angajati.add(angajat2);
        angajati.add(angajat3);
        angajati.add(angajat4);

        Nava nava3 = new Croaziera("Nava3", 300, 70, 2002, capitan1, angajati);

        nave.add(nava1);

        angajat1.mananca();
        angajat2.doarme();
        angajat3.lucreaza();
        angajat4.lucreaza();

        System.out.println("Introduceti data de plecare:");
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        int luna = sc.nextInt();
        int zi = sc.nextInt();
        sc.close();
    }
}