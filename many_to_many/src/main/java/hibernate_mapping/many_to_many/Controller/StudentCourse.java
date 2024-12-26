package hibernate_mapping.many_to_many.Controller;

import hibernate_mapping.many_to_many.Model.Course;
import hibernate_mapping.many_to_many.Model.Student;
import hibernate_mapping.many_to_many.Repository.Course_Repository;
import hibernate_mapping.many_to_many.Repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student/course")
public class StudentCourse {
    @Autowired
    public Student_Repository studentRepo;
    public Course_Repository courseRepo;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> findStudent(@PathVariable Long id){
        return studentRepo.findById(id);
    }

    @GetMapping("/find/{name}")
    public List<Student> findByNameContaining(@PathVariable String name){
        return studentRepo.findByNameContaining(name);
    }

    @GetMapping("/find/{price}")
    public List<Course> findByFeeLessThan(@PathVariable double price){
        return courseRepo.findByFeeLessThan(price);
    }
}
