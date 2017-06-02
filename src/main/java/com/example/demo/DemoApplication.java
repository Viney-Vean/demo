package com.example.demo;


import com.example.demo.Things.Drawing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/hello")
	@ResponseBody
	String myString(){
		return "<h1> Hello</h1>";
	}

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Drawing d= context.getBean("drawing", Drawing.class);
		d.drawShape();
		d=context.getBean("drawing",Drawing.class);
	}
}
