package edu.westga.cs.babble.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a group of tiles which can be appended or removed
 * @author lewisb
 * @version CS6241
 */
public abstract class TileGroup {

	private List<Tile> tiles;

	/**
	 * creates a new empty word
	 * 
	 */
	public TileGroup() {
		this.tiles = new ArrayList<Tile>();
	}

	/**
	 * Accessor for tiles so children can manipulate them.
	 * 
	 * @return the tiles
	 */
	protected List<Tile> tiles() {
		return this.tiles;
	}

	/**
	 * Appends a tile to the end this word
	 * 
	 * @param tile the Tile to append
	 */
	public void append(Tile tile) {
		if (tile == null) {
			throw new IllegalArgumentException("tile cannot be null");
		}

		if (this.tiles.contains(tile)) {
			throw new IllegalArgumentException("can not add same tile twice");
		}

		this.tiles.add(tile);
	}

	/**
	 * Allows child classes to remove tiles.
	 * 
	 * @param tile the tile to remove
	 * @throws TileNotInGroupException if the tile is not in the group
	 */
	public void remove(Tile tile) throws TileNotInGroupException {
		if (tile == null) {
			throw new IllegalArgumentException();
		}

		if (!this.tiles.contains(tile)) {
			throw new TileNotInGroupException();
		}

		this.tiles.remove(tile);
	}

	/**
	 * Stringifies the contents of the rack as the tile characters, in order of
	 * containment.
	 * @return space - all the tiles in string form
	 */
	public String getHand() {
		String space = "";
		for (Tile theTile : this.tiles) {
			space += theTile.getLetter();
		}
		return space;
	}
}
