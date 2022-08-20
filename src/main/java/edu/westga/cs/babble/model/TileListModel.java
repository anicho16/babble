/**
 * 
 */
package edu.westga.cs.babble.model;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 * @author amber
 *
 */
public class TileListModel extends TileRack implements ListModel<Tile> {
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

}
