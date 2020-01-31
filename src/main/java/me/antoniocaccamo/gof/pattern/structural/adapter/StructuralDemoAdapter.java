package me.antoniocaccamo.gof.pattern.structural.adapter;


import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.pattern.structural.StructuralDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class StructuralDemoAdapter implements StructuralDemo{
	
	private static StructuralDemo structuralDemo = new StructuralDemoAdapter();
	
	
	private StructuralDemoAdapter() {
		log.info("");
		log.info(">> Adapter pattern works as a bridge between two incompatible interfaces.");
		log.info(">> This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.");
		log.info(">> This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces");
		log.info("");
	
	}


    public static StructuralDemo $() {
    	
       return structuralDemo;
    }

	@Override
	public void demo() {
		 final AudioMediaPlayer audioMediaPlayer = new AudioMediaPlayer();		 
		 
		 List<String> files = Arrays.asList(
                 "D:\\development\\workspaces\\at.video.mp4",
                 "D:\\development\\workspaces\\at.video.mkv",
                 "D:\\development\\workspaces\\at.video.txt",
                 "D:\\development\\workspaces\\at.video.mp3"
         );

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
