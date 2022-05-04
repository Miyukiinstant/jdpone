package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.api.GetWaifu;
import com.miyuki.jdbot.interfaces.IResponse;
import com.miyuki.jdbot.interfaces.abstracts.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

import java.util.ArrayList;
import java.util.List;

public class Social extends Response{

    private static Social _instance;
    private static List<OptionData> optionData;
    private static CommandData commandData;

    private Social() {
    }


    private static void init() {
        optionData = new ArrayList<>();
        optionData.add(new OptionData(OptionType.STRING, "social", "select", true)
                .addChoice("poke", "poke")
                .addChoice("wink", "wink")
                .addChoice("kick", "kick")
                .addChoice("kill", "kill")
                .addChoice("slap", "slap")
                .addChoice("bite", "bite")
                .addChoice("nom", "nom")
                .addChoice("bonk", "bonk")
                .addChoice("pat", "pat")
                .addChoice("lick", "lick")
                .addChoice("kiss", "kiss"));
        optionData.add(new OptionData(OptionType.USER, "someone", "select", true));
        commandData = new CommandDataImpl("social", "interact with people").addOptions(optionData);
    }

    public static Social getInstance() {
        if (_instance == null) {
            _instance = new Social();
            init();
        }
        return _instance;
    }

    public CommandData getCommandData() {
        return commandData;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        Object url = GetWaifu.getWaifuPic("sfw", event.getOptions().get(0).getAsString());

        if (!url.equals(false)) {
            IResponse.responseEmbed(event, "Waifu", event.getInteraction().getUser().getAsMention() + " " + event.getOptions().get(0).getAsString() + " " + event.getOptions().get(1).getAsMentionable().getAsMention(),
                    url.toString(),
                    "provided by waifu.pics", false);

        } else {
            IResponse.responseEmbed(event, "Failed", "failed to reach image", true);
        }

    }
}
