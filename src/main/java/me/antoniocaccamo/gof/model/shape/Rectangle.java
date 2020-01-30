package me.antoniocaccamo.gof.model.shape;

import lombok.extern.slf4j.Slf4j;
import me.antoniocaccamo.gof.model.Shape;

/**
 * @author antoniocaccamo on 30/01/2020
 */
@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
      log.info("drawing a {} ", getClass().getSimpleName());
    }
}
