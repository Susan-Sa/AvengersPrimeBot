package com.floreo.bbah.network.responses;

//import com.floreo.bbah.model.Biography;
import com.floreo.bbah.model.Message;
import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;


public class BiographyResponse extends Response{

    public BiographyResponse(JSONObject json) {
        super(json);

        if (json.containsKey("messages")) {
            JSONArray array = (JSONArray) json.get("messages");

            //this.messages = new ArrayList<Message>();
            for (int i = 0; i < array.size(); i++) {
                //this.messages.add(new Message((JSONObject) array.get(i)));
            }
        }
    }



}
