package springboot1.class1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springboot1.class1.models.Course;
import springboot1.class1.services.CourseServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CourseControllers {

    private final CourseServices courseServices;

    public CourseControllers(CourseServices courseServices) {
        this.courseServices = courseServices;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseServices.getAllCourses();
    }

    @PostMapping("/course")
    public String addCourse(@RequestBody Course course) {
        courseServices.insert(course);
        return "course added successfully";
    }

    @DeleteMapping("/course/{id}")
    public String deleteACourse(@PathVariable Long id) {
        courseServices.deleteById(id);
        return "course deleted successfully";
    }

    @PatchMapping("/course/{id}")
    public String updateACourse(@PathVariable Long id, @RequestBody Course course) {
        courseServices.updateCourseById(id, course);
        return "course updated successfully";
    }
    
    

}
