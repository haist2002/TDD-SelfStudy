package chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttendeeTest {

	@Test
	public void testAdd() {
		Attendee attendee = new Attendee();
		attendee.add("¾Èº´ÈÖ");
		assertEquals("¾Èº´ÈÖ", attendee.get(1));
	}
	
	@Test
	public void testGet(){
		Attendee attendee = new Attendee();
		attendee.add("¾Èº´ÈÖ");
		assertEquals("¾Èº´ÈÖ", attendee.get(1));
	}
}
