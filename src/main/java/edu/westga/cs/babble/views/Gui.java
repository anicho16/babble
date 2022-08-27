/**
 * 
 */

package edu.westga.cs.babble.views;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

import edu.westga.cs.babble.model.Tile;
import edu.westga.cs.babble.model.TileBag;
import edu.westga.cs.babble.model.TileListModel;
import edu.westga.cs.babble.model.TileNotInGroupException;
import edu.westga.cs.babble.model.TileRackFullException;

/**
 * Defines the GUI for the babble application
 * 
 * @author Amber Nicholas
 * @version 8.17.22
 *
 */
public class Gui extends GuiWindowBuilderLayout {

	private static final long serialVersionUID = 1L;
	private GuiController models;
	private TileListModel rack;
	private TileBag bagOfTiles;
	private int tilesLeftOnRack;
	private String selectedLetters;

	/**
	 * Constructor for the GUI class
	 */
	public Gui() {
		this.models = new GuiController();
		this.rack = this.models.getRack();
		this.bagOfTiles = this.models.getTileBag();
		this.tilesLeftOnRack = this.rack.getSize();
		this.selectedLetters = "";
		this.createList();
	}

	private void createList() {
		super.list = new JList<Tile>(this.rack);
		super.list.setBounds(30, 54, 535, 56);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		super.list.setCellRenderer(new TileCellRenderer());

		list.addMouseListener(new ListMouseListener());
		super.contentPane.add(this.list);
	}

	private void redrawRack() {
		while (this.rack.getSize() < this.tilesLeftOnRack && !this.bagOfTiles.isEmpty()) {
			try {
				this.tilesLeftOnRack--;
			} catch (TileRackFullException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * Defines the listener for computer player first button.
	 */
	private class ListMouseListener extends Frame implements MouseListener {
		@Override
		/**
		 * 
		 */
		public void mouseClicked(MouseEvent event) {
			int selectedIndex = Gui.super.list.getSelectedIndex();
			try {
				if (Gui.this.rack.getSize() > 0) {
					Tile selectedTile = (Tile) Gui.super.list.getSelectedValue();
					Gui.this.selectedLetters += selectedTile.getLetter();
					Gui.this.rack.remove(selectedTile);
					Gui.super.list.setModel(Gui.this.rack);
					Gui.super.contentPane.add(Gui.this.list);
					Gui.super.textField.setText(Gui.this.selectedLetters);
					Gui.super.contentPane.add(Gui.super.textField);
				}
			} catch (TileNotInGroupException e) {
				e.printStackTrace();
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
	}

}
