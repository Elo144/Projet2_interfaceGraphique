package com.example.tp8_exercice1;
import java.util.ArrayList;

public class SuiviDesProjets {
    private int suiviProjet;
    private int idProjetSuivi;
    private Enum avancementProjet;

    public SuiviDesProjets(Enum avancementProjet, int idProjetSuivi, int suiviProjet) {
        this.avancementProjet = avancementProjet;
        this.idProjetSuivi = idProjetSuivi;
        this.suiviProjet = suiviProjet;
    }

    public Enum getAvancementProjet() {return avancementProjet;}

    public void setAvancementProjet(Enum avancementProjet) {this.avancementProjet = avancementProjet;}

    public int getIdProjetSuivi() {return idProjetSuivi;}

    public void setIdProjetSuivi(int idProjetSuivi) {
        this.idProjetSuivi = idProjetSuivi;
    }

    public int getSuiviProjet() {
        return suiviProjet;
    }

    public void setSuiviProjet(int suiviProjet) {
        this.suiviProjet = suiviProjet;
    }
    public void afficherToutLesProjets(){System.out.println();}
    public void isAdmin(){}
    public void voirAvancementProjet(){}
}
