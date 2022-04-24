package com.miyuki.jdbot.deploy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public abstract class Deploy implements IDeploy {
    public abstract void deploy(JDA bot, CommandData commandData);
}
