package com.miyuki.jdbot;

import com.miyuki.jdbot.init.CommandHandler;
import com.miyuki.jdbot.init.CommandRegister;
import com.miyuki.jdbot.listeners.Ready;

import java.util.Collections;
import java.util.Date;
import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

    public static void main(String[] args) throws LoginException {

        JDA jda = JDABuilder.createLight(System.getenv("TOKEN"), Collections.emptyList())
                .addEventListeners(new CommandHandler(), new Ready())
                .setActivity(Activity.watching("Made in Java"))
                .build();
        CommandRegister.InsertCommands(jda);
    }

}
