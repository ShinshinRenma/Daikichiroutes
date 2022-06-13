package com.codingdojo.daikichiroutes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiroutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiroutesApplication.class, args);
	}
	
	@RequestMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String welcome() { // 3
            return "Welcome!";
    }
	@RequestMapping("/daikichi/today")
    // 3. Method that maps to the request route above
    public String findLuck() { // 3
            return "Today you will find luck in all of your endeavors!";
    }
	@RequestMapping("/daikichi/tomorrow")
    // 3. Method that maps to the request route above
    public String tomorrow() { 
            return "Tomorrow, an opportunity will rise, so be sure to be open to new ideas!";
    }

}


