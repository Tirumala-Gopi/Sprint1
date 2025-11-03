package com.fdmgroup.schoolExercises;

public class Classroom {

	private String roomNumber;
	private int capacity;
	private String topic;
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "Classroom [roomNumber=" + roomNumber + ", capacity=" + capacity + ", topic=" + topic + "]";
	}
	public Classroom(String roomNumber, int capacity, String topic) {
		super();
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.topic = topic;
	}
	public void startLesson() {
		System.out.println("ClassRoom "+roomNumber+" is starting Lesson on "+topic);
	}
	public String getinfo()
	{
		return ("Room:"+roomNumber+",	Capacity:"+capacity+",	Topic:"+topic);
	}
	
	
}
