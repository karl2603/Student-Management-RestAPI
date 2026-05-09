package JPA.MySQL;

import JPA.MySQL.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryLayer extends JpaRepository<Student, Integer>{
    //Declaring Custom Methods
    List<Student> findByDept(String dept);
    List<Student> findByYear(int year);
    List<Student> findByName(String name);
    //Native Query
    @Query(nativeQuery = true,
    value = "SELECT * FROM student where dept = :department AND cgpa >= 8;"
    )
    List<Student> findToppersByDept(@Param("department") String department);
}
