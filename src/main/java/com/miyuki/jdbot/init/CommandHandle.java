package com.miyuki.jdbot.init;

import com.miyuki.jdbot.commands.*;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandHandle extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName()) {
            case "ping":
                Ping.getInstance().response(event);
                break;
            case "info":
                Info.getInstance().response(event);
                break;
            case "social":
                Social.getInstance().response(event);
                break;
            case "deploy":
                Deploy.getInstance().response(event);
                break;
            case "play":
                YT.getInstance().play(event);
                break;
        }
    }

}
