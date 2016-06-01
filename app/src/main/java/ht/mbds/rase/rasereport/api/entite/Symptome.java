package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Symptome  implements Serializable {
    private String id;
    private String nom;
    private String description;

    public Symptome() {
    }

    public Symptome(String id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
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

      /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe symptome

    public static String KeyStringId ="id";
    public static String KeyStringNom= "nom";
    public static String KeyStringDescription= "description";

}
