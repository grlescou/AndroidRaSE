package ht.mbds.rase.rasereport.api.restaccess;

/**
 * Created by MyPC on 5/24/2016.
 */
public class BasicResourcesPath {

    private  static final  String  ResourceUtilisateur ="/utilisateur/" ;

    private  static final  String  ResourceMentionResponsabilite ="/mention/" ;

    private  static final  String  ResourceMaladie ="/maladie/" ;

    private  static final  String  ResourceCategroie ="/categorie/" ;

    private  static final  String  ResourceSymptome ="/symptome/" ;

    private  static final  String  ResourceCasMaladie ="/casMaladie/" ;

    private  static final  String  ResourceDepartement ="/departement/" ;

    private  static final  String  ResourceCommune ="/commune/" ;

    private  static final  String  ResourceSectionCommunale ="/sectionCommunale/" ;



    private  static final  String  ResourceRole ="/role/" ;

    private  static final  String  ResourceGroupeIndividu ="/groupeIndividu/" ;

    private  static final  String  ResourceSouscription ="/souscription/" ;

    private  static final  String  ResourceZoneListe ="/zonelist/" ;


    public static String getResourceUtilisateur() {
        return ResourceUtilisateur;
    }

    public static String getResourceMaladie() {
        return ResourceMaladie;
    }

    public static String getResourceCategroie() {
        return ResourceCategroie;
    }

    public static String getResourceSymptome() {
        return ResourceSymptome;
    }

    public static String getResourceCasMaladie() {
        return ResourceCasMaladie;
    }

    public static String getResourceDepartement() {
        return ResourceDepartement;
    }

    public static String getResourceCommune() {
        return ResourceCommune;
    }

    public static String getResourceSectionCommunale() {
        return ResourceSectionCommunale;
    }

    public static String getResourceRole() {
        return ResourceRole;
    }

    public static String getResourceGroupeIndividu() {
        return ResourceGroupeIndividu;
    }

    public static String getResourceSouscription() {
        return ResourceSouscription;
    }

    public static String getResourceZoneListe() {
        return ResourceZoneListe;
    }


    public static String getResourceMentionResponsabilite() {
        return ResourceMentionResponsabilite;
    }

    public static String ResourceConcatener (String resource, String plus){

        return resource + plus;

    }

}
