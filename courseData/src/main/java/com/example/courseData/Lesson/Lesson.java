package com.example.courseData.Lesson;

import com.example.courseData.Course.Course;
import com.example.courseData.Topics.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Lesson {
    @Id
    private String id;

    private String name;
    private String description;

    @ManyToOne
    private Course course;

}
