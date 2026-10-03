package springboot1.class1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot1.class1.models.Course;

public interface CourseJdbcRepository extends JpaRepository<Course, Long> {
    
    List<Course> findByAuthor(String author);

}