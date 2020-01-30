package me.antoniocaccamo.gof.structural.adapter;

/**
 * @author antoniocaccamo on 30/01/2020
 */
public class MediaAdapter implements MediaPlayer {


    @Override
    public void play(String type, String fileName) {

        VideoMediaPlayer.VideoMediaPlayerFactory(type).play(type,fileName);
    }

}
