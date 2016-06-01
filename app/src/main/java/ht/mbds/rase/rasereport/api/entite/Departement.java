package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Departement implements Serializable {

    private String _id;

    private ProprietesDepartement properties;

    private String type;

    private MultiGeometry geometry;


    public Departement() {
    }


    public Departement(String _id, ProprietesDepartement properties, String type, MultiGeometry geometry) {
        this._id = _id;
        this.properties = properties;
        this.type = type;
        this.geometry = geometry;
    }




    public String get_id ()
    {
        return _id;
    }

    public void set_id (String _id)
    {
        this._id = _id;
    }

    public ProprietesDepartement getProperties ()
    {
        return properties;
    }

    public void setProperties (ProprietesDepartement properties)
    {
        this.properties = properties;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public MultiGeometry getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (MultiGeometry geometry)
    {
        this.geometry = geometry;
    }

}
