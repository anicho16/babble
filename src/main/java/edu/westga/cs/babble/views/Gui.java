/**
 * 
 */

package edu.westga.cs.babble.views;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

import edu.westga.cs.babble.model.Tile;
import edu.westga.cs.babble.model.TileNotInGroupException;

/**
 * Defines the GUI for the babble application
 * 
 * @author Amber Nicholas
 * @version 8.17.22
 *
 */
public class Gui extends GuiWindowBuilderLayout {

	private static final long serialVersionUID = 1L;
	private static GuiController rack;
	private static String selectedLetters;

	/**
	 * Constructor for the GUI class
	 */
	public Gui() {
		this.selectedLetters = "";
		this.rack = new GuiController();
		this.rack.addTileToRack();
		this.createList();
	}

	private void createList() {
		super.list = new JList(this.rack.getRack());
		super.list.setBounds(30, 54, 535, 56);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		super.list.setCellRenderer(new TileCellRenderer());

		list.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				int selectedIndex = list.getSelectedIndex();
				Tile selectedTile = Gui.rack.getRack().getElementAt(selectedIndex);
				//Gui.selectedLetters += selectedTile.getLetter();
				if (selectedIndex != -1) {
					try {
						Gui.rack.getRack().remove(selectedTile);
					} catch (TileNotInGroupException e1) {
						e1.printStackTrace();
					}
				}
			}

			@Override
			public void mousePressed(MouseEvent event) {
			}

			@Override
			public void mouseReleased(MouseEvent event) {
			}

			@Override
			public void mouseEntered(MouseEvent event) {
			}

			@Override
			public void mouseExited(MouseEvent event) {
			}

		});
		super.contentPane.add(this.list);
	}

}
