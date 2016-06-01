package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Role implements Serializable {

    private String _id;
    private String privilege;



    public Role(String _id, String privilege) {
        this._id = _id;
        this.privilege = privilege;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }


   /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe Role
    public static String KeyStringId = "_id";
    public static String KeyStringPrivilege ="privilege";

}
