package JPA.MySQL.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student{
    @Id
    private int id;
    private String name;
    private String dept;
    private double cgpa;
    private int year;
}
