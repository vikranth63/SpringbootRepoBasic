package com.vikranth.springbootApp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikranth.springbootApp.topic.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(new Topic("Java","Core Java", "Java Description"),
				new Topic("JavaScript","Native JS", "Java Script Description"),
				new Topic("Springboot","SpringBoot", "Springboot Description"),
				new Topic("Docker","Docker", "Docker Description"));
		
		
	}

}
