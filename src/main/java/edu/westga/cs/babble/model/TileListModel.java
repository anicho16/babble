/**
 * 
 */

package edu.westga.cs.babble.model;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 * Tracks size and tiles on TileRack
 * 
 * @author Amber Nicholas
 * @version 8.17.22
 *
 */
public class TileListModel extends TileRack implements ListModel<Tile> {
	
	/**
	 * Constructor for TileListModel
	 */
	public TileListModel() {
	}

	@Override
	public int getSize() {
		return this.tiles().size();
	}

	@Override
	public Tile getElementAt(int index) {
		return this.tiles().get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
	}

}
