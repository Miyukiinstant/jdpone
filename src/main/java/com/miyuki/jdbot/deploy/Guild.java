package com.miyuki.jdbot.deploy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public class Guild extends Deploy {
    private static Guild _instance;
    private Guild(){}

    public static Guild getInstance(){
        if(_instance == null){
            _instance = new Guild();
        }
        return _instance;
    }

    @Override
    public void deploy(JDA bot, CommandData commandData) {
        IDeploy.deployGuild(bot, commandData);
    }
}
