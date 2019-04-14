package com.example.courseData.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(Integer topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(Integer id) {
//        return lista.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id);

    }

    public void addCourse(Course course) {

        courseRepository.save(course);
    }


    public void updateCourse(Course course) {
//        for (int i = 0; i < lista.size(); i++) {
//            com.example.courseData.Lesson t = lista.get(i);
//            if (t.getId().equals(id)) lista.set(i, course);
//
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(Integer id) {
////        for (int i = 0; i < lista.size(); i++) {
////////            com.example.courseData.Lesson t = lista.get(i);
////////            if (t.getId().equals(id)) lista.remove(i);
//        lista.removeIf(x -> x.getId().equals(id));
//
//        }
        courseRepository.deleteById(id);

    }
}



