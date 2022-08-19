/**
 * 
 */

package edu.westga.cs.babble.views;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 * @author Amber Nicholas
 * @version 8.17.22
 *
 */
public class Gui extends GuiWindowBuilderLayout {
	private GuiController rack;
	
	/**
	 * 
	 */
	public Gui() {
		this.rack = new GuiController();
		this.rack.addTileToRack();
		this.createList();
	}

	private void createList() {
		super.list = new JList(this.rack.getRack());
		super.list.setBounds(39, 33, 343, 30);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		super.list.setCellRenderer(new TileCellRenderer());
		super.contentPane.add(this.list);		
	}

}
