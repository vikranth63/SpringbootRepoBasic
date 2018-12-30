package com.vikranth.springbootApp.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.vikranth.springbootApp.Topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
    private Topic topic;
	/**
	 * Constructor
	 */
	public Course() {

	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Course(String id, String name, String description, String topic) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topic,"","");
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
	 * @return the topic
	 */
	public Topic getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
