package chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttendeeTest {

	@Test
	public void testAdd() {
		Attendee attende = new Attendee();
		attendee.add("¾Èº´ÈÖ");
		assertEquals("¾Èº´ÈÖ", attende.get(1));
	}
	
	@Test
	public void testGet(){
		Attendee attende = new Attendee();
		attendee.add("¾Èº´ÈÖ");
		assertEquals("¾Èº´ÈÖ", attende.get(1));
		Faild
	}
}
