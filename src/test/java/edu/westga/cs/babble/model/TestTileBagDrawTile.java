/**
 * 
 */
package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for TileBag model class
 * @author Amber Nicholas
 * @version 8.30.22
 *
 */
public class TestTileBagDrawTile {
	TileBag bagOfTiles;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.bagOfTiles = new TileBag();
	}

	@Test
	public void canDrawAllTiles() {
		for(int counter = 0; counter < 98; counter++) {
			try {
				this.bagOfTiles.drawTile();
			} catch (EmptyTileBagException e) {
				e.printStackTrace();
			}
		}
		assertEquals(true, this.bagOfTiles.isEmpty());
	}
	
	@Test
	public void canNotDrawTooManyTiles() {
		for(int counter = 0; counter < 98; counter++) {
			try {
				this.bagOfTiles.drawTile();
			} catch (EmptyTileBagException e) {
				e.printStackTrace();
			}
		}
		Throwable exception = assertThrows(EmptyTileBagException.class, () -> this.bagOfTiles.drawTile());
		assertEquals("class edu.westga.cs.babble.model.EmptyTileBagException", "" + exception.getClass());
	}
	
	@Test
	public void hasProperTileDistribution() throws EmptyTileBagException {
		String allLetters = "";
		Tile theTile;
		for(int counter = 0; counter < 98; counter++) {
			theTile = this.bagOfTiles.drawTile();
			allLetters += theTile.getLetter();
		}
		
		long count = allLetters.chars().filter(ch -> ch == 'E').count();
		assertEquals(12, count);

		count = allLetters.chars().filter(ch -> ch == 'A').count();
		assertEquals(9, count);
		
		count = allLetters.chars().filter(ch -> ch == 'I').count();
		assertEquals(9, count);
		
		count = allLetters.chars().filter(ch -> ch == 'O').count();
		assertEquals(8, count);
		
		count = allLetters.chars().filter(ch -> ch == 'N').count();
		assertEquals(6, count);
		
		count = allLetters.chars().filter(ch -> ch == 'R').count();
		assertEquals(6, count);
		
		count = allLetters.chars().filter(ch -> ch == 'T').count();
		assertEquals(6, count);
		
		count = allLetters.chars().filter(ch -> ch == 'L').count();
		assertEquals(4, count);
		
		count = allLetters.chars().filter(ch -> ch == 'S').count();
		assertEquals(4, count);
		
		count = allLetters.chars().filter(ch -> ch == 'U').count();
		assertEquals(4, count);
		
		count = allLetters.chars().filter(ch -> ch == 'D').count();
		assertEquals(4, count);
		
		count = allLetters.chars().filter(ch -> ch == 'G').count();
		assertEquals(3, count);
		
		count = allLetters.chars().filter(ch -> ch == 'B').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'C').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'M').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'P').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'F').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'H').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'V').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'W').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'Y').count();
		assertEquals(2, count);
		
		count = allLetters.chars().filter(ch -> ch == 'K').count();
		assertEquals(1, count);
		
		count = allLetters.chars().filter(ch -> ch == 'J').count();
		assertEquals(1, count);
		
		count = allLetters.chars().filter(ch -> ch == 'X').count();
		assertEquals(1, count);
		
		count = allLetters.chars().filter(ch -> ch == 'Q').count();
		assertEquals(1, count);
		
		count = allLetters.chars().filter(ch -> ch == 'Z').count();
		assertEquals(1, count);
	}

}
