package chapter7;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttendeeTest {

	@Test
	public void testAdd() {
		Attendee attendee = new Attendee();
		attendee.add("�Ⱥ���");
		assertEquals("�Ⱥ���", attendee.get(1));
	}
	
	@Test
	public void testGet(){
		Attendee attendee = new Attendee();
		attendee.add("�Ⱥ���");
		assertEquals("�Ⱥ���", attendee.get(1));
	}
}
