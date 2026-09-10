package com.morel.exercice1;

public class EmployerCommission implements Payable {

    int ChiffreAffaire;
    int TauxCommission;
    String nom;
    String prenom;

    public EmployerCommission(int ChiffreAffaire, int TauxCommission, String nom, String prenom){
        this.ChiffreAffaire= ChiffreAffaire;
        this.TauxCommission= TauxCommission;
        this.nom = nom;
        this.prenom =prenom;
    }

    public int getChiffreAffaire() {return this.ChiffreAffaire;}
    public int setChiffreAffaire() {return this.ChiffreAffaire;}
    public int getTauxCommission(){return this.TauxCommission;}
    public int setTauxCommission(){return this.TauxCommission;}


    public double calculSalaire() {
        return ChiffreAffaire*TauxCommission;
    }
}
