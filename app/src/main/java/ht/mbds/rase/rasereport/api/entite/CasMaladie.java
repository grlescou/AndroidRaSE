package ht.mbds.rase.rasereport.api.entite;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MyPC on 5/24/2016.
 */
public class CasMaladie implements Serializable {

    private String id;

    private Maladie maladie;

    private List<Symptome> listeSymptome;

    private Utilisateur user ;

    private MentionResponsabilite mention;

    private String sexe; // {Femme,Homme,Mixe}

    private String groupeAge; // {Moins_de_5 ,Plus_de_5 }

    private String date;

    // the coordinates must be stored in the longitude, latitude order
    private List<Double> location;

    private int note;

    private int nombreCas;

    private Zone zone;

    public CasMaladie() {
    }


    public CasMaladie( Maladie maladie, List<Symptome> listeSymptome,  Utilisateur user, MentionResponsabilite mention, String sexe, String groupeAge,   String date, List<Double> location,  int note,  int nombreCas,  Zone zone) {

        //this.categorie = new Categorie();
        //this.categorie.setId( maladie.getCategorie().getId());
        // this.categorie.setNom( maladie.getCategorie().getNom());

        //this.categorie.setDescription(null);
        //this.categorie.setListemaladie(null);


        maladie.setDescription(null);
        maladie.setSymptomes(null);
        this.maladie = maladie;


        this.listeSymptome = listeSymptome;
        this.user = user;

        this.mention = mention;
        this.sexe = sexe ;
        this.groupeAge = groupeAge;

        this.date = date;
        this.location = location;
        this.note = note;
        this.nombreCas = nombreCas;
        this.zone = zone;
    }




    public Utilisateur getUser ()
    {
        return user;
    }

    public void setUser (Utilisateur User)
    {
        this.user = User;
    }

    public Maladie getMaladie ()
    {
        return maladie;
    }

    public void setMaladie (Maladie Maladie)
    {
        this.maladie = Maladie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getDate ()
    {
        return date;
    }

    public void setDate (String Date)
    {
        this.date = Date;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> Location) {
        this.location = Location;
    }



    public List<Symptome> getListeSymptome ()
    {
        return listeSymptome;
    }

    public void setListeSymptome (List<Symptome> ListeSymptome)
    {
        this.listeSymptome = ListeSymptome;
    }

    public int getNote ()
    {
        return note;
    }

    public void setNote (int Note)
    {
        this.note = Note;
    }

    public Zone getZone ()
    {
        return zone;
    }

    public void setZone (Zone Zone)
    {
        this.zone = Zone;
    }

    public MentionResponsabilite getMention() {
        return mention;
    }

    public void setMention(MentionResponsabilite mention) {
        this.mention = mention;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getGroupeAge() {
        return groupeAge;
    }

    public void setGroupeAge(String groupeAge) {
        this.groupeAge = groupeAge;
    }

    public int getNombreCas() {
        return nombreCas;
    }

    public void setNombreCas(int nombreCas) {
        this.nombreCas = nombreCas;
    }


     /*
       l'ensemble des cles Json pour cette classe
     */

    // Pour la classe casMaladie

    public static String KeyObjMaladie ="maladie";

    public static String KeyArrayListeSymptome= "listeSymptome";

    public static String KeyObjUtilisateur ="user" ;

    public static String KeyObjMentionResponsabilite= "mention";

    public static String KeyStringSexe = "sexe";

    public static String KeyStringGroupeAge= "groupeAge";

    public static String KeyStringDate ="date";

    public static String KeyArrayDoubleLocation ="location";

    public static String KeyIntNote= "note";

    public static String KeyIntNombreCas= "nombreCas";

    public static String KeyObjZone ="zone";



}
