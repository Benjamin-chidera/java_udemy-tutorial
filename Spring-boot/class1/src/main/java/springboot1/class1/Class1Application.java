package springboot1.class1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@RequestMapping("/api")
public class Class1Application {

	public static void main(String[] args) {
		SpringApplication.run(Class1Application.class, args);
	}

	@GetMapping("/home")
	public String hello() {
		return "Hello World";
	}

}
