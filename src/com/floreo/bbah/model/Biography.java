package com.floreo.bbah.model;


import de.ralleytn.simple.json.JSONArray;
import de.ralleytn.simple.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Biography {

    private String response;
    private String id;
    private String name;
    private String full_name;
    private String alter_egos;

    private List<String> aliases;

    private String place_of_birth;
    private String first_appearance;
    private String publisher;
    private String alignment;

    public Biography(JSONObject json) {

        if (json.get("response") != null) {
            this.response = (String) json.get("response");
        }
        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }
        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }
        if (json.get("full_name") != null) {
            this.full_name = (String) json.get("full_name");
        }
        if (json.get("alter_egos") != null) {
            this.alter_egos = (String) json.get("alter_egos");
        }
        if (json.get("aliases") != null) {
            JSONArray membersArray = (JSONArray) json.get("aliases");
            this.aliases = new ArrayList<String>();
            for (int i = 0; i < membersArray.size(); i++) {
                this.aliases.add((String) membersArray.get(i));
            }
        }
        if (json.get("place_of_birth") != null) {
            this.place_of_birth = (String) json.get("place_of_birth");
        }
        if (json.get("first_appearance") != null) {
            this.first_appearance = (String) json.get("first_appearance");
        }
        if (json.get("publisher") != null) {
            this.publisher = (String) json.get("publisher");
        }
        if (json.get("alignment") != null) {
            this.alignment = (String) json.get("alignment");
        }
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setAlter_egos(String alter_egos) {
        this.alter_egos = alter_egos;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getFirst_appearance() {
        return first_appearance;
    }

    public void setFirst_appearance(String first_appearance) {
        this.first_appearance = first_appearance;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String toString() {
        return "\nFull Name: " + full_name +
                "\nName: " + name +
                "\nAlter Egos: " + alter_egos +
                "\nAliases: " + aliases +
                "\nPlace of Birth: " + place_of_birth +
                "\nFirst Appearance: " + first_appearance +
                "\nPublisher: " + publisher +
                "\nAlignment: " + alignment;

    }
}
