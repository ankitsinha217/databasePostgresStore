package springpostgresqlController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping("/")
	public String getReult()
	{
		return "Hello";
	}
	
	
	
}
