package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Commune implements Serializable {

    private String _id;

    private ProprietesCommune properties;

    private String type;

    private MultiGeometry geometry;

    public String get_id ()
    {
        return _id;
    }

    public void set_id (String _id)
    {
        this._id = _id;
    }

    public ProprietesCommune getProperties ()
    {
        return properties;
    }

    public void setProperties (ProprietesCommune properties)
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
