package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 * A class representing a channel topic.
 * See https://api.slack.com/types/channel
 * <p>
 * Example JSON:
 * <p>
 * {
 * "value": "Fun times",
 * "creator": "U024BE7LV",
 * "last_set": 1369677212
 * }
 */

public class Topic {

    private String value;
    private String creator;
    private long lastSet;

    public Topic(JSONObject json) {
        if (json.get("value") != null) {
            this.value = (String) json.get("value");
        }

        if (json.get("creator") != null) {
            this.creator = (String) json.get("creator");
        }

        if (json.get("last_set") != null) {
            this.lastSet = (Long) json.get("last_set");
        }
    }

    public String getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public long getLastSet() {
        return lastSet;
    }
}
