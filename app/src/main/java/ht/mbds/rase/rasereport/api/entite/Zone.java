package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class Zone implements Serializable
{
    private String SectionCommunale;

    private String Departement;

    private String Commune;

    private String Arrondissement;

    public String getSectionCommunale ()
    {
        return SectionCommunale;
    }

    public void setSectionCommunale (String SectionCommunale)
    {
        this.SectionCommunale = SectionCommunale;
    }

    public String getDepartement ()
    {
        return Departement;
    }

    public void setDepartement (String Departement)
    {
        this.Departement = Departement;
    }

    public String getCommune ()
    {
        return Commune;
    }

    public void setCommune (String Commune)
    {
        this.Commune = Commune;
    }

    public String getArrondissement ()
    {
        return Arrondissement;
    }

    public void setArrondissement (String Arrondissement)
    {
        this.Arrondissement = Arrondissement;
    }



     /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe zone

    public static String KeyStringSectionCommunale= "SectionCommunale";

    public static String KeyStringDepartement= "Departement";

    public static String KeyStringCommune= "Commune";

    public static String KeyStringArrondissement= "Arrondissement";


}
