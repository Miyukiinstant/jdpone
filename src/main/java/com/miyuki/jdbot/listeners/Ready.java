package com.miyuki.jdbot.listeners;

import com.miyuki.jdbot.init.RegisterBotCommands;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Ready extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        RegisterBotCommands.InsertCommands(event);
        System.out.println(event.getJDA().getSelfUser().getAsTag() + " Bot ready & online!");

    }

}
