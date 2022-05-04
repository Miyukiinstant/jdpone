package com.miyuki.jdbot.deploy.abstracts;

import com.miyuki.jdbot.deploy.interfaces.IDeploy;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public abstract class Deploy implements IDeploy {
    public abstract void deploy(JDA bot, CommandData commandData);
}
