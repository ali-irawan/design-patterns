package com.aliirawan.designpatterns.singleton;

/**
 * Sample class for demonstrate a singleton
 * 
 * @author aliirawan
 *
 */
public class Document {

	private static Document instance;

	private String title;

	/**
	 * Avoid creating object outside
	 */
	private Document() {

	}

	/**
	 * Get the document instance
	 * @return
	 */
	public static Document getInstance() {
		if (instance == null) {
			instance = new Document();
		}
		return instance;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}
