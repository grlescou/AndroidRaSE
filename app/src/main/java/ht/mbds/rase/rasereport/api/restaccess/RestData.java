package ht.mbds.rase.rasereport.api.restaccess;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ht.mbds.rase.rasereport.api.entite.AuthUtilisateur;
import ht.mbds.rase.rasereport.api.entite.CasMaladie;
import ht.mbds.rase.rasereport.api.entite.Maladie;

/**
 * Created by MyPC on 5/24/2016.
 */
public class RestData {


    public static  String login (AuthUtilisateur auth){
        try {
        JSONObject obj =new JSONObject();

            obj.put(AuthUtilisateur.KeyStringMail, auth.getMail());
            obj.put(AuthUtilisateur.KeyStringPassword, auth.getPassword());


            return RestClient.post(BasicResourcesPath.ResourceConcatener(BasicResourcesPath.getResourceUtilisateur(),"auth"),obj);


        } catch (JSONException e) {
            e.printStackTrace();
        }

       return null;
    }

    public static  String loadDepartementLayer (){
        try {

            return RestClient.get(BasicResourcesPath.ResourceConcatener(BasicResourcesPath.getResourceDepartement(),"2"));


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static  String loadCommuneLayer (){
        try {

            return RestClient.get(BasicResourcesPath.ResourceConcatener(BasicResourcesPath.getResourceCommune(),"2"));


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static  String loadSectionCommuneLayer (){
        try {

            return RestClient.get(BasicResourcesPath.ResourceConcatener(BasicResourcesPath.getResourceSectionCommunale(),"2"));


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static  String AjouterCasMaladie (CasMaladie casMaladie){
        try {

            JSONObject objCasMaladie =new JSONObject();

            JSONObject objMaladie =new JSONObject();
            objMaladie.put(Maladie.KeyStringId,casMaladie.getMaladie().getId());
            objMaladie.put(Maladie.KeyStringNom,casMaladie.getMaladie().getNom());
            objMaladie.put(Maladie.KeyStringDescription,casMaladie.getMaladie().getDescription());
            objMaladie.put(Maladie.KeyArraySymptomes, JSONObject.NULL);
            objMaladie.put(Maladie.KeyDoubleSeuil,casMaladie.getMaladie().getSeuil());
            objMaladie.put(Maladie.KeyStringTtypeSeuil,casMaladie.getMaladie().getTypeSeuil());

            JSONArray ArraylisteSymptome = new JSONArray();

            JSONObject Objuser = new JSONObject();

            JSONObject ObjMention = new JSONObject();

            JSONArray ArrayDouleLocation = new JSONArray();

            JSONObject objZone = new JSONObject();


            objCasMaladie.put(CasMaladie.KeyObjMaladie, objMaladie);
            objCasMaladie.put(CasMaladie.KeyArrayListeSymptome, ArraylisteSymptome);
            objCasMaladie.put(CasMaladie.KeyObjUtilisateur, Objuser);
            objCasMaladie.put(CasMaladie.KeyObjMentionResponsabilite, ObjMention);
            objCasMaladie.put(CasMaladie.KeyStringSexe, casMaladie.getSexe());
            objCasMaladie.put(CasMaladie.KeyStringDate, ArraylisteSymptome);
            objCasMaladie.put(CasMaladie.KeyArrayDoubleLocation, ArrayDouleLocation);
            objCasMaladie.put(CasMaladie.KeyIntNote, casMaladie.getNote());
            objCasMaladie.put(CasMaladie.KeyIntNombreCas, casMaladie.getNombreCas());
            objCasMaladie.put(CasMaladie.KeyStringGroupeAge, casMaladie.getGroupeAge());
            objCasMaladie.put(CasMaladie.KeyObjZone, objZone);



            return RestClient.post(BasicResourcesPath.getResourceCasMaladie(),objCasMaladie);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }



    public static  String getListMaladie (){
        try {

            return RestClient.get(BasicResourcesPath.getResourceMaladie());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static  String getListSymptomes (){
        try {

            return RestClient.get(BasicResourcesPath.getResourceSymptome());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static  String getListGroupeIndividu (){
        try {

            return RestClient.get(BasicResourcesPath.getResourceGroupeIndividu());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static  String getListMention (){
        try {

            return RestClient.get(BasicResourcesPath.getResourceMentionResponsabilite());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static  String getZoneListe (){
        try {

            return RestClient.get(BasicResourcesPath.getResourceZoneListe());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static  String CreerSouscription (String email){
        try {

            JSONObject obj =new JSONObject();

            //obj.put(AuthUtilisateur.KeyStringMail, email);
            //obj.put(AuthUtilisateur.KeyStringPassword, auth.getPassword());

            return RestClient.post(BasicResourcesPath.getResourceSouscription(),obj);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
