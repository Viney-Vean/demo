package com.example.demo.Things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by User on 6/2/2017.
 */
@Component
public class Drawing {
    private Shape shape;

    @Autowired
    @Qualifier("tri")
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape(){
        this.shape.draw();
    }
}
