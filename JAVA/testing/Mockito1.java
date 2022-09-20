package com.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class Mockito1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		List<String> ls = new ArrayList<>();
		List<String> s = spy(ls);
		when(s.size()).thenReturn(5);
		assertEquals(5,s.size());
		
	}

}
