package chapter7;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class AttendeeTest {

	@Test
	public void testAdd() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Attendee attendee = new Attendee();
		attendee.add("�Ⱥ���");
		
		Field attendeeList = attendee.getClass().getDeclaredField("attendeeList");
		
		attendeeList.setAccessible(true);
		assertEquals("�Ⱥ���",((List<String>)attendeeList.get(attendee)).get(0));
	}
	
	@Ignore @Test
	public void testGet(){
		Attendee attendee = new Attendee();
		attendee.add("�Ⱥ���");
		assertEquals("�Ⱥ���", attendee.get(1));

	}
}
