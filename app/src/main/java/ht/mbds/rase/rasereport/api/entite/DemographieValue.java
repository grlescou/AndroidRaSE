package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class DemographieValue implements Serializable {

    private String _id;

    private PopulationValue value;

    public String get_id ()
    {
        return _id;
    }

    public void set_id (String _id)
    {
        this._id = _id;
    }

    public PopulationValue getPopulationValue ()
    {
        return value;
    }

    public void setPopulationValue (PopulationValue value)
    {
        this.value = value;
    }
}
