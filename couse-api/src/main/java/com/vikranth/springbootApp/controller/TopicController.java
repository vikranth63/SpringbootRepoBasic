package com.vikranth.springbootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikranth.springbootApp.resources.Topic;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping(method=RequestMethod.GET, value="/topics")
	public List<Topic> getAllTopics() {

		return topicService.getAllTopics();
	}

	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable("id") String id) {

		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {

		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic) {

		topicService.updateTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable("id") String id) {

		topicService.deleteTopic(id);
	}

}
