package File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepoPDF studentRepo;

	@Override
	public void addStudent(Student student) {
		System.out.println("studentserviceimp");
	studentRepo.save(student);
	}

	@Override
	public List<Student> getStudentList() {
		System.out.println("studentserviceimpgetmethod");
	return studentRepo.findAll();
	}
}
