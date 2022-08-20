/**
 * 
 */
package edu.westga.cs.babble.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import edu.westga.cs.babble.model.Tile;

/**
 * @author Amber Nicholas
 * @version 8.19.22
 *
 */
public class TileCellRenderer extends JLabel implements ListCellRenderer<Tile> {
	private Border blackBorder;
	
	/**
	 * 
	 */
	public TileCellRenderer() {
		this.blackBorder = BorderFactory.createLineBorder(Color.black);
		this.setBorder(BorderFactory.createCompoundBorder(this.blackBorder, new EmptyBorder(4, 4, 4, 4)));
		this.setOpaque(true);
        this.setFont(new Font("Verdana", Font.PLAIN, 24));
	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Tile> list, Tile value, int index, boolean isSelected,
			boolean cellHasFocus) {
		Tile item = (Tile) value;
		this.setText(String.valueOf(item.getLetter()));
        if (isSelected) {
            setBackground(Color.black);
            setForeground(Color.white);
        } else {
            setBackground(Color.white);
            setForeground(Color.black);
        }
        return this;
	}
}
