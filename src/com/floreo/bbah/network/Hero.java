package com.floreo.bbah.network;

import com.floreo.bbah.model.Biography;
import com.floreo.bbah.model.Powerstats;
import com.floreo.bbah.network.responses.PowerstatsResponse;
import com.floreo.bbah.network.responses.Response;
import com.floreo.bbah.network.responses.SendMessageResponse;
import com.floreo.bbah.util.HeroToken;
import com.floreo.bbah.util.Token;
import de.ralleytn.simple.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

public class Hero {

    /*
    https://superheroapi.com/api/access-token/character-id/powerstats
    https://superheroapi.com/api/access-token/character-id/biography
    https://superheroapi.com/api/access-token/character-id/appearance
     */

    /* Hero ids between 1 and 735
     * Wonderwoman 720
     * Thor 659
     * Spiderman 620 - 622
     * Captain Marvel/ Mar - vell 155 - 158
     * Wolverine 717*/


    private static final String API_KEY = HeroToken.findApiToken();
    private static final String BASE_URL = "https://superheroapi.com/api/";
    private static final String CHARACTER_ID = "/480";
    private static final String ENDPOINT_POWERSTATS = "/powerstats";
    private static final String ENDPOINT_BIOGRAPHY = "/biography";
    private static final String ENDPOINT_APPEARANCE = "/appearance";
    private static final String ENDPOINT_WORK = "/work";
    private static final String ENDPOINT_CONNECTIONS = "/connections";
    private static final String ENDPOINT_IMAGE = "/image";
    private static final String ENDPOINT_SEARCH_NAME = "/search/";

    private int characterId;

    //This method accesses the superhero powerstats api and returns the object, which populates the PowerStats class
    //I then initalize a string, and give it a value of the custome toString of the Powerstats class
    public static String getPowerstats() {

        URL powerStatstUrl = HTTPS.stringToURL(BASE_URL + API_KEY + "/" + CHARACTER_ID + ENDPOINT_POWERSTATS);

        JSONObject object = HTTPS.get(powerStatstUrl);

        Powerstats info = new Powerstats(object);

        //String powerStats = "Here are your stats!!/nName: " + info.getName() +"/nIntelligence: " + info.getStrength() + : Speed: Durability: Power: Combat:"

        String powerStats = info.toString();

        return powerStats;
    }

    //This method accesses the superhero biology api and returns the object, which populates the Biology class
    //I then initalize a string, and give it a value of the custom toString of the Biology class
    public static String getBiography() {

        URL biographyUrl = HTTPS.stringToURL(BASE_URL + API_KEY + "/" + CHARACTER_ID + ENDPOINT_BIOGRAPHY);

        JSONObject object = HTTPS.get(biographyUrl);

        Biography info = new Biography(object);

        //String powerStats = "Here are your stats!!/nName: " + info.getName() +"/nIntelligence: " + info.getStrength() + : Speed: Durability: Power: Combat:"

        String biography = info.toString();

        return biography;
    }


}
