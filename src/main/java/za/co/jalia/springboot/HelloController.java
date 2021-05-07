package za.co.jalia.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController{
	//this is the controller

	@RequestMapping("/")
	public String index(){
		return "Greetings from Spring Boot!";	
	}
}
