package springpostgresqlController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootpostgresql.springpostgresql.Student;
import springbootpostgresql.springpostgresql.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentRepo;
	@RequestMapping("/students")
	public String listAll(Model model) {
		List<Student> listStudents = studentRepo.findAll();
		model.addAttribute("listStudents", listStudents);
		return "students";
	}
}
