package com.example.courseData.Topics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class TopicController {

        @Autowired
        private TopicService topicService;

        @RequestMapping("/topics")
        public List<Topic> getAllTopics() {
            return topicService.getAllTopics();
        }

        @RequestMapping("/topics/{id}")
        public Topic getTopicById(@PathVariable Integer id) {
            return topicService.getTopic(id);
        }

        @PostMapping(value = "/topics")
        public void addTopic(@RequestBody Topic topic) {
            topicService.addTopic(topic);

        }

        @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
        public void updateTopic(@RequestBody Topic topic, @PathVariable Integer id) {
            topicService.updateTopic(topic, id);

        }

        @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
        public void deleteTopic(@PathVariable Integer id) {
            topicService.deleteTopic(id);
        }

    }
