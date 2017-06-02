package com.example.demo.BeanConf;

import com.example.demo.Things.Circle;
import com.example.demo.Things.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by User on 6/2/2017.
 */
@Configuration
public class BeanConf {
    @Bean(name = "tri")
    public Triangle getTriangle(){
        return new Triangle();
    }
    @Bean(name = "cir")
    public Circle getCircle(){
        return new Circle();
    }
}
