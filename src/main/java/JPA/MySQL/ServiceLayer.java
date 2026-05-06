package JPA.MySQL;

import JPA.MySQL.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
    @Autowired
    RepositoryLayer repository;

    List<Student> displayStudents(){
        return repository.findAll();
    }

    void addStudent(Student student){
        repository.save(student);
    }

    Student getStudent(int id){
        return repository.findById(id).orElse(new Student());
    }

    void updateStudent(Student student){
        repository.save(student);
    }

    void deleteStudent(int id){
        repository.deleteById(id);
    }
}
