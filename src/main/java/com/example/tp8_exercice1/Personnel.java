package com.example.tp8_exercice1;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private int numeroemploye;
    private String dateEmbauche;
    private String nomEmploye;
    private String historiqueEmploye;
    private Enum roleEmployé;


    public Personnel(String dateEmbauche, int numeroemploye, String nomEmploye, String historiqueEmploye,Enum roleEmployé) {
        this.dateEmbauche = dateEmbauche;
        this.numeroemploye = numeroemploye;
        this.nomEmploye = nomEmploye;
        this.historiqueEmploye = historiqueEmploye;
        this.roleEmployé = roleEmployé;
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

    public Enum getRoleEmployé() {return roleEmployé;}
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
    public void modifierPersonnel(String dateEmbauche, int numeroemploye, String nomEmploye, String historiqueEmploye, Enum role) {
        for (Personnel employe : employes) {
            if (employe.getNumeroemploye() == numeroemploye) {
                employe.nomEmploye = nomEmploye;
                employe.dateEmbauche = dateEmbauche;
                employe.historiqueEmploye = historiqueEmploye;
                employe.roleEmployé =role;
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
                ", role employes=" + roleEmployé +
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
