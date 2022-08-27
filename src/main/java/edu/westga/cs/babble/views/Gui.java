/**
 * 
 */

package edu.westga.cs.babble.views;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

import edu.westga.cs.babble.controllers.WordDictionary;
import edu.westga.cs.babble.model.Tile;
import edu.westga.cs.babble.model.TileBag;
import edu.westga.cs.babble.model.TileListModel;
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
	private GuiController models;
	private TileListModel rack;
	private TileBag bagOfTiles;
	private String selectedLetters;
	private int score;
	private WordDictionary wordChecker;

	/**
	 * Constructor for the GUI class
	 */
	public Gui() {
		this.models = new GuiController();
		this.rack = this.models.getRack();
		this.bagOfTiles = this.models.getTileBag();
		this.selectedLetters = "";
		this.score = 0;
		this.wordChecker = new WordDictionary();
		this.createList();
		super.btnNewButton_1.addActionListener(new PlayWordListener());
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
		super.list.setModel(Gui.this.rack);
		super.contentPane.add(Gui.this.list);
		super.textField.setText(Gui.this.selectedLetters);
		super.contentPane.add(Gui.super.textField);
		super.revalidate();
		super.repaint();
	}
	
	/*
	 * Defines listener for the Play Word button
	 */
	private class PlayWordListener extends Frame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean isValidWord = Gui.this.wordChecker.isValidWord(Gui.this.selectedLetters);
			int wordScore = 0;
			if (isValidWord) {
		        for (int counter = 0; counter < Gui.this.selectedLetters.length(); counter++) {
		            Tile pointTile = new Tile(Gui.this.selectedLetters.charAt(counter));
		            Gui.this.score += pointTile.getPointValue();
		            wordScore += pointTile.getPointValue();
		        }
		        Gui.super.textField_1.setText("" + Gui.this.score);
		        Gui.super.textField_2.setText("Played " + Gui.this.selectedLetters + " for " + wordScore + " points");
		        Gui.this.models.setRack(Gui.this.rack);
		        Gui.this.models.addTileToRack();
		        Gui.this.selectedLetters = "";
		        Gui.this.rack = Gui.this.models.getRack();
		        Gui.this.redrawRack();
			} else {
				Gui.super.textField_2.setText("Not a valid word: " + Gui.this.selectedLetters + ". Press Reset to try again.");
			}
		}
		
	}

	/*
	 * Defines the listener for mouse click on tiles.
	 */
	private class ListMouseListener extends Frame implements MouseListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		/**
		 * 
		 */
		public void mouseClicked(MouseEvent event) {
			try {
				if (Gui.this.rack.getSize() > 0) {
					Tile selectedTile = (Tile) Gui.super.list.getSelectedValue();
					Gui.this.selectedLetters += selectedTile.getLetter();
					Gui.this.rack.remove(selectedTile);
					Gui.this.redrawRack();
				}
			} catch (TileNotInGroupException tnige) {
				tnige.printStackTrace();
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
