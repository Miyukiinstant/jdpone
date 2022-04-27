package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.IResponse;
import com.miyuki.jdbot.interfaces.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

import java.util.ArrayList;
import java.util.List;

public class Deploy extends Response {

    private static Deploy _instance;
    private static CommandData commandData;
    private static List<OptionData> optionData;

    private Deploy() {
    }

    private static void init() {
        optionData = new ArrayList<>();
        optionData.add(new OptionData(OptionType.STRING, "deploy", "commands", true)
                .addChoice("bot", "deploy on bot")
                .addChoice("guilds", "deploy on guilds"));
        commandData = new CommandDataImpl("deploy", "deploy commands").addOptions(optionData).setDefaultEnabled(false);
    }

    public static Deploy getInstance() {
        if (_instance == null) {
            _instance = new Deploy();
            init();
        }
        return _instance;

    }

    public CommandData getCommandData() {
        return commandData;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        IResponse.responseSimple(event, "Commands deployed on " + event.getOptions().get(0).getAsString());
    }
}
