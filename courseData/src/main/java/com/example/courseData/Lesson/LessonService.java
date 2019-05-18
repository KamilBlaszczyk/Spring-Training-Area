package com.example.courseData.Lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;


    public List<Lesson> getAllLessons(String courseId, String id) {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(id).forEach(lessons::add);
        return lessons;
    }

    public Optional<Lesson> getLesson(String id) {
//        return lista.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return lessonRepository.findById(id);
    }

    public void addCourse(Lesson lesson) {

        lessonRepository.save(lesson);
    }


    public void updateCourse(Lesson lesson) {
//        for (int i = 0; i < lista.size(); i++) {
//            com.example.courseData.Lesson t = lista.get(i);
//            if (t.getId().equals(id)) lista.set(i, lesson);
//        }
        lessonRepository.save(lesson);
    }

    public void deleteCourse(String id) {
////        for (int i = 0; i < lista.size(); i++) {
////////            com.example.courseData.Lesson t = lista.get(i);
////////            if (t.getId().equals(id)) lista.remove(i);
//        lista.removeIf(x -> x.getId().equals(id));
//        }
        lessonRepository.deleteById(id);
    }
}



