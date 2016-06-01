package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Categorie implements Serializable {
    private String id;
    private String nom;
    private String description;

    private List<Maladie> listemaladie = new ArrayList<Maladie>();

    public Categorie() {
    }

    public Categorie(String id, String nom, String description, List<Maladie> listemaladie) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.listemaladie = listemaladie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Maladie> getListemaladie() {
        return listemaladie;
    }

    public void setListemaladie(List<Maladie> listemaladie) {
        this.listemaladie = listemaladie;
    }


     /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe categorie
    public static String KeyStringId ="id";
    public static String KeyStringNom = "nom";
    public static String KeyStringDescription = "description";

    public static String KeyArrayListeMaladie= "listemaladie";

}
