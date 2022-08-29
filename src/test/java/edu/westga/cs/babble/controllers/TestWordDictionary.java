package edu.westga.cs.babble.controllers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestWordDictionary {

	WordDictionary dictionary;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.dictionary = new WordDictionary();
	}

	
	@Test
	public void stringExpandShouldBeValid() {
		assertTrue(this.dictionary.isValidWord("Expand"));
	}
	
	@Test
	public void stringBugblatShouldNotBeValid() {
		assertFalse(this.dictionary.isValidWord("Bugblat"));
	}
	
	@Test
	public void emptyStringShouldNotBeValid() {
		assertFalse(this.dictionary.isValidWord(""));
	}

	@Test
	public void shouldNotAcceptNull() {
		assertFalse(this.dictionary.isValidWord(null));
	}
}
