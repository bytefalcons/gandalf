package com.bytefalcons.gandalf.designpatterns.structural.adapter.audioplayer;

public class AudioPlayerDemo {

    public static void main(String[] args) {

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","hello.mp3");
        audioPlayer.play("vlc","hello.vlc");
        audioPlayer.play("mp4","hello.mp4");

    }
}
