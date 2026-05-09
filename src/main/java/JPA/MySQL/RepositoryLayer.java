package JPA.MySQL;

import JPA.MySQL.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryLayer extends JpaRepository<Student, Integer>{
    List<Student> findByDept(String dept);
    List<Student> findByYear(int year);
    List<Student> findByName(String name);
}
