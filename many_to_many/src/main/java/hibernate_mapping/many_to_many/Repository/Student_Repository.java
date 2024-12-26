package hibernate_mapping.many_to_many.Repository;

import hibernate_mapping.many_to_many.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Student_Repository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);

}
