package com.example.tp8_exercice1;
import java.util.ArrayList;

public class SuiviDesProjets {
    private int suiviProjet;
    private Projets ProjetSuivi;
    private Enum avancementProjet;
    private ArrayList<Taches> tasks =new ArrayList<>();

    public SuiviDesProjets(Enum avancementProjet, Projets ProjetSuivi, int suiviProjet) {
        this.avancementProjet = avancementProjet;
        this.ProjetSuivi = ProjetSuivi;
        this.suiviProjet = suiviProjet;
    }

    public Enum getAvancementProjet() {return avancementProjet;}

    public void setAvancementProjet(Enum avancementProjet) {this.avancementProjet = avancementProjet;}

    public Projets getIdProjetSuivi() {return ProjetSuivi;}

    public void setIdProjetSuivi(Projets ProjetSuivi) {
        this.ProjetSuivi = ProjetSuivi;
    }

    public int getSuiviProjet() {
        return suiviProjet;
    }

    public void setSuiviProjet(int suiviProjet) {
        this.suiviProjet = suiviProjet;
    }
    public void  aFaire(Taches t){
        tasks.add(t);
    }
    public void afficherToutLesProjets(){System.out.println(ProjetSuivi.projets);}
    public void isAdmin(){}
    public void voirAvancementProjet(){System.out.println(avancementProjet);  }
}
