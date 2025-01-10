package com.example.tp8_exercice1;

import java.util.ArrayList;
import java.util.List;

public class Projets {
    private int idProjet;
    private String nomProjet;
    private String dateProjet;

    public Projets(int idProjet, String nomProjet, String dateProjet) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.dateProjet = dateProjet;
    }

    public int getIdProjet() {
        return idProjet;
    }
    public String getNomProjet() {
        return nomProjet;
    }
    public String getDateProjet() {
        return dateProjet;
    }

    public void setDateProjet(String dateProjet) {
        this.dateProjet = dateProjet;
    }

    private List<Projets> projets = new ArrayList<>();
    //CREER
    public void creerProjet(Projets projet) {
        projets.add(projet);
        System.out.println("Nouveau projet : " + projet);
        return;
    }

    //MODIFIER
    public void modifierProjet(int idProjet, String nomProjet, String dateProjet) {
        for (Projets projet : projets) {
            if (projet.getIdProjet() == idProjet) {
                projet.nomProjet = nomProjet;
                projet.dateProjet = dateProjet;
                System.out.println("Personnel modifie : " + projet);
            }
        }
        System.out.println("Projet " + idProjet + " pas trouvé");
    }

    //SUPPRIMER
    public void supprimerProjet(int idProjet) {
        for (Projets projet : projets) {
            if (projet.getIdProjet() == idProjet) {
                projets.remove(projet);
                System.out.println("Projet supprimé : "+ idProjet);
                return;
            }
        }
    }


}
