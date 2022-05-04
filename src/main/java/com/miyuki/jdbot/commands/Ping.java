package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.IResponse;
import com.miyuki.jdbot.interfaces.abstracts.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

public class Ping extends Response {

    private static Ping _instance;
    private static CommandData commandData;

    private Ping() {
    }

    private static void init() {
        commandData = new CommandDataImpl("ping","ping the bot");
    }

    public static Ping getInstance() {
        if (_instance == null) {
            _instance = new Ping();
            init();
        }
        return _instance;
    }

    public CommandData getCommandData() {
        return commandData;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        long time = System.currentTimeMillis();
        IResponse.responseEmbed(event, "Ping", "ms " + (System.currentTimeMillis() - time), true);
    }

}
