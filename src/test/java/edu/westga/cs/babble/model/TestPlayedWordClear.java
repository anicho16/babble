/**
 * 
 */
package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for PlayedWord model class clear method
 * @author Amber Nicholas
 * @version 9.6.22
 *
 */
class TestPlayedWordClear {
	private PlayedWord playedWordTest;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.playedWordTest = new PlayedWord();
	}

	@Test
	void shouldClearEmptyWord() {
		this.playedWordTest.clear();
		
		assertEquals(0, this.playedWordTest.tiles().size());
		assertEquals(0, this.playedWordTest.getScore());
	}
	
	@Test
	void shouldClearWordWithOneTile() {
		this.playedWordTest = new PlayedWord("a");
		this.playedWordTest.clear();
		
		assertEquals(0, this.playedWordTest.tiles().size());
		assertEquals(0, this.playedWordTest.getScore());
	}
	
	@Test
	void shouldClearWordWithManyTiles() {
		this.playedWordTest = new PlayedWord("bananna");
		this.playedWordTest.clear();
		
		assertEquals(0, this.playedWordTest.tiles().size());
		assertEquals(0, this.playedWordTest.getScore());
	}

}
