package chapter2;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class DisplayTest {

	@Test // 문자열 비교
	public void testGetString() { 
		assertEquals("Happy", Display.getString());
	}
	
	@Test(expected=NumberFormatException.class) //exception 이 발생하지 않으면 실패
	public void testException(){
		String value = "a108";
		System.out.println(Integer.parseInt(value));
	}
	
	@Ignore @Test(timeout=5000) // 테스트 무시
	public void TestPingback() throws Exception{
		
	}
	
	@Test
	public void testArrayAssertEquals() throws Exception{
		String[] names = {"Tom" , "JIMMIY", "JOHIN"};
		String[] anotherNames = {"Tom" , "JIMMIY", "JOHIN"};
		assertArrayEquals(names, anotherNames);
	}
}
