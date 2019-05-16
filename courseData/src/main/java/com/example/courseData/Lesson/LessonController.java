package com.example.courseData.Lesson;

import com.example.courseData.Course.Course;
import com.example.courseData.Topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @RequestMapping("/topics/{topicId}/courses/{id}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String topicId, @PathVariable String id ) {
        return lessonService.getAllLessons(topicId, id);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}/lesson/{id}")
    public Optional<Lesson> getLesson(@PathVariable String id) {

        return lessonService.getLesson(id);

    }

//    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicID}/courses/{coursesId}/lessons")
//    public void addLesson(@RequestBody Lesson lesson, @PathVariable Integer topicID, @PathVariable Integer coursesId) {
//        lesson.setCourse(new Course(coursesId,"", "", new Topic(topicID,"","")));
//        lessonService.addCourse(lesson);


//  }
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable Integer topicId, @PathVariable Integer courseId, @PathVariable Integer id) {
//        lesson.setCourse(new Course(courseId, "", "", new Topic(topicId,"","") ));
        lessonService.updateCourse(lesson);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicID}/courses/{courseId}/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteCourse(id);
    }




}
