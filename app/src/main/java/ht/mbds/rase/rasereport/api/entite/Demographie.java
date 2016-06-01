package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Demographie implements Serializable {

    private String id ;

    private ProprietesDemographie properties;

    private String type;

    private Geometry geometry;

    public Demographie() {
    }

    public Demographie(String _id, ProprietesDemographie properties, String type, Geometry geometry) {
        this.id = _id;
        this.properties = properties;
        this.type = type;
        this.geometry = geometry;
    }


    public String getId() {
        return id;
    }

    public void setId(String _id) {
        this.id = _id;
    }

    public ProprietesDemographie getProperties ()
    {
        return properties;
    }

    public void setProperties (ProprietesDemographie properties)
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

    public Geometry getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (Geometry geometry)
    {
        this.geometry = geometry;
    }

}
