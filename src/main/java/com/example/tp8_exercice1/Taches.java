package com.example.tp8_exercice1;

import java.util.ArrayList;
import java.util.List;

public class Taches {
    private int idTache;
    private String nomTache;
    private String dateLimiteTache;
    private String commentaireTache;
    private String descriptionTache;
    private int idemployé;
    private String prioriteTache;
    private String categorieTache;

    public Taches(int idTache, String nomTache, String dateLimiteTache, String descriptionTache, String commentaireTache, int idemploy, String prioriteTache, String categorieTache) {
        this.idTache = idTache;
        this.nomTache = nomTache;
        this.dateLimiteTache = dateLimiteTache;
        this.descriptionTache = descriptionTache;
        this.commentaireTache = commentaireTache;
        this.idemployé = idemploy;
        this.prioriteTache = prioriteTache;
        this.categorieTache = categorieTache;
    }

    public int getIdTache() {
        return idTache;
    }
    public int getidemployé() {
        return idemployé;
    }
    public String getDescriptionTache() {
        return descriptionTache;
    }
    public String getCommentaireTache() {
        return commentaireTache;
    }
    public String getDateLimiteTache() {
        return dateLimiteTache;
    }
    public String getNomTache() {
        return nomTache;
    }
    public String getPrioriteTache() {
        return prioriteTache;
    }
    public String getCategorieTache() {
        return categorieTache;
    }

    @Override
    public String toString() {
        return "Taches{" +
                "idTache=" + idTache +
                ", nomTache='" + nomTache + '\'' +
                ", dateLimiteTache='" + dateLimiteTache + '\'' +
                ", commentaireTache='" + commentaireTache + '\'' +
                ", descriptionTache='" + descriptionTache + '\'' +
                ", id employé de tache ='" + idemployé + '\'' +
                '}';
    }

    private List<Taches> taches = new ArrayList<>();
    //CREER
    public void ajouterUneTache(Taches tache) {
        taches.add(tache);
        System.out.println("Tache ajoutée : " + tache);
    }

    //MODIFIER
    public void modifierUneTache(int idTache, String nomTache, String dateLimiteTache, String descriptionTache, String commentaireTache, int idemploye) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                tache.nomTache = nomTache;
                tache.dateLimiteTache = dateLimiteTache;
                tache.descriptionTache = descriptionTache;
                tache.commentaireTache = commentaireTache;
                tache.idemployé = idemploye;
                System.out.println("Tache modifiée : " + tache);
                return;
            }
        }
        System.out.println("Tache " + idTache + " pas trouvée");
    }

    //SUPPRIMER
    public void supprimerUnneTache(int idTache) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                taches.remove(tache);
                System.out.println("Tache supprimée : " + tache);
                return;
            }
        }
        System.out.println("Tache " + idTache + " pas trouvée");
    }

    //ATTRIBUER TACHE
    public void attribuerUneTache(int idTache, int idemployé) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                tache.idemployé = idemployé;
                System.out.println("Tache attribuée à " + idemployé + " : " + nomTache);
                return;
            }
        }
    }

    //ATTRIBUER DATE LIMITE
    public void attribuerUneDateLimite(int idTache, String dateLimiteTache) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                tache.dateLimiteTache = dateLimiteTache;
                System.out.println("Tache " + nomTache + " avec pour date limite : " + dateLimiteTache);
            }
        }
    }

    //ATTRIBUER UNE PRIORITE TACHE
    public void attribuerUnePriorite(int idTache, String prioriteTache) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                tache.prioriteTache = prioriteTache;
                System.out.println("Tache " + nomTache + " avec pour priorite : " + prioriteTache);
            }
        }
    }

    //AJOUTER COMMENTAIRE
    public void ajouterCommentaire(int idTache, String commentaireTache) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                tache.commentaireTache = commentaireTache;
                System.out.println("Tache " + nomTache + " avec un nouveau commentaire : " + commentaireTache);
            }
        }
    }

    //AJOUTER UNE DESCRITPTION
    public void ajouterDescription(int idTache, String descriptionTache) {
        for (Taches tache : taches) {
            if (tache.getIdTache() == idTache) {
                tache.descriptionTache = descriptionTache;
                System.out.println("Tache " + nomTache + " avec pour description : " + descriptionTache);
            }
        }
    }

}
