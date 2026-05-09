package JPA.MySQL;

import JPA.MySQL.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Alpha")
public class StudentController {
    @Autowired
    ServiceLayer service;

    @GetMapping("/CIT/Students")
    List<Student> displayStudents(){
        return service.displayStudents();
    }

    @GetMapping("/CIT/Students/id/{id}")
    Student getStudent(@PathVariable("id") int id){
        return service.getStudent(id);
    }

    @GetMapping("/CIT/Students/{dept}")
    List<Student> filterStudentsByDept(@PathVariable("dept") String dept){
        return service.filterStudentsByDept(dept);
    }

    @GetMapping("/CIT/Students/year/{year}")
    List<Student> filterStudentsByYear(@PathVariable("year") int year){
        return service.filterStudentsByYear(year);
    }

    @GetMapping("/CIT/Students/")
    List<Student> findStudentByName(@Param("name") String name){
        return service.findStudentByName(name);
    }

    @GetMapping("/CIT/Students/{dept}/toppers")
    List<Student> filterToppersByDept(@PathVariable("dept") String dept){
        return service.filterToppersByDept(dept);
    }

    @PostMapping("/CIT/Students")
    String addStudent(@RequestBody Student student){
        service.addStudent(student);
        return "Student added to Database";
    }


    @PutMapping("CIT/Students")
    String updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        return "Updated Student";
    }

    @DeleteMapping("CIT/Students/{id}")
    String delelteStudent(@PathVariable("id") int id){
        service.deleteStudent(id);
        return "Deleted Student with id "+id+" from the database";
    }
}
