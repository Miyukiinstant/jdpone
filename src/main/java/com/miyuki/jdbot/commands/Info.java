
package com.miyuki.jdbot.commands;

import com.miyuki.jdbot.interfaces.Response;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import com.miyuki.jdbot.interfaces.IResponse;


public class Info extends Response {

    private static Info _instance;

    private Info() {
    }

    ;
    
    public static Info getInstance() {
        if (_instance == null) {
            _instance = new Info();
        }
        return _instance;
    }

    @Override
    public void response(SlashCommandInteractionEvent event) {
        IResponse.responseEmbed(event, "JDA Bot", "This bot was entirely made in Java", true);
    }
}
