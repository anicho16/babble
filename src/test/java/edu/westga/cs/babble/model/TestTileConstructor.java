/**
 * 
 */
package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author amber
 *
 */
public class TestTileConstructor {
	Tile theTile;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public void shouldNotAllowNonLetters() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> this.theTile = new Tile('@'));
		assertEquals("letter must be between A and Z", exception.getMessage());
	}

}


