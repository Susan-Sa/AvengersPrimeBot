package com.floreo.bbah.network.responses;

import com.floreo.bbah.model.Message;
import com.floreo.bbah.model.Powerstats;
import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

//import com.floreo.bbah.model.Powerstats;

public class PowerstatsResponse extends Response {

    Powerstats info  = new Powerstats(JSONObject json);

    public PowerstatsResponse(JSONObject json) {
        super(json);

        HashMap<String, Object> stats = new HashMap<>();

        //if (json.containsKey("messages")) {
            JSONArray array = (JSONArray) json;

            //this.messages = new ArrayList<Message>();
            for (int i = 0; i < array.size(); i++) {
                //this.messages.add(new Message((JSONObject) array.get(i)));
            }
        //}
    }

}
