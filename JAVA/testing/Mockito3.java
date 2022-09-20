package testing;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class Mockito3 {

	@Test
	public void test() {
		//fail("Not yet implemented");
	/*	List<String> lst = new ArrayList<>();
		//lst.add("Kiran");
		List<String> spyList = spy(lst);
		when(spyList.size()).thenReturn(5);
		spyList.add("Lisna");
		spyList.add("Glory");
		assertEquals("Lisna",spyList.get(0)); */
		
		List s = Mockito.spy(new ArrayList());
		s.add("Vishnu");
		Mockito.verify(s).add("Vishnu");
		
	}

}
