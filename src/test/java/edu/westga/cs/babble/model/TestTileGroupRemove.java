/**
 * 
 */
package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for Tile Group model class Remove Method
 * @author Amber Nicholas
 * @version 8.30.22
 *
 */
public class TestTileGroupRemove {
	private TileGroup group;
	private	Tile theTile;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.group = new TileRack();
	}

	@Test
	public void shouldNotAllowNull() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> this.group.remove(theTile));
		assertEquals(null, exception.getMessage());
	}
	
	@Test
	public void canNotRemoveTileNotInTileGroup() {
		this.theTile = new Tile('A');
		Tile theTile1 = new Tile('B');
		Tile theTile2 = new Tile('C');
		Tile theTile3 = new Tile('D');
		Tile theTile4 = new Tile('E');
		
		this.group.append(this.theTile);
		this.group.append(theTile1);
		this.group.append(theTile2);
		this.group.append(theTile3);
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile4));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
	}
	
	@Test
	public void canRemoveOnlyTileInTileGroup() throws TileNotInGroupException {
		this.theTile = new Tile('A');
		
		this.group.append(this.theTile);
		this.group.remove(this.theTile);
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(this.theTile));
		assertEquals(0, this.group.tiles().size());
	}
	
	@Test
	public void canRemoveFirstOfManyTilesFromTileGroup() throws TileNotInGroupException {
		this.theTile = new Tile('A');
		Tile theTile1 = new Tile('B');
		Tile theTile2 = new Tile('C');
		Tile theTile3 = new Tile('D');
		Tile theTile4 = new Tile('E');
		
		this.group.append(this.theTile);
		this.group.append(theTile1);
		this.group.append(theTile2);
		this.group.append(theTile3);
		
		this.group.remove(this.theTile);

		assertEquals(false, this.group.tiles().contains(this.theTile));
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(this.theTile));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
	}
	
	@Test
	public void canRemoveLastOfManyTilesFromTileGroup() throws TileNotInGroupException {
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
		
		this.group.remove(theTile4);

		assertEquals(false, this.group.tiles().contains(theTile4));
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile4));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
	}
	
	@Test
	public void canRemoveMiddleOfManyTilesFromTileGroup() throws TileNotInGroupException {
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
		
		this.group.remove(theTile2);

		assertEquals(false, this.group.tiles().contains(theTile2));
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile2));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
	}
	
	@Test
	public void canRemoveMultipleTilesFromTileGroup() throws TileNotInGroupException {
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
		
		this.group.remove(theTile2);
		this.group.remove(theTile4);
		this.group.remove(theTile1);

		assertEquals(false, this.group.tiles().contains(theTile2));
		assertEquals(false, this.group.tiles().contains(theTile4));
		assertEquals(false, this.group.tiles().contains(theTile1));
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile2));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
		
		exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile4));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
		
		exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile1));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
	}
	
	@Test
	public void doesNotRemoveDuplicateTilesFromTileGroup() throws TileNotInGroupException {
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
		
		this.group.remove(theTile2);
		this.group.remove(theTile4);
		this.group.remove(theTile1);
		
		Throwable exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile2));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
		
		exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile4));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
		
		exception = assertThrows(TileNotInGroupException.class, () -> this.group.remove(theTile1));
		assertEquals("class edu.westga.cs.babble.model.TileNotInGroupException", "" + exception.getClass());
	}

}
