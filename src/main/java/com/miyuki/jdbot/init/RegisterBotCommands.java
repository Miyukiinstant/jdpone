package com.miyuki.jdbot.init;

import com.miyuki.jdbot.commands.*;
import com.miyuki.jdbot.deploy.Bot;
import com.miyuki.jdbot.deploy.Guild;
import com.miyuki.jdbot.init.remover.CommandRemover;
import net.dv8tion.jda.api.events.Event;

public class RegisterBotCommands {
    public static void InsertCommands(Event event) {
        //Deploy commands on Bot
        //Bot.getInstance().deploy(event.getJDA(), Deploy.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), Social.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), Info.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), Ping.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), YT.getInstance().getCommandData());
    }
}
