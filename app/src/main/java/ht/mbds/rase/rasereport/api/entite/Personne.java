package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public abstract class Personne  implements Serializable {
    private String id;
    private String prenom;
    private String nom;
    private String mail;
    private String password;
    private Role role;
    private String telephone ;
    private Adresse adresse ;
    private boolean actif;
    private String ip;

    public Personne() {
    }

    public Personne(String id, String prenom, String nom, String mail, String password, Role role, String telephone, Adresse adresse, boolean actif, String ip) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.mail = mail;
        this.password = password;
        this.role = role;
        this.telephone = telephone;
        this.adresse = adresse;
        this.actif = actif;
        this.ip = ip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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




}
