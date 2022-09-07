/**
 * 
 */

package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for PlayedWord model class matches method
 * @author Amber Nicholas
 * @version 9.5.22
 *
 */
class TestPlayedWordMatches {
	private PlayedWord playedWordTest;
	
	/**
	 * do before each test
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.playedWordTest = new PlayedWord();
	}
	
	@Test
	void hasTilesForAMultipleLetterWord() {
		this.playedWordTest = new PlayedWord("steaks");
		
		assertEquals(true, this.playedWordTest.matches("STEAKS"));
	}
	
	@Test
	void hasTilesForASingleLetterWord() {
		this.playedWordTest = new PlayedWord("a");
		assertEquals(true, this.playedWordTest.matches("A"));
	}

	@Test
	void cannotMatchWordWhenTilesAreScrambled() {
		this.playedWordTest = new PlayedWord("teska");
		
		assertEquals(false, this.playedWordTest.matches("STEAK"));
	}
	
	@Test
	void cannotMatchWordIfInsufficientTiles() {
		this.playedWordTest = new PlayedWord("a");
		
		assertEquals(false, this.playedWordTest.matches("AT"));
	}
	
	@Test
	void canMatchWordWithDuplicateLetters() {
		this.playedWordTest = new PlayedWord("anna");
		
		assertEquals(true, this.playedWordTest.matches("ANNA"));
	}
	
	@Test
	void nonEmptyWordShouldNotMatchEmptyText() {
		this.playedWordTest = new PlayedWord("a");
		
		assertEquals(false, this.playedWordTest.matches(""));
	}
	
	@Test
	void emptyWordShouldNotMatchEmptyText() {
		this.playedWordTest = new PlayedWord("");
		
		assertEquals(false, this.playedWordTest.matches(""));
	}
	
	@Test
	void shouldNotAllowNull() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> this.playedWordTest.matches(null));
		assertEquals("class java.lang.IllegalArgumentException", "" + exception.getClass());
	}

}
