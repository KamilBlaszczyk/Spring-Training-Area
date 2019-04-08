package com.example.courseData.Course;

import com.example.courseData.Topics.Topic;
import com.sun.javafx.geom.transform.Identity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

}
