package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class MentionResponsabilite  implements Serializable {
    private String id;
    private String nom;
    private String description;
    private GroupeIndividu groupeIndividu;

    public MentionResponsabilite(String id, String nom, String description, GroupeIndividu groupeIndividu) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.groupeIndividu = groupeIndividu;
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

    public GroupeIndividu getGroupeIndividu() {
        return groupeIndividu;
    }

    public void setGroupeIndividu(GroupeIndividu groupeIndividu) {
        this.groupeIndividu = groupeIndividu;
    }


      /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe mentionResponsabilite

    public static String KeyStringId ="id";
    public static String KeyStringNom= "nom";
    public static String KeyStringDescription= "description";

    public static String KeyObjGroupeIndividu= "groupeIndividu";


}
