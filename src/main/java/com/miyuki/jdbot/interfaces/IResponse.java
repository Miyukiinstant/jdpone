package com.miyuki.jdbot.interfaces;

import java.awt.Color;
import javax.annotation.Nonnull;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public interface IResponse {
    
    public static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, String description) {
        event.replyEmbeds(new EmbedBuilder().setTitle(title).setDescription(description).build()).queue();
    }
    
    public static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, String description, Boolean ephemeral) {
        event.replyEmbeds(new EmbedBuilder().setTitle(title).setDescription(description).build()).setEphemeral(ephemeral).queue();
    }
    
    public static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, String description, String url, Boolean ephemeral) {
        
        MessageEmbed embed = new EmbedBuilder().setTitle(title).setDescription(description).setImage(url).setColor(Color.magenta).build();
        event.replyEmbeds(embed).setEphemeral(true).queue();
        
    }

    public static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, String description, String url, String footer, Boolean ephemeral) {
        
        MessageEmbed embed = new EmbedBuilder().setTitle(title).setDescription(description).setImage(url).setColor(Color.magenta).setFooter(footer).build();
        event.replyEmbeds(embed).setEphemeral(true).queue();
        
    }
    
    public static void responseSimple(SlashCommandInteractionEvent event, @Nonnull String content) {
        event.reply(content);
    }
}
