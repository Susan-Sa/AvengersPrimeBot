package com.floreo.bbah;

import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();
        Slack myBot2 = new Slack();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        myBot.sendMessageToBotsChannel("Heller!! https://www.pexels.com/photo/sunset-beach-water-ocean-59920/ Yeller!");
        myBot.sendStatsToBotsChannel();
        myBot.sendBioToBotsChannel();


    }
}
