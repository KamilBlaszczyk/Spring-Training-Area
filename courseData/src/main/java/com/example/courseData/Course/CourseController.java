package com.example.courseData.Course;

import com.example.courseData.Topics.Topic;
import com.example.courseData.Topics.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class CourseController {

    private CourseService courseService;
    private TopicService topicService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable Integer id) {
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable Integer id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicID}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable Integer topicID) {
        course.setTopic(topicService.getTopic(topicID));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/id")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
//        course.setTopic(new Topic(topicID, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{topicID}/courses/{id}")
    public void deleteCourse(@PathVariable Integer id) {
        courseService.deleteCourse(id);
    }
    }
