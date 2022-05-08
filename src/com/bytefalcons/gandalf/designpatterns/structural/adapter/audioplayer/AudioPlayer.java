package com.bytefalcons.gandalf.designpatterns.structural.adapter.audioplayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing audio " + fileName);

        if(MediaTypes.MP3.name().equalsIgnoreCase(audioType)) {
            System.out.println("Playing MP3.." + fileName);
        } else if(MediaTypes.MP4.name().equalsIgnoreCase(audioType) || MediaTypes.VLC.name().equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("AudioType '"+ audioType +"' not Supported " + fileName);
        }
    }
}
