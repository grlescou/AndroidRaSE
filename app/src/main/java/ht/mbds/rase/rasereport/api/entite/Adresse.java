package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Adresse implements Serializable {

    private String rue;
    private String commune ;
    private String departement;

    public Adresse(String rue, String commune, String departement) {
        this.rue = rue;
        this.commune = commune;
        this.departement = departement;
    }

    public Adresse() {
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }


     /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe Adresse
    public static String KeyStringRue= "rue";
    public static String KeyStringCommune ="commune" ;
    public static String KeyStringDepartement ="departement";



}
