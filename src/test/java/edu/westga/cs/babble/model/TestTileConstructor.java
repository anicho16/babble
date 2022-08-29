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
	
	@Test
	public void shouldCreateOnePointTiles() {
		this.theTile = new Tile('e');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('E');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('a');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('A');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('i');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('I');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('o');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('O');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('n');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('N');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('r');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('R');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('t');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('T');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('l');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('L');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('s');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('S');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('u');
		assertEquals(1, this.theTile.getPointValue());
		
		this.theTile = new Tile('U');
		assertEquals(1, this.theTile.getPointValue());
	}
	
	@Test
	public void shouldCreateTwoPointTiles() {
		this.theTile = new Tile('d');
		assertEquals(2, this.theTile.getPointValue());
		
		this.theTile = new Tile('D');
		assertEquals(2, this.theTile.getPointValue());
		
		this.theTile = new Tile('g');
		assertEquals(2, this.theTile.getPointValue());
		
		this.theTile = new Tile('G');
		assertEquals(2, this.theTile.getPointValue());
	}
	
	@Test
	public void shouldCreateThreePointTiles() {
		this.theTile = new Tile('b');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('B');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('c');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('C');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('m');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('M');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('p');
		assertEquals(3, this.theTile.getPointValue());
		
		this.theTile = new Tile('P');
		assertEquals(3, this.theTile.getPointValue());
	}
	
	@Test
	public void shouldCreateFourPointTiles() {
		this.theTile = new Tile('f');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('F');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('h');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('H');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('v');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('V');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('w');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('W');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('y');
		assertEquals(4, this.theTile.getPointValue());
		
		this.theTile = new Tile('Y');
		assertEquals(4, this.theTile.getPointValue());
	}
	
	@Test
	public void shouldCreateFivePointTiles() {
		this.theTile = new Tile('k');
		assertEquals(5, this.theTile.getPointValue());
		
		this.theTile = new Tile('K');
		assertEquals(5, this.theTile.getPointValue());
	}
	
	@Test
	public void shouldCreateEightPointTiles() {
		this.theTile = new Tile('j');
		assertEquals(8, this.theTile.getPointValue());
		
		this.theTile = new Tile('J');
		assertEquals(8, this.theTile.getPointValue());
		
		this.theTile = new Tile('x');
		assertEquals(8, this.theTile.getPointValue());
		
		this.theTile = new Tile('X');
		assertEquals(8, this.theTile.getPointValue());
	}
	
	@Test
	public void shouldCreateTenPointTiles() {
		this.theTile = new Tile('q');
		assertEquals(10, this.theTile.getPointValue());
		
		this.theTile = new Tile('Q');
		assertEquals(10, this.theTile.getPointValue());
		
		this.theTile = new Tile('z');
		assertEquals(10, this.theTile.getPointValue());
		
		this.theTile = new Tile('Z');
		assertEquals(10, this.theTile.getPointValue());
	}

}


