/**
 * 
 */

package edu.westga.cs.babble.views;

import java.util.List;

import edu.westga.cs.babble.model.EmptyTileBagException;
import edu.westga.cs.babble.model.Tile;
import edu.westga.cs.babble.model.TileBag;
import edu.westga.cs.babble.model.TileListModel;
import edu.westga.cs.babble.model.TileRack;
import edu.westga.cs.babble.model.TileRackFullException;

/**
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
	}
	
	public void addTileToRack() {
		while (this.tilesOnRack.getSize() < TileRack.MAX_SIZE && !this.bagOfTiles.isEmpty()) {
			try {
				this.tilesOnRack.append(this.bagOfTiles.drawTile());
			} catch (TileRackFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EmptyTileBagException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public TileListModel getRack() {
		return this.tilesOnRack;
	}

}
