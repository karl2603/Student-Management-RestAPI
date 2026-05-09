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

    List<Student> filterStudentsByDept(String dept){
        return repository.findByDept(dept);
    }

    List<Student> filterStudentsByYear(int year){
        return repository.findByYear(year);
    }

    List<Student> findStudentByName(String name){
        return repository.findByName(name);
    }

    List<Student> filterToppersByDept(String department){
        return repository.findToppersByDept(department);
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
