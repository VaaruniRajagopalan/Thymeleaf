package hibernate_mapping.many_to_many.Repository;

import hibernate_mapping.many_to_many.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Course_Repository extends JpaRepository<Course, Long> {
    List<Course> findByFeeLessThan(double fee);
}