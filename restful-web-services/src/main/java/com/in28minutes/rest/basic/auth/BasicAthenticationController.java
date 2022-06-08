package com.in28minutes.rest.basic.auth;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAthenticationController  {
	

	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean(){
		//throw new RuntimeException("Some error has happened!");
		return new AuthenticationBean("Hello World - Changed");
	}
	

}
