import CentruSpatial.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tehnician tehnician = new Tehnician("Ion");
        tehnician.lucreaza();
        tehnician.mananca();
        tehnician.doarme();

        Robot robot = new Robot("R2D2");
        robot.lucreaza();
        robot.mananca();
        robot.doarme();

        ArrayList<String> statii = new ArrayList<>();
        ArrayList<String> planete = new ArrayList<>();
        ArrayList<String> senzori = new ArrayList<>();

        statii.add("Statia1");
        statii.add("Statia2");
        statii.add("Statia3");

        planete.add("Planeta1");
        planete.add("Planeta2");
        planete.add("Planeta3");

        senzori.add("Senzor1");
        senzori.add("Senzor2");
        senzori.add("Senzor3");

        Racheta racheta = new Racheta("Racheta1", 100, 1000, 2020, statii, 1000);
        Racheta racheta2 = new Racheta("Racheta2", 200, 2000, 2021, statii, 2000);
        Drona drona = new Drona("Drona1", 50, 500, 2019, senzori, planete);

        NavaSpatiala[] nave = new NavaSpatiala[3];
        nave[0] = racheta;
        nave[1] = racheta2;
        nave[2] = drona;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti data de plecare:");
        int an = sc.nextInt();
        int luna = sc.nextInt();
        int zi = sc.nextInt();

        sc.close();

        racheta.plecare(racheta, 2024, 3, 13);
        racheta2.plecare(racheta2, 2025, 4, 14);
        drona.plecare(drona, 2026, 5, 15);

        System.out.println("Navele care au plecat dupa data introdusa sunt:");


    }
}