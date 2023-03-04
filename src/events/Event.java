package events;

public abstract class Event implements Comparable {

	int priority;
	String name;
	public Event(int priority) {
		this.priority = priority;
	}

	public Event() {
	}

	@Override
	public int compareTo(Object event) {
		// TODO Auto-generated method stub

		return  ((Event) event).priority - this.priority;
	}

	public abstract int executeEvent();

	public int getPriority() {
		return this.priority;
	}
}
