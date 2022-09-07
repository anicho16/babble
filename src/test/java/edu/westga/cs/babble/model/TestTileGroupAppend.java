/**
 * 
 */

package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for Tile Group model class Append Method
 * @author Amber Nicholas
 * @version 8.30.22
 *
 */
public class TestTileGroupAppend {
	private TileGroup group;
	private	Tile theTile;

	/**
	 * do before each test
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.group = new TileRack();
	}

	@Test
	public void shouldNotAllowNull() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> this.group.append(this.theTile));
		assertEquals("tile cannot be null", exception.getMessage());
	}
	
	@Test
	public void emptyGroupShouldBeEmpty() {
		assertEquals(0, this.group.tiles().size());
	}
	
	@Test
	public void shouldHaveOneTileInTileGroup() {
		this.theTile = new Tile('A');
		this.group.append(this.theTile);
		
		assertEquals(1, this.group.tiles().size());
		assertEquals('A', this.group.tiles().get(0).getLetter());
		assertEquals(true, this.group.tiles().contains(this.theTile));
	}

	@Test
	public void shouldHaveManyTilesInTileGroup() {
		this.theTile = new Tile('A');
		Tile theTile1 = new Tile('B');
		Tile theTile2 = new Tile('C');
		Tile theTile3 = new Tile('D');
		Tile theTile4 = new Tile('E');
		
		this.group.append(this.theTile);
		this.group.append(theTile1);
		this.group.append(theTile2);
		this.group.append(theTile3);
		this.group.append(theTile4);
		
		assertEquals(5, this.group.tiles().size());
		assertEquals('D', this.group.tiles().get(3).getLetter());
		assertEquals(true, this.group.tiles().contains(theTile2));
	}
	
	@Test
	public void shouldHaveManyTilesIncludingDuplicatesInTileGroup() {
		this.theTile = new Tile('A');
		Tile theTile1 = new Tile('B');
		Tile theTile2 = new Tile('A');
		Tile theTile3 = new Tile('A');
		Tile theTile4 = new Tile('E');
		
		this.group.append(this.theTile);
		this.group.append(theTile1);
		this.group.append(theTile2);
		this.group.append(theTile3);
		this.group.append(theTile4);
		
		assertEquals(5, this.group.tiles().size());
		assertEquals('A', this.group.tiles().get(3).getLetter());
	}
}
