package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;

/**
 * Created by MyPC on 5/24/2016.
 */
public class ProprietesDepartement  implements Serializable {

        private String ID_ADM1;

        private String ADM1;

        private String Shape_Leng;

        private CasMaladieValue casMaladieValue;

        private DemographieValue  demographieValue ;

    public String getID_ADM1 ()
    {
        return ID_ADM1;
    }

    public void setID_ADM1 (String ID_ADM1)
    {
        this.ID_ADM1 = ID_ADM1;
    }

    public String getADM1 ()
    {
        return ADM1;
    }

    public void setADM1 (String ADM1)
    {
        this.ADM1 = ADM1;
    }

    public String getShape_Leng ()
    {
        return Shape_Leng;
    }

    public void setShape_Leng (String Shape_Leng)
    {
        this.Shape_Leng = Shape_Leng;
    }

    public CasMaladieValue getCasMaladieValue() {
        return casMaladieValue;
    }

    public void setCasMaladieValue(CasMaladieValue casMaladieValue) {
        this.casMaladieValue = casMaladieValue;
    }

    public DemographieValue getDemographieValue() {
        return demographieValue;
    }

    public void setDemographieValue(DemographieValue demographieValue) {
        this.demographieValue = demographieValue;
    }

}
