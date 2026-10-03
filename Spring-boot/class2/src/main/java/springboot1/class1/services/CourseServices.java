package springboot1.class1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import springboot1.class1.models.Course;
import springboot1.class1.repository.CourseJdbcRepository;

@Service
public class CourseServices {

    private final CourseJdbcRepository courseRepository;

    public CourseServices(CourseJdbcRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public void insert(Course course) {
        courseRepository.save(course);
    }

    public void deleteById(Long id) {
        
        courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));

        courseRepository.deleteById(id);
    }

    public void updateCourseById(Long id, Course course) {

        Course existingCourse = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));

        if (course.getName() != null) {
            existingCourse.setName(course.getName());
        }
        if (course.getDescription() != null) {
            existingCourse.setDescription(course.getDescription());
        }
        if (course.getAuthor() != null) {
            existingCourse.setAuthor(course.getAuthor());
        }
        if (course.getRating() > 0) {
            existingCourse.setRating(course.getRating());
        }
        existingCourse.setPublished(course.isPublished());

        courseRepository.save(existingCourse);

    }
    
    public List<Course> findByAuthor(String author) {
        return courseRepository.findByAuthor(author);
    }
}
