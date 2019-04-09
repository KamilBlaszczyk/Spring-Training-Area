package com.example.courseData.Course;

import com.example.courseData.Topics.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    public List<Course> findByTopicId(Integer topicId);

}
