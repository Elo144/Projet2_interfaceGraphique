package com.example.tp8_exercice1;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private int numeroemploye;
    private String dateEmbauche;
    private String nomEmploye;
    private String historiqueEmploye;

    public Personnel(String dateEmbauche, int numeroemploye, String nomEmploye, String historiqueEmploye) {
        this.dateEmbauche = dateEmbauche;
        this.numeroemploye = numeroemploye;
        this.nomEmploye = nomEmploye;
        this.historiqueEmploye = historiqueEmploye;
    }

    public int getNumeroemploye() {
        return numeroemploye;
    }
    public String getDateEmbauche() {
        return dateEmbauche;
    }
    public String getNomEmploye() {
        return nomEmploye;
    }
    public String getHistoriqueEmploye() {
        return historiqueEmploye;
    }

    //    //Fonction ObtenirRole()
//    public void ObtenirRole() {
//        System.out.println("Role = void");
//    }

    private List<Personnel> employes = new ArrayList<>();
    //CREER
    public void ajouterUnEmploye(Personnel employe) {
        employes.add(employe);
        System.out.println("Tache ajoutée : " + employe);
    }

    //MODIFIER
    public void modifierPersonnel(String dateEmbauche, int numeroemploye, String nomEmploye, String historiqueEmploye) {
        for (Personnel employe : employes) {
            if (employe.getNumeroemploye() == numeroemploye) {
                employe.nomEmploye = nomEmploye;
                employe.dateEmbauche = dateEmbauche;
                employe.historiqueEmploye = historiqueEmploye;
                System.out.println("Personnel modifié : " + employe);
            }
        }
        System.out.println("Personnel " + nomEmploye + " pas trouvé");
    }

    //SUPPRIMER
    public void supprimerPersonnel(int numeroemploye) {
        for (Personnel employe : employes) {
            if (employe.getNumeroemploye() == numeroemploye) {
                employes.remove(employe);
                System.out.println("Employe supprimé : "+ numeroemploye);
                return;
            }
        }
    }

    //VISUALISER INFOS PERSONNEL
    @Override
    public String toString() {
        return "Personnel{" +
                "numeroemploye=" + numeroemploye +
                ", dateEmbauche='" + dateEmbauche + '\'' +
                ", nomEmploye='" + nomEmploye + '\'' +
                ", historiqueEmploye='" + historiqueEmploye + '\'' +
                ", employes=" + employes +
                '}';
    }

    //AFFICHER HISTORIQUE
    public void afficherHistorique(int numeroemploye) {
        for (Personnel employe : employes) {
            if (employe.getNumeroemploye() == numeroemploye) {
                String historique = employe.getHistoriqueEmploye();
                System.out.println("Voici l'historique de l'employe avec l'id " + nomEmploye + " : " + historique);
                return;
            }
        }
    }
}
