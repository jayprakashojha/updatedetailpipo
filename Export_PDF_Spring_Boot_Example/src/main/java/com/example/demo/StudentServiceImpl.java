package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Student;
import com.example.demo.StudentRepoPDF;

@Service

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepoPDF studentRepo;

	@Override
	public void addStudent(Student student) {
	studentRepo.save(student);
	}

	@Override
	public List<Student> getStudentList() {
	return studentRepo.findAll();
	}
}
