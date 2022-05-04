package com.miyuki.jdbot.init;

import com.miyuki.jdbot.commands.*;
import com.miyuki.jdbot.deploy.Bot;
import com.miyuki.jdbot.deploy.Guild;
import com.miyuki.jdbot.init.remover.CommandRemover;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class RegisterGuildCommands {

    //List of commands to insert
    public static void InsertCommands(Event event) {

        //Deploy commands on Guild
        Guild.getInstance().deploy(event.getJDA(),Social.getInstance().getCommandData());
        Guild.getInstance().deploy(event.getJDA(),Info.getInstance().getCommandData());
        Guild.getInstance().deploy(event.getJDA(),Ping.getInstance().getCommandData());
    }
}
