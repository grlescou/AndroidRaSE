package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by MyPC on 5/24/2016.
 */
public class GroupeIndividu  implements Serializable {

    private String _id;
    private String nomGroupe;
    private String description;

    private List<MentionResponsabilite>  listeMention= new ArrayList<MentionResponsabilite>();

    public GroupeIndividu(String _id, String nomGroupe, String description) {
        this._id = _id;
        this.nomGroupe = nomGroupe;
        this.description = description;
    }


    public GroupeIndividu(String _id, String nomGroupe, String description, List<MentionResponsabilite> listeMention) {
        this._id = _id;
        this.nomGroupe = nomGroupe;
        this.description = description;
        this.listeMention = listeMention;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MentionResponsabilite> getListeMention() {
        return listeMention;
    }

    public void setListeMention(List<MentionResponsabilite> listeMention) {
        this.listeMention = listeMention;
    }


    /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe mentionResponsabilite

    public static String KeyStringId ="id";
    public static String KeyStringNomGroupe= "nomGroupe";
    public static String KeyStringDescription= "description";

    public static String KeyArrayMentionResponsabilite=  "listeMention";

}
