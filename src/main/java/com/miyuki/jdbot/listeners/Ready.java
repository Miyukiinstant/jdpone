package com.miyuki.jdbot.listeners;

import com.miyuki.jdbot.commands.Social;
import com.miyuki.jdbot.deploy.Bot;
import com.miyuki.jdbot.init.CommandHandler;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Ready extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        System.out.println(event.getJDA().getSelfUser().getAsTag() + " Bot ready & online!");
        event.getJDA().getGuilds().forEach(guild -> {
            guild.updateCommands().queue();
        });
        Bot.getInstance().deploy(event.getJDA(), Social.getInstance().getCommandData());
    }

}
