package com.example.courseData.Topics;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
@AllArgsConstructor
@Service
public class TopicService{

    private TopicRepository topicRepository;
//
//    private List<com.example.courseData.Lesson> lista = new ArrayList<>(Arrays.asList(
//            new com.example.courseData.Lesson("elo", "Elo", "elo"),
//            new com.example.courseData.Lesson("hej", "Elo", "elo"),
//            new com.example.courseData.Lesson("cotam", "Elo", "elo"),
//            new com.example.courseData.Lesson("presidento", "Elo", "elo"),
//            new com.example.courseData.Lesson("jojojol", "Elo", "elo")
//    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(Integer id) {
//        return lista.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.getTopicById(id);

    }

    public void addTopic(Topic topic) {

        topicRepository.save(topic);
    }


    public void updateTopic(Topic topic, Integer id) {
//        for (int i = 0; i < lista.size(); i++) {
//            com.example.courseData.Lesson t = lista.get(i);
//            if (t.getId().equals(id)) lista.set(i, topic);
//
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(Integer id) {
////        for (int i = 0; i < lista.size(); i++) {
////////            com.example.courseData.Lesson t = lista.get(i);
////////            if (t.getId().equals(id)) lista.remove(i);
//        lista.removeIf(x -> x.getId().equals(id));
//
//        }
        topicRepository.deleteById(id);

    }
}



