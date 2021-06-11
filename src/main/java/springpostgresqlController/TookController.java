package springpostgresqlController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootpostgresql.springpostgresql.Took;
import springbootpostgresql.springpostgresql.TookRepository;

@RestController
public class TookController {
	@Autowired
	TookRepository took;
	@RequestMapping("/tooks")
	public String listAll(Model model) {
		List<Took> listtook = took.findAll();
		model.addAttribute("listtook", listtook);
		return "listtook";	
		
}
	@Autowired
	TookService tooksService;
	@RequestMapping("/tookss")  
	private List<Took> getAllBooks()   
	{  
	return tooksService.getAllTooks();  
	}  
    
	
	
}
