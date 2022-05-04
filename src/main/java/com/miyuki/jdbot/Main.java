package com.miyuki.jdbot;

import com.miyuki.jdbot.init.CommandHandle;
import com.miyuki.jdbot.listeners.Ready;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws LoginException {

        JDABuilder.createLight(System.getenv("TOKEN"), Collections.emptyList())
                .addEventListeners(new CommandHandle(), new Ready())
                .setActivity(Activity.watching("Made in Java"))
                .build();
    }

}
