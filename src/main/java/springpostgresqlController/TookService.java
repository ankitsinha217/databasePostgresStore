package springpostgresqlController;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

import springbootpostgresql.springpostgresql.Took;
import springbootpostgresql.springpostgresql.TookRepository;

public class TookService {
	
	@Autowired  
	TookRepository tookRepo;  
	
	public List<Took> getAllTooks()   
	{  
	List<Took> tooks = new ArrayList<Took>();
	tookRepo.findAll().forEach(tooks1 -> tooks.add(tooks1));  
	System.out.println("tooks---"+tooks);
	return tooks;  
	}  

}
