package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class AuthUtilisateur implements Serializable {
    private String mail;
    private String password;

    public AuthUtilisateur() {
    }

    public AuthUtilisateur(String mail, String password) {
        this.mail = mail;
        this.password = password;
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


     /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe authUtilisateur
    public static String KeyStringMail ="mail";
    public static String KeyStringPassword ="password";

}
