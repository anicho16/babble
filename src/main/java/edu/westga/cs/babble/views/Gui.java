/**
 * 
 */

package edu.westga.cs.babble.views;

import javax.swing.JList;

/**
 * @author Amber Nicholas
 * @version 8.17.22
 *
 */
public class Gui extends GuiWindowBuilderLayout {
	private GuiController guiControls;
	
	/**
	 * 
	 */
	public Gui() {
		this.guiControls = new GuiController();
		this.createList();
	}

	private void createList() {
		super.list = new JList();
		super.list.setBounds(39, 33, 343, 30);
		super.contentPane.add(this.list);		
	}

}
