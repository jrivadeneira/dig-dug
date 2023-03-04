package managers;

import java.util.PriorityQueue;

import events.Event;

public class EventManager implements Runnable {
	PriorityQueue<Event> events;

	public EventManager() {
		this.events = new PriorityQueue<Event>();
	}
	
	public EventManager(int size) {
		this.events = new PriorityQueue<Event>();
	}
	
	public void add(Event event) {
		this.events.add(event);
	}
	
	public void run() {
		while (events.size() != 0) {
			Event currentEvent = events.poll();
			if (currentEvent != null) {
				currentEvent.executeEvent();
			} else {
				break;
			}
		}
	}

}
