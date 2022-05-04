package com.miyuki.jdbot.interfaces;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.awt.*;

public interface IResponse {

    static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, @NotNull String description) {
        event.replyEmbeds(new EmbedBuilder().setTitle(title).setDescription(description).setColor(Color.magenta).build()).queue();
    }

    static void responseEmbedError(SlashCommandInteractionEvent event, @Nonnull String title, @NotNull String description, Boolean ephemeral) {
        event.replyEmbeds(new EmbedBuilder().setTitle(title).setDescription(description).setColor(Color.RED).build()).setEphemeral(ephemeral).queue();
    }

    static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, @NotNull String description, @NotNull Boolean ephemeral) {
        event.replyEmbeds(new EmbedBuilder().setTitle(title).setDescription(description).setColor(Color.magenta).build()).setEphemeral(ephemeral).queue();
    }

    static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, @NotNull String description, @NotNull String url, @NotNull Boolean ephemeral) {

        MessageEmbed embed = new EmbedBuilder().setTitle(title).setDescription(description).setImage(url).setColor(Color.magenta).build();
        event.replyEmbeds(embed).setEphemeral(ephemeral).queue();

    }

    static void responseEmbed(SlashCommandInteractionEvent event, @Nonnull String title, @NotNull String description, @NotNull String url, @NotNull String footer, @NotNull Boolean ephemeral) {

        event.replyEmbeds(new EmbedBuilder().setTitle(title).setDescription(description).setImage(url).setColor(Color.magenta).setFooter(footer).build()).setEphemeral(ephemeral).queue();

    }

    static void responseSimple(SlashCommandInteractionEvent event, @Nonnull String content, @NotNull Boolean ephemeral) {
        event.replyEmbeds(new EmbedBuilder().setTitle(content).setColor(Color.green).build()).setEphemeral(ephemeral).queue();
    }

    static void responsePlayer(SlashCommandInteractionEvent event, @Nonnull String url, @NotNull Boolean ephemeral) {
        event.replyEmbeds(new EmbedBuilder().setTitle("Now Playing!").setColor(Color.green).setDescription(url).build()).setEphemeral(ephemeral);
    }
}
