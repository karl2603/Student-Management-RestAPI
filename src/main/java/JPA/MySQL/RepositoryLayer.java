package JPA.MySQL;

import JPA.MySQL.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLayer extends JpaRepository<Student, Integer>{

}
