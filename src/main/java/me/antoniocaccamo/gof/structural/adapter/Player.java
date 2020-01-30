package me.antoniocaccamo.gof.structural.adapter;


import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class Player {

    public static void play(List<String>files) {

        final AudioMediaPlayer audioMediaPlayer = new AudioMediaPlayer();

        files.stream()
                .forEach(
                        f -> {
                            try {
                                audioMediaPlayer.play(Files.getFileExtension(f), f);
                            } catch (Exception e) {
                                log.error("error.occurred : {}",e.getMessage());
                            }
                        }
                );
    }
}
