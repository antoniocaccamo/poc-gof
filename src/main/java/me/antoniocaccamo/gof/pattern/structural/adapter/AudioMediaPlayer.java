package me.antoniocaccamo.gof.pattern.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class AudioMediaPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String type, String fileName) {

        log.info("try to playing file {} ..", fileName);

        if ( "mp3".equalsIgnoreCase(type)) {
            log.info("playing {} file {}", type, fileName);
        } else {
            mediaAdapter.play(type, fileName);
        }
    }
}
