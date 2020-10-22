package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {


    private String id;
    private String name;
    private boolean deleted;
    private String color;
    private boolean is_admin;
    private boolean is_owner;
    private boolean is_primary_owner;
    private boolean is_restricted;
    private boolean is_ultra_restricted;
    private boolean has_2fa;
    private String two_factor_type;
    private boolean has_files;

    public User(JSONObject json) {

    if (json.get("id") != null){
        this.id = (String) json.get("id");
    }

    if (json.get("name") != null){
        this.name = (String) json.get("name");
    }

    if (json.get("deleted") != null){
        this.deleted = (Boolean) json.get("deleted");
    }

    if (json.get("color") != null){
        this.color =(String) json.get("color");
    }

    if (json.get("is_admin") != null){
        this.is_admin = (Boolean) json.get("is_admin");
    }

    if (json.get("is_owner") != null){
        this.is_owner = (Boolean) json.get("is_owner");
    }

    if (json.get("is_primary_owner") != null){
        this.is_primary_owner = (Boolean) json.get("is_primary_owner");
    }

    if (json.get("is_restricted") != null){
        this.is_restricted = (Boolean) json.get("is_restricted");
    }

    if (json.get("is_ultra_restricted") != null){
        this.is_ultra_restricted = (Boolean) json.get("is_ultra_restricted");
    }

    if(json.get("has_2fa") != null){
        this.has_2fa = (Boolean) json.get("has_2fa");
    }

    if(json.get("two_factor_type") != null){
        this.two_factor_type = (String) json.get("two_factor_type");
    }

    if(json.get("has_files") != null){
        this.has_files = (Boolean) json.get("has_files");
    }
}

    public String getId() { return id; }

    public String getName() {return name; }

    public boolean getDeleted() { return deleted; }

    public String getColor() { return color; }

    public boolean getIs_admin() { return is_admin; }

    public boolean getIs_owner() { return is_owner; }

    public boolean getIs_primary_owner() { return is_primary_owner; }

    public boolean getIsRestricted() { return is_restricted; }

    public boolean getIs_ultra_restricted() { return is_ultra_restricted; }

    public boolean getHas_2fa() { return has_2fa; }

    public String getTwoFactorType() { return two_factor_type; }

    public boolean getHas_files() { return has_files; }

    public class Profile{
        private String first_name;
        private String last_name;

    public Profile(JSONObject json) {
        if(json.get("first_name") != null){
            this.first_name = (String) json.get("first_name");
        }
        if(json.get("last_name") != null){
            this.last_name = (String) json.get("last_name");
        }
    }

    public Profile(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

        public String getFirst_name() { return first_name; }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() { return last_name; }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
    }


    }

}
