package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import com.miyuki.jdbot.interfaces.IResponse;

public class Ping extends Response {

    private static Ping _instance;

    private Ping() {
    }

    ;

    public static Ping getInstance() {
        if (_instance == null) {
            _instance = new Ping();
        }
        return _instance;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        long time = System.currentTimeMillis();
        IResponse.responseEmbed(event, "Ping", "ms " + (System.currentTimeMillis() - time), true);
    }
}
