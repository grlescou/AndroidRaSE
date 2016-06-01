package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Maladie implements Serializable {

    private String id;
    private String nom;
    private String description;
    private double  seuil;
    private String typeSeuil;


    private Categorie categorie;

    private List<Symptome> symptomes= new ArrayList<Symptome>();

    public Maladie() {
    }

    public Maladie(String id, String nom, String description, double seuil, String typeSeuil, Categorie categorie, List<Symptome> symptomes) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.seuil = seuil;
        this.typeSeuil = typeSeuil;
        this.categorie = categorie;
        this.symptomes = symptomes;
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

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    public String getTypeSeuil() {
        return typeSeuil;
    }

    public void setTypeSeuil(String typeSeuil) {
        this.typeSeuil = typeSeuil;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Symptome> getSymptomes() {
        return symptomes;
    }

    public void setSymptomes(List<Symptome> symptomes) {
        this.symptomes = symptomes;
    }


     /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe Maladie

    public static String KeyStringId ="id";
    public static String KeyStringNom= "nom";
    public static String KeyStringDescription= "description";
    public static String KeyDoubleSeuil=  "seuil";
    public static String KeyStringTtypeSeuil= "typeSeuil";

    public static String KeyObjCategorie ="categorie";

    public static String KeyArraySymptomes= "symptomes";

}
