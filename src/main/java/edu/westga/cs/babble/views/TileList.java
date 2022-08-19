/**
 * 
 */
package edu.westga.cs.babble.views;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import edu.westga.cs.babble.model.Tile;
import edu.westga.cs.babble.model.TileRack;

/**
 * @author amber
 *
 */
public class TileList extends TileRack implements ListModel<Tile> {
	
	public TileList() {
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

}
