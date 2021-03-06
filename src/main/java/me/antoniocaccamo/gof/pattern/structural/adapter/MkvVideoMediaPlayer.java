package me.antoniocaccamo.gof.pattern.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class MkvVideoMediaPlayer extends VideoMediaPlayer {
    @Override
    public void play(String type, String fileName) {
        log.info("playing {} file {}", type, fileName);
    }
}
