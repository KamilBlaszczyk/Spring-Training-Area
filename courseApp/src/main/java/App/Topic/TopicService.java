package App.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class TopicService{

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> lista = new ArrayList<>(Arrays.asList(
            new Topic("ELo", "Elo", "elo"),
            new Topic("Java", "Elo", "elo"),
            new Topic("Hejnal", "Elo", "elo"),
            new Topic("starts", "Elo", "elo"),
            new Topic("peja", "Elo", "elo")
    ));

    public List<Topic> getAllTopics() {
    List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return lista.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }

    public void addTopic(Topic topic) {
        lista.add(topic);
    }


    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < lista.size(); i++) {
            Topic t = lista.get(i);
            if (t.getId().equals(id)) lista.set(i, topic);

        }
    }

    public void deleteTopic(String id) {
//        for (int i = 0; i < lista.size(); i++) {
//////            Course t = lista.get(i);
//////            if (t.getId().equals(id)) lista.remove(i);
        lista.removeIf(x -> x.getId().equals(id));

        }

    }



