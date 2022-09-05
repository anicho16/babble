/**
 * 
 */
package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for PlayedWord model class getScore method
 * @author Amber Nicholas
 * @version 9.5.22
 *
 */
class TestPlayedWordGetScore {
	private PlayedWord playedWordTest;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.playedWordTest = new PlayedWord();
	}

	@Test
	void emptyWordShouldHaveScoreOfZero() {
		assertEquals(0, this.playedWordTest.getScore());
	}
	
	@Test
	void scoreAOneTileWord() {
		this.playedWordTest = new PlayedWord("Q");
		assertEquals(10, this.playedWordTest.getScore());
	}
	
	@Test
	void scoreAWordWithMultipleDifferingTiles() {
		this.playedWordTest = new PlayedWord("Jinx");
		assertEquals(18, this.playedWordTest.getScore());
	}
	
	@Test
	void scoreAWordContainingDuplicateTiles() {
		this.playedWordTest = new PlayedWord("bananna");
		assertEquals(9, this.playedWordTest.getScore());
	}

}
