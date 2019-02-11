package com.example.howtodoinjava.springhelloworldcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringHelloworldCfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloworldCfApplication.class, args);
	}

}
@RestController
class MessageController
{
	@RequestMapping("/hello")
	public String getMessage(@RequestParam(value="name") String name)
	{
		String resp="Hi " +name +" How you doing";
		System.out.println(resp);
		return resp;
	}
}
