package chapter2;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class DisplayTest {

	@Test // ���ڿ� ��
	public void testGetString() { 
		assertEquals("Happy", Display.getString());
	}
	
	@Test(expected=NumberFormatException.class) //exception �� �߻����� ������ ����
	public void testException(){
		String value = "a108";
		System.out.println(Integer.parseInt(value));
	}
	
	@Ignore @Test(timeout=5000) // �׽�Ʈ ����
	public void TestPingback() throws Exception{
		
	}
	
	@Test
	public void testArrayAssertEquals() throws Exception{
		String[] names = {"Tom" , "JIMMIY", "JOHIN"};
		String[] anotherNames = {"Tom" , "JIMMIY", "JOHIN"};
		assertArrayEquals(names, anotherNames);
	}
}
