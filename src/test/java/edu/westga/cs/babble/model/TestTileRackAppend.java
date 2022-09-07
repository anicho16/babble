/**
 * 
 */

package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for Tile Rack model class Append override Method
 * @author Amber Nicholas
 * @version 9.1.22
 *
 */
class TestTileRackAppend {
	private TileRack group;
	private	Tile theTile;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.group = new TileRack();
	}

	@Test
	void shouldNotAppendToFullRack() {
		this.theTile = new Tile('A');
		Tile theTile1 = new Tile('B');
		Tile theTile2 = new Tile('C');
		Tile theTile3 = new Tile('D');
		Tile theTile4 = new Tile('E');
		Tile theTile5 = new Tile('F');
		Tile theTile6 = new Tile('G');
		Tile theTile7 = new Tile('H');
		
		this.group.append(this.theTile);
		this.group.append(theTile1);
		this.group.append(theTile2);
		this.group.append(theTile3);
		this.group.append(theTile4);
		this.group.append(theTile5);
		this.group.append(theTile6);

		Throwable exception = assertThrows(TileRackFullException.class, () -> this.group.append(theTile7));
		assertEquals("class edu.westga.cs.babble.model.TileRackFullException", "" + exception.getClass());
	}
	
}
