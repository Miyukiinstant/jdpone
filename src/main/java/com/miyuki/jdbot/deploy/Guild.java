package com.miyuki.jdbot.deploy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public class Guild extends Deploy {

    @Override
    public void deploy(JDA bot, CommandData commandData) {
        IDeploy.deployGuild(bot, commandData);
    }
}