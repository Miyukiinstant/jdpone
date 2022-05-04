package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.init.RegisterBotCommands;
import com.miyuki.jdbot.init.RegisterGuildCommands;
import com.miyuki.jdbot.init.remover.CommandRemover;
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
                .addChoice("bot", "bot")
                .addChoice("guilds", "guilds"));
        commandData = new CommandDataImpl("deploy", "deploy commands").addOptions(optionData).setDefaultEnabled(true);
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
        System.out.println(event.getUser().getAsTag());
        System.out.println(event.getOptions().get(0));
        if (event.getUser().getAsTag().equals("Miyuki#9756")) {
            switch (event.getOptions().get(0).getAsString()) {
                case "bot":
                    CommandRemover.BotRemoveAllCommands(event);
                    RegisterBotCommands.InsertCommands(event);
                    IResponse.responseSimple(event, "Commands deployed on bot", true);
                    break;
                case "guild":
                    CommandRemover.GuildRemoveAllCommands(event);
                    RegisterGuildCommands.InsertCommands(event);
                    IResponse.responseSimple(event, "Commands deployed on guilds", true);
                    break;
            }
        }
        IResponse.responseEmbedError(event, "ERROR", "you are not the creator of this bot", true);
    }
}
