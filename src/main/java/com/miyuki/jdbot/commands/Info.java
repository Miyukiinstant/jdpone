
package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.IResponse;
import com.miyuki.jdbot.interfaces.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;


public class Info extends Response {

    private static Info _instance;
    private static CommandData commandData;

    private Info() {
    }

    private static void init() {
        commandData = new CommandDataImpl("info", "about bot");
    }

    public CommandData getCommandData() {
        return commandData;
    }

    public static Info getInstance() {
        if (_instance == null) {
            _instance = new Info();
            init();
        }
        return _instance;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        IResponse.responseEmbed(event, "JDA Bot", "This bot was entirely made in Java", true);
    }


}
