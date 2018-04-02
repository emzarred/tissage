package com.example.pc.emer;

/**
 * Created by pc on 02/04/2018.
 */

public class Employe {
    private String nom;

    private String mat;
    private String prenom;
    private int mg;

    private int htrv;
    private double production;

    public Employe(String nom, String mat, String prenom, int mg, int htrv, double production) {
        this.nom = nom;
        this.mat = mat;
        this.prenom = prenom;
        this.mg = mg;
        this.htrv = htrv;
        this.production = production;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }

    public int getHtrv() {
        return htrv;
    }

    public void setHtrv(int htrv) {
        this.htrv = htrv;
    }

    public double getProduction() {
        return production;
    }

    public void setProduction(double production) {
        this.production = production;
    }
}
