package com.miyuki.jdbot.init.remover;

import net.dv8tion.jda.api.events.Event;

public class CommandRemover {
    public static void BotRemoveAllCommands(Event event){
        event.getJDA().updateCommands();
    }
    public static void GuildRemoveAllCommands(Event event){
        event.getJDA().getGuilds().forEach(guild -> {
            guild.updateCommands();
        });
    }
}
