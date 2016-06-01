package ht.mbds.rase.rasereport.api.restaccess;

/**
 * Created by Gaetan Robert Lescouflair on 5/24/2016.
 */

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;



import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import org.apache.http.client.methods.HttpPut;

import org.apache.http.client.methods.HttpDelete;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ht.mbds.rase.rasereport.api.UrlManager;


public class RestClient {


    public static  String get(String resourcesPath) {
        try {
            HttpClient client = new DefaultHttpClient();
            HttpGet get = new HttpGet(UrlManager.constructUrl(resourcesPath));

            // add header
            get.setHeader("Content-Type", "application/json");
            HttpResponse response = client.execute(get);
            System.out.println("\nSending 'POST' request to URL : " +UrlManager.constructUrl(resourcesPath));
            System.out.println("Post parameters : " + response);
            System.out.println("Response Code : " +
                    response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            System.out.println(result.toString());
            return result.toString();
        } catch (Exception e) {

        }
        return null;

    }

    public static  String post(String resourcesPath,JSONObject obj ) {

        try{
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(UrlManager.constructUrl(resourcesPath));

            post.setHeader("Content-Type", "application/json");

            StringEntity entity = new StringEntity(obj.toString());
            post.setEntity(entity);

            HttpResponse response = client.execute(post);
            System.out.println("\nSending 'POST' request to URL : " + UrlManager.constructUrl(resourcesPath));
            System.out.println("Post parameters : " + post.getEntity());
            System.out.println("Response Code : " +
                    response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            System.out.println(result.toString());
            return result.toString();


        }catch (Exception e){

        }
        return null;

    }

    public static  String put(String resourcesPath,JSONObject obj ) {

        try{
            HttpClient client = new DefaultHttpClient();

            HttpPut put = new HttpPut(UrlManager.constructUrl(resourcesPath));

            put.setHeader("Content-Type", "application/json");



            StringEntity entity = new StringEntity(obj.toString());
            put.setEntity(entity);

            HttpResponse response = client.execute(put);
            System.out.println("\nSending 'POST' request to URL : " + UrlManager.constructUrl(resourcesPath));
            System.out.println("Post parameters : " + put.getEntity());
            System.out.println("Response Code : " +
                    response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            System.out.println(result.toString());
            return result.toString();


        }catch (Exception e){

        }
        return null;

    }


    public static  String delete(String resourcesPath) {
        try {
            HttpClient client = new DefaultHttpClient();
            HttpDelete delete = new HttpDelete(UrlManager.constructUrl(resourcesPath));

            // add header
            // delete.setHeader("Content-Type", "application/json");

//                Map<String, Object> params = new HashMap<String, Object>();
//                params.put("id", noC);


            HttpResponse response = client.execute(delete);
            System.out.println("\nSending 'POST' request to URL : " +UrlManager.constructUrl(resourcesPath));
            System.out.println("Post parameters : " + response.toString());
            System.out.println("Response Code : " +
                    response.getStatusLine().getStatusCode());

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            StringBuffer result = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            System.out.println(result.toString());
            return result.toString();
        } catch (Exception e) {

        }

        return null;
    }


}
