package managers;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import events.DummyEvent;
import events.Event;

public class EventManagerTest {

	@Test
	public void testAdd() {
		EventManager addToMe = new EventManager(1);
		assertTrue(addToMe.events.size() == 0);
		addToMe.add(new DummyEvent());
		assertTrue(addToMe.events.size() == 1);
		addToMe.add(new DummyEvent());
		assertTrue(addToMe.events.size() == 2);
	}
	
	
	@Test
	public void testPriority() {
		EventManager addToMe = new EventManager(1);
		addToMe.add(new DummyEvent(3));
		addToMe.add(new DummyEvent(4));
		addToMe.add(new DummyEvent(5));
		Event e = addToMe.events.peek();
		assertTrue(e.getPriority() == 5);
	}
	
	

	@Test
	public void testRun() {
		EventManager runMe = new EventManager();
		runMe.add(new DummyEvent());
		assertTrue(runMe.events.size() == 1);
		runMe.run();
		assertTrue(runMe.events.size() == 0);

	}
}
