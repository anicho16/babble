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
	private TileRack availableTiles;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.playedWordTest = new PlayedWord();
		this.availableTiles = new TileRack();
	}
	
	@Test
	void hasTilesForAMultipleLetterWord() {
		this.playedWordTest = new PlayedWord("steaks");
		
		assertEquals(true, this.playedWordTest.matches("steaks"));
	}
	
	@Test
	void hasTilesForASingleLetterWord() {
		this.playedWordTest = new PlayedWord("a");
		
		assertEquals(true, this.playedWordTest.matches("a"));
	}

	@Test
	void cannotMatchWordWhenTilesAreScrambled() {
		this.availableTiles.append(new Tile('t'));
		this.availableTiles.append(new Tile('s'));
		this.availableTiles.append(new Tile('e'));
		this.availableTiles.append(new Tile('a'));
		this.availableTiles.append(new Tile('k'));
		
		assertEquals(false, this.playedWordTest.matches("steak"));
	}
	
	@Test
	void cannotMatchWordIfInsufficientTiles() {
		this.playedWordTest = new PlayedWord("a");
		
		assertEquals(true, this.playedWordTest.matches("a"));
	}
	
	@Test
	void canMatchWordWithDuplicateLetters() {
		this.playedWordTest = new PlayedWord("a");
		
		assertEquals(true, this.playedWordTest.matches("a"));
	}
	
	@Test
	void nonEmptyWordShouldNotMatchEmptyText() {
		this.playedWordTest = new PlayedWord("a");
		
		assertEquals(true, this.playedWordTest.matches("a"));
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
