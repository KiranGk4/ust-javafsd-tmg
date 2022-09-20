package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class MockitoExample3 {

	@Mock
	List<String> mockList;
	
	@BeforeEach
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("Hi");
		when(mockList.get(0)).thenReturn("Sample");
		assertEquals("Sample", mockList.get(0));
		System.out.println("World");
	}

}
