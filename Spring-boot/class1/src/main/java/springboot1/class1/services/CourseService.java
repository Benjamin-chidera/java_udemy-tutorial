package springboot1.class1.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import springboot1.class1.models.Course;

@Service
public class CourseService {
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Web Development", "Benjamin"),
                new Course(2, "Web Development", "Benjamin"),
                new Course(3, "Web Development", "Benjamin"));
    }

}
