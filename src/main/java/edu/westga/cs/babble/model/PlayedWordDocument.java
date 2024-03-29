/**
 * 
 */

package edu.westga.cs.babble.model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import edu.westga.cs.babble.controllers.WordDictionary;

/**
 * Document Object for PlayedWord
 * 
 * @author Amber Nicholas
 * @version 8.17.22
 *
 */
public class PlayedWordDocument extends PlainDocument {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int max;

	/**
	 * Defines max length of word
	 * @param maxLength - maximum length of word
	 */
	public PlayedWordDocument(int maxLength) {
		this.max = maxLength;
	}

	/**
	 * Standard method for class
	 * @param offset
	 * @param str
	 * @param at
	 */
	public void insertString(int offset, String str, AttributeSet at) throws BadLocationException {
		if (getLength() + str.length() > this.max) {
			java.awt.Toolkit.getDefaultToolkit().beep();
		} else {
			super.insertString(offset, str, at);
		}
	}

}
