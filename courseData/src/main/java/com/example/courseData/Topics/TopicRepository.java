package com.example.courseData.Topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
    Topic getTopicById(Integer id);

}
