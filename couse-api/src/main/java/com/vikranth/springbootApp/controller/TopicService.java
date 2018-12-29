package com.vikranth.springbootApp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikranth.springbootApp.resources.Topic;
import com.vikranth.springbootApp.resources.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/*
	 * List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java",
	 * "Core Java", "Java Description"), new Topic("JavaScript", "Native JS",
	 * "Java Script Description"), new Topic("Springboot", "SpringBoot",
	 * "Springboot Description"), new Topic("Docker", "Docker",
	 * "Docker Description")));
	 */

	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);

		return topics;

	}

	public Topic getTopic(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);

	}

	public void addTopic(Topic topic) {
		// topics.add(topic);
		topicRepository.save(topic);

	}

	public void updateTopic(Topic topic) {

		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic eachTopic = topics.get(i); if
		 * (eachTopic.getId().equals(id)) { topics.set(i, topic); break; }
		 * 
		 * }
		 */

		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic eachTopic = topics.get(i); if
		 * (eachTopic.getId().equals(id)) { topics.remove(i); break; }
		 * 
		 * }
		 */

		topicRepository.delete(id);

	}
}
