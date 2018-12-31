package com.vikranth.springbootApp.Lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.vikranth.springbootApp.Course.Course;
import com.vikranth.springbootApp.Topic.Topic;

@Entity
public class Lesson {

	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
    private Course course;
	/**
	 * Constructor
	 */
	public Lesson() {

	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Lesson(String id, String name, String description, String course) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.course = new Course(course,"","");
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

}
