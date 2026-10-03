package springboot1.class1.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot1.class1.models.Course;

import org.springframework.web.bind.annotation.GetMapping;
import springboot1.class1.services.CourseService;


@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("allcourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

}
