package com.vikranth.springbootApp.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	/*
	 * List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java",
	 * "Core Java", "Java Description"), new Topic("JavaScript", "Native JS",
	 * "Java Script Description"), new Topic("Springboot", "SpringBoot",
	 * "Springboot Description"), new Topic("Docker", "Docker",
	 * "Docker Description")));
	 */

	public List<Course> getAllCourses(String id) {
		// return topics;
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(id).forEach(courses::add);

		return courses;

	}

	public Course getCourse(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);

	}

	public void addCourse(Course course) {
		// topics.add(topic);
		courseRepository.save(course);

	}

	public void updateCourse(Course course) {

		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic eachTopic = topics.get(i); if
		 * (eachTopic.getId().equals(id)) { topics.set(i, topic); break; }
		 * 
		 * }
		 */

		courseRepository.save(course);

	}

	public void deleteCourse(String id) {
		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic eachTopic = topics.get(i); if
		 * (eachTopic.getId().equals(id)) { topics.remove(i); break; }
		 * 
		 * }
		 */

		courseRepository.delete(id);

	}
}
