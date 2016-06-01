package ht.mbds.rase.rasereport.api;

/**
 * Created by Gaetan Robert Lescouflair on 5/24/2016.
 */
public class UrlManager {

    private  static final String  http = "http://";
    private  static final String  host = "restapi-rasehaiti.rhcloud.com";
    private  static final String  port = "80";
    private static  final String apibase = "/api/v1";


    public static String getApiUrl() {
        return  http + host+ ":"+port+ apibase  ;
    }


    public static String constructUrl(String resourcePath) {
        return getApiUrl()+resourcePath;
    }



}
