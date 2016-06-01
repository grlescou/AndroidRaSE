package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Utilisateur  extends Personne implements Serializable {

    private MentionResponsabilite mentionResponsabilite;

    // the coordinates must be stored in the longitude, latitude order
    private List<Double> dernierLocation;
    private String status ;  // "En Cours", "Accepter" , "Rejeter"

    public Utilisateur() {
    }



    public Utilisateur(String id, String prenom, String nom,  String mail,  String password, Role role,  String telephone,  Adresse adresse, boolean actif,  String ip, MentionResponsabilite mentionResposabilite,    List<Double> dernierLocation, String status) {
        super(id,prenom, nom, mail, password, role, telephone, adresse, actif, ip);
        this.mentionResponsabilite = mentionResposabilite;
        this.dernierLocation = dernierLocation;
        this.status = status;
    }

    public MentionResponsabilite getMentionResponsabilite() {
        return mentionResponsabilite;
    }

    public void setMentionResponsabilite(MentionResponsabilite mentionResponsabilite) {
        this.mentionResponsabilite = mentionResponsabilite;
    }



    public List<Double> getDernierLocation() {
        return dernierLocation;
    }

    public void setDernierLocation(List<Double> dernierLocation) {
        this.dernierLocation = dernierLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   /*
       l'ensemble des cles Json pour cette classe
     */

   // Pour la classe personne
    public static String KeyStringId= "id";
    public static String KeyStringPrenom= "prenom";
    public static String KeyStringNom= "nom";
    public static String KeyStringMail= "mail";
    public static String KeyStringPassword= "password";
    public static String KeyObjRole= "role";
    public static String KeyStringTelephone= "telephone" ;
    public static String KeyObjAdresse= "adresse" ;
    public static String KeyBooleanActif= "actif";
    public static String KeyStringIP= "ip";


   // la classe Utilisateur
    public static String KeyObjMentionResponsabilite= "mentionResponsabilite";
    public static String KeyArrayDoubleDernierLocation ="dernierLocation";
    public static String KeyStringStatus= "status" ;



}
