package com.miyuki.jdbot.deploy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

import java.util.List;

public interface IDeploy {
    static void deployBot(JDA bot, CommandData commandData) {

        bot.upsertCommand(commandData);

    }

    static void deployGuild(JDA bot, CommandData commandData) {
        List<Guild> guilds = bot.getGuilds();
        guilds.forEach(guild -> {

            guild.upsertCommand(commandData);

        });
    }
}
