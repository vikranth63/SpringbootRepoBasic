package com.vikranth.springbootApp.Lesson;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

	@Autowired
	private LessonRepository lessonRepository;

	/*
	 * List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Java",
	 * "Core Java", "Java Description"), new Topic("JavaScript", "Native JS",
	 * "Java Script Description"), new Topic("Springboot", "SpringBoot",
	 * "Springboot Description"), new Topic("Docker", "Docker",
	 * "Docker Description")));
	 */

	public List<Lesson> getAllLessons(String id) {
		// return topics;
		List<Lesson> lessons = new ArrayList<Lesson>();
		lessonRepository.findByCourseId(id).forEach(lessons::add);

		return lessons;

	}

	public Lesson getLesson(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return lessonRepository.findOne(id);

	}

	public void addLesson(Lesson lesson) {
		// topics.add(topic);
		lessonRepository.save(lesson);

	}

	public void updateLesson(Lesson lesson) {

		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic eachTopic = topics.get(i); if
		 * (eachTopic.getId().equals(id)) { topics.set(i, topic); break; }
		 * 
		 * }
		 */

		lessonRepository.save(lesson);

	}

	public void deleteLesson(String id) {
		/*
		 * for (int i = 0; i < topics.size(); i++) { Topic eachTopic = topics.get(i); if
		 * (eachTopic.getId().equals(id)) { topics.remove(i); break; }
		 * 
		 * }
		 */

		lessonRepository.delete(id);

	}
}
