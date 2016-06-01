package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class PopulationValue implements Serializable {
    private long moins_5an;

    private long femmes;

    private long hommes;

    private long population;

    public long getMoins_5an ()
    {
        return moins_5an;
    }

    public void setMoins_5an (long moins_5an)
    {
        this.moins_5an = moins_5an;
    }

    public long getFemmes ()
    {
        return femmes;
    }

    public void setFemmes (long femmes)
    {
        this.femmes = femmes;
    }

    public long getHommes ()
    {
        return hommes;
    }

    public void setHommes (long hommes)
    {
        this.hommes = hommes;
    }

    public long getPopulation ()
    {
        return population;
    }

    public void setPopulation (long population)
    {
        this.population = population;
    }
}
