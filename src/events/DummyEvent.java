package events;

public class DummyEvent extends Event {

	public DummyEvent() {

	}

	public DummyEvent(int priority) {
		super(priority);
	}

	@Override
	public int executeEvent() {
		return this.priority;
	}

}
