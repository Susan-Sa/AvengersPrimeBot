package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

public class Powerstats {

    private String response;
    private String id;
    private String name;
    private String intelligence;
    private String strength;
    private String speed;
    private String durability;
    private String power;
    private String combat;

    public Powerstats(JSONObject json) {

        if (json.get("response") != null) {
            this.response = (String) json.get("response");
        }
        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }
        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }
        if (json.get("intelligence") != null) {
            this.intelligence = (String) json.get("intelligence");
        }
        if (json.get("strength") != null) {
            this.strength = (String) json.get("strength");
        }
        if (json.get("speed") != null) {
            this.speed = (String) json.get("speed");
        }
        if (json.get("durability") != null) {
            this.durability = (String) json.get("durability");
        }
        if (json.get("power") != null) {
            this.power = (String) json.get("power");
        }
        if (json.get("combat") != null) {
            this.combat = (String) json.get("combat");
        }

    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String title) {
        this.durability = durability;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCombat() {
        return combat;
    }

    public void setCombat(String combat) {
        this.power = combat;
    }

    public Powerstats(String response, String id, String name, String intelligence, String strength, String speed, String durability, String power, String combat) {
        this.response = response;
        this.id = id;
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;

    }

    public String toString() {
        return "Name: " + name +
                "\nIntelligence: " + intelligence +
                "\nStrength: " + strength +
                "\nSpeed: " + speed +
                "\nDurability: " + durability +
                "\nPower: " + power +
                "\nCombat: " + combat;

    }

}
