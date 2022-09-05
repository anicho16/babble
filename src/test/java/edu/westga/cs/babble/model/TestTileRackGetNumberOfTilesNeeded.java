/**
 * 
 */
package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for Tile Rack model class getNumberOfTilesNeeded method
 * @author Amber Nicholas
 * @version 9.1.22
 *
 */
class TestTileRackGetNumberOfTilesNeeded {
	private TileRack group;
	private	Tile theTile;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.group = new TileRack();
		this.theTile = new Tile('A');
	}

	@Test
	void emptyTileRackShouldNeedMaxSizeNumberOfTiles() {
		assertEquals(7, this.group.getNumberOfTilesNeeded());
	}
	
	@Test
	void tileRackWithOneTileShouldNeedMaxSizeMinusOneTiles() {
		this.group.append(theTile);
		assertEquals(6, this.group.getNumberOfTilesNeeded());
	}
	
	@Test
	void tileRackWithSeveralTilesShouldNeedSomeTiles() {
		this.group.append(theTile);
		this.group.append(new Tile('b'));
		this.group.append(new Tile('c'));
		
		assertEquals(4, this.group.getNumberOfTilesNeeded());
	}
	
	@Test
	void fullRackNeedsZeroTiles() {
		this.group.append(theTile);
		this.group.append(new Tile('b'));
		this.group.append(new Tile('c'));
		this.group.append(new Tile('c'));
		this.group.append(new Tile('c'));
		this.group.append(new Tile('c'));
		this.group.append(new Tile('c'));
		
		assertEquals(0, this.group.getNumberOfTilesNeeded());
	}

}
