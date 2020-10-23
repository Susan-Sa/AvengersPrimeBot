package com.floreo.bbah.network;

import com.floreo.bbah.network.responses.Response;
import com.floreo.bbah.util.HeroToken;
import com.floreo.bbah.util.Token;
import de.ralleytn.simple.json.JSONObject;

import java.net.URL;

public class Hero {

    /*
    https://superheroapi.com/api/access-token/character-id/powerstats
    https://superheroapi.com/api/access-token/character-id/biography
    https://superheroapi.com/api/access-token/character-id/appearance
     */




    private static final String API_KEY = HeroToken.findApiToken();
    private static final String BASE_URL = "https://superheroapi.com/api/";
    //private static final String ENDPOINT_TEST = "api.test";
    //number between 1 and 735
    private static final String CHARACTER_ID = "/480";
    private static final String ENDPOINT_POWERSTATS = "/powerstats";
    private static final String ENDPOINT_BIOGRAPHY = "/biography";
    private static final String ENDPOINT_APPEARANCE = "/appearance";
    private static final String ENDPOINT_WORK = "/work";
    private static final String ENDPOINT_CONNECTIONS = "/connections";
    private static final String ENDPOINT_IMAGE = "/image";
    private static final String ENDPOINT_SEARCH_NAME = "/search/";

    private int characterId;

    public static Response getPowerstats() {
        URL powerStatstUrl = HTTPS.stringToURL(BASE_URL + API_KEY  + "/" + CHARACTER_ID + ENDPOINT_POWERSTATS);

        JSONObject object = HTTPS.get(powerStatstUrl);

        return new Response(object);
    }

}
