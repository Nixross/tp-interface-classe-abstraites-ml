package com.morel.exercice1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Payable> l1 = List.of();

        EmployerFixe f1;
        f1 = new EmployerFixe(1500, "Flinck", "Arolde");
        l1.add(f1);
        EmployerFixe f2;
        f2 = new EmployerFixe(1950, "Sonora", "Aria");
        l1.add(f2);

        List<Payable> l2 = List.of();

        EmployerCommission c1;
        c1 = new EmployerCommission(30000, 500, "Ironwood", "Jame");
        l1.add(c1);
        EmployerCommission c2;
        c2 = new EmployerCommission(15000, 420,"Schnee", "Winter");
        l1.add(c2);

        for ()

    }

}
