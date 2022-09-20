package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class MockitoExample2 {

	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("Hi");
		List<String> mockList = mock(List.class);
		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
		System.out.println("World");
	}

}
