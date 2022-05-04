package com.miyuki.jdbot.interfaces.abstracts;

import com.miyuki.jdbot.interfaces.IResponse;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public abstract class Response implements IResponse {

    public abstract void response(SlashCommandInteractionEvent event);

}
