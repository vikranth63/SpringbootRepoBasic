package com.vikranth.springbootApp.Lesson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikranth.springbootApp.Course.Course;

@RestController
public class LessonController {

	@Autowired
	private LessonService lessonService;

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{courseId}/lessons")
	public List<Lesson> getAllLessons(@PathVariable("courseId") String id) {

		return lessonService.getAllLessons(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/topics/{topicId}/courses/{CourseId}/lessons/{id}")
	public Lesson getLesson(@PathVariable("id") String id) {

		return lessonService.getLesson(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/{courseId}/lessons")
	public void addLesson(@PathVariable("courseId") String courseId, @RequestBody Lesson lesson) {
		lesson.setCourse(new Course(courseId, "", ""));
		lessonService.addLesson(lesson);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void updateLesson(@PathVariable("courseId") String courseId, @RequestBody Lesson lesson) {
		lesson.setCourse(new Course(courseId, "", ""));
		lessonService.updateLesson(lesson);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void deleteCourse(@PathVariable("id") String id) {

		lessonService.deleteLesson(id);
	}

}
