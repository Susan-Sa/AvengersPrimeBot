package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/* "response": "success",
           "id": "70",
           "name": "Batman",
           "url": "https://www.superherodb.com/pictures2/portraits/10/100/639.jpg"
        */

public class Image {

    private String response;
    private String id;
    private String name;
    private String url;

    public Image(JSONObject json) {

        if (json.get("response") != null) {
            this.response = (String) json.get("response");
        }
        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }
        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }
        if (json.get("url") != null) {
            this.url = (String) json.get("url");
        }
    }

        public String getResponse () { return response; }
        public void setResponse (String response){ this.response = response; }

        public String getId () { return id; }
        public void setId (String id){ this.id = id; }

        public String getName () { return name; }
        public void setName (String name){ this.name = name; }

        public String getUrl () { return url; }
        public void setUrl (String url){ this.url = url; }

    public Image(String response, String id, String name, String url) {
            this.response = response;
            this.id = id;
            this.name = name;
            this.url = url;

        }

        public String toString(){
        return "\n" + url;
        }
    }
