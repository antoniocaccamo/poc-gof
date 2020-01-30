package me.antoniocaccamo.gof.structural.adapter;

/**
 * @author antoniocaccamo on 30/01/2020
 */
public abstract class VideoMediaPlayer implements MediaPlayer {

    @Override
    abstract public void play(String type, String fileName) ;


    public static VideoMediaPlayer VideoMediaPlayerFactory(String type){
        if ("mp4".equalsIgnoreCase(type)){
            return new Mp4VideoMediaPlayer();
        }
        if ("mkv".equalsIgnoreCase(type)){
            return new MkvVideoMediaPlayer();
        }
        throw new  RuntimeException(String.format("no player for type : %s file ", type));
    }
}
