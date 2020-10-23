package com.floreo.bbah.network.responses;

import com.floreo.bbah.model.Message;
import com.floreo.bbah.model.Powerstats;
import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

//import com.floreo.bbah.model.Powerstats;

public class PowerstatsResponse extends Response {

    Powerstats response;

    public PowerstatsResponse(JSONObject json) {

        super(json);

        response = new Powerstats(json);

    }

    public Powerstats sendPowerstats(JSONObject json) {
        return response;
    }

}

