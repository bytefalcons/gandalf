package com.bytefalcons.gandalf.designpatterns.structural.adapter.audioplayer;

public enum MediaTypes {
    MP3("mp3"),
    MP4("mp4"),
    VLC("vlc");

    private String mediaType;

    MediaTypes(String type) {
        this.mediaType = type;
    }
}
