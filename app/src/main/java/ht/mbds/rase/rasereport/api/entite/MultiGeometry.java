package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class MultiGeometry implements Serializable {
    private String type;

    private Double[][][] [] coordinates;

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Double[][][] [] getCoordinates ()
    {
        return coordinates;
    }

    public void setCoordinates (Double[][][] [] coordinates)
    {
        this.coordinates = coordinates;
    }
}
