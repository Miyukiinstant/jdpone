package com.miyuki.jdbot.init;

import com.miyuki.jdbot.commands.Deploy;
import com.miyuki.jdbot.commands.Info;
import com.miyuki.jdbot.commands.Ping;
import com.miyuki.jdbot.commands.Social;
import com.miyuki.jdbot.deploy.Bot;
import com.miyuki.jdbot.deploy.Guild;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandRegister extends ListenerAdapter {

    public static void InsertCommands(Event event) {

        Bot.getInstance().deploy(event.getJDA(), Deploy.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), Social.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), Info.getInstance().getCommandData());
        Bot.getInstance().deploy(event.getJDA(), Ping.getInstance().getCommandData());
        Guild.getInstance().deploy(event.getJDA(),Social.getInstance().getCommandData());
        Guild.getInstance().deploy(event.getJDA(),Info.getInstance().getCommandData());
        Guild.getInstance().deploy(event.getJDA(),Ping.getInstance().getCommandData());
    }
}
