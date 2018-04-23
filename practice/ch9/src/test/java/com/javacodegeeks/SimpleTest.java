package com.javacodegeeks;

import org.junit.Assert;
import org.junit.*;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SimpleTest {
	
	@Test
	public void test() {
		SampleExample example = new SampleExample();
		example.addInteger(10);
		example.addInteger(100);
		Assert.assertEquals(example.getSize(), 2);
	}

}
