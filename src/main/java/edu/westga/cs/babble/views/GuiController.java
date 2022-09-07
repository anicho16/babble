/**
 * 
 */

package edu.westga.cs.babble.views;

import edu.westga.cs.babble.model.EmptyTileBagException;
import edu.westga.cs.babble.model.TileBag;
import edu.westga.cs.babble.model.TileListModel;
import edu.westga.cs.babble.model.TileRack;
import edu.westga.cs.babble.model.TileRackFullException;

/**
 * Controller for the GUI class
 * 
 * @author Amber Nicholas
 * @version 8.19.22
 *
 */
public class GuiController {
	
	private TileBag bagOfTiles;
	private TileListModel tilesOnRack;
	
	/**
	 * Creates model objects with getters for TileBag and TileRack
	 */
	GuiController() {
		this.bagOfTiles = new TileBag();
		this.tilesOnRack = new TileListModel();
		this.addTileToRack();
	}
	
	/**
	 * adds tiles to tile rack until tile rack reaches max size
	 */
	public void addTileToRack() {
		while (this.tilesOnRack.getSize() < TileRack.MAX_SIZE && !this.bagOfTiles.isEmpty()) {
			try {
				this.tilesOnRack.append(this.bagOfTiles.drawTile());
			} catch (TileRackFullException trfe) {
				trfe.printStackTrace();
			} catch (EmptyTileBagException etbe) {
				etbe.printStackTrace();
			}
		}
	}
	
	/**
	 * Accessor for tiles on rack
	 * @return - tiles on rack
	 */
	public TileListModel getRack() {
		return this.tilesOnRack;
	}
	
	/**
	 * mutator for tile rack
	 * @param tilesLeftOnRack - all tiles remaining on rack after a word is played
	 */
	public void setRack(TileListModel tilesLeftOnRack) {
		this.tilesOnRack = tilesLeftOnRack;
	}
	
	/**
	 * accessor for bag of tiles to refill rack with
	 * @return - bag of tiles 
	 */
	public TileBag getTileBag() {
		return this.bagOfTiles;
	}

}
