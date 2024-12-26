package hibernate_mapping.many_to_many.Model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;

import java.util.Set;

@Entity
@Table(name = "STUDENT_TABLE")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String dept;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE_TABLE",joinColumns = {@JoinColumn(name="student_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "id")} )

    private Set<Course> courses;
    public Student(){

    }

    public Student(Long id, Set<Course> courses, String name, int age, String dept) {
        this.id = id;
        this.courses = courses;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

