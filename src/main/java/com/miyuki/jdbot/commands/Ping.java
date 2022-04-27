package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.IResponse;
import com.miyuki.jdbot.interfaces.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

import java.util.List;

public class Ping extends Response {

    private static Ping _instance;
    private static CommandData commandData;

    private Ping() {
    }

    private static void init() {
        commandData = new CommandDataImpl("ping","ping the bot");
    }

    public CommandData getCommandData() {
        return commandData;
    }

    public static Ping getInstance() {
        if (_instance == null) {
            _instance = new Ping();
            init();
        }
        return _instance;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        long time = System.currentTimeMillis();
        IResponse.responseEmbed(event, "Ping", "ms " + (System.currentTimeMillis() - time), true);
    }

}
