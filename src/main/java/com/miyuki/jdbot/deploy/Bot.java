package com.miyuki.jdbot.deploy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public class Bot extends Deploy {

    private static Bot _instance;

    private Bot() {
    }

    public static Bot getInstance() {
        if (_instance == null) {
            _instance = new Bot();
        }
        return _instance;
    }

    @Override
    public void deploy(JDA bot, CommandData commandData) {
        IDeploy.deployBot(bot, commandData);
    }
}
