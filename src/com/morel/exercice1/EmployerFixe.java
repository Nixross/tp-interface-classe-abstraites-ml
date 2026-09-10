package com.morel.exercice1;

public class EmployerFixe implements Payable{
    int SalaireFixe;
    String nom;
    String prenom;
    public EmployerFixe(int SalaireFixe, String nom, String prenom){
    this.SalaireFixe= SalaireFixe;
    this.nom = nom;
    this.prenom=prenom;
    }
    public int getSalaireFixe() {return this.SalaireFixe;}
    public int setSalaireFixe() {return this.SalaireFixe;}

    public double calculSalaire() {
        return SalaireFixe;
    }


}
