package com.bytefalcons.gandalf.designpatterns.structural.adapter.audioplayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(MediaTypes.MP4.name().equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new MP4Player();
        } else if (MediaTypes.VLC.name().equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("[MediaAdapter.play] Playing Audio :" + fileName);
        if(MediaTypes.MP4.name().equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMP4(fileName);
        } else if (MediaTypes.VLC.name().equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVLC(fileName);
        }
    }
}
