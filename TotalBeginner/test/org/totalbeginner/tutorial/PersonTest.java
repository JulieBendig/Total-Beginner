package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(10, p1.getMaximumBooks());
	}

	@Test
	public void testSetName() {
		Person p1 = new Person();
		p1.setName("Julie");
		assertEquals("Julie", p1.getName());
	}

	@Test
	public void testSetMaximumBooks() {
		Person p1 = new Person();
		p1.setMaximumBooks(20);;
		assertEquals(20, p1.getMaximumBooks());
	}
	
	@Test
	public void testToString() {
		Person p4 = new Person();
		p4.setName("Sully");
		p4.setMaximumBooks(5);
		// this implicitly documents the format that toString should use
		String testString = "Sully (5 books)";
		assertEquals(testString, p4.toString());
	}

}
