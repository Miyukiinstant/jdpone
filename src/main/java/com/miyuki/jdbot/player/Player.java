package com.miyuki.jdbot.player;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;


public class Player {
    private AudioPlayerManager playerManager = new DefaultAudioPlayerManager();
    private AudioPlayer player = playerManager.createPlayer();

    private void main(){
        player.addListener(TrackScheduler.getInstance());
    }

}
