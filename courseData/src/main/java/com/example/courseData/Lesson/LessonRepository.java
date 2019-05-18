package com.example.courseData.Lesson;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LessonRepository extends CrudRepository<Lesson, String> {
    public List<Lesson> findByCourseId(String courseId);
    public List<Lesson> findByCourseName(String courseName);

}
