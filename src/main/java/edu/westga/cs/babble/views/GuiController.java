/**
 * 
 */

package edu.westga.cs.babble.views;

import edu.westga.cs.babble.model.TileBag;
import edu.westga.cs.babble.model.TileRack;

/**
 * @author Amber Nicholas
 * @version 8.19.22
 *
 */
public class GuiController {
	
	private TileBag bagOfTiles;
	private TileRack tilesOnRack;
	
	/**
	 * Creates model objects with getters for TileBag and TileRack
	 */
	GuiController() {
		this.bagOfTiles = new TileBag();
		this.tilesOnRack = new TileRack();
	}

}
