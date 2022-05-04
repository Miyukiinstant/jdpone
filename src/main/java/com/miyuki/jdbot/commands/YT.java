package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.IResponse;
import com.miyuki.jdbot.interfaces.abstracts.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

import java.util.ArrayList;
import java.util.List;

public class YT extends Response {
    private static YT _instance;
    private static CommandData commandData;
    private static List<OptionData> optionData;

    private YT() {
    }

    private static void init() {
        commandData = new CommandDataImpl("play", "about bot");
        optionData = new ArrayList<>();
        optionData.add(new OptionData(OptionType.STRING,"url","a youtube link", true));
    }

    public CommandData getCommandData() {
        return commandData;
    }

    public static YT getInstance() {
        if (_instance == null) {
            _instance = new YT();
            init();
        }
        return _instance;
    }
    public void play(SlashCommandInteractionEvent event){
        response(event);
    }
    @Override
    public void response(SlashCommandInteractionEvent event) {
        IResponse.responsePlayer(event, "Now Playing", true);
    }
}
