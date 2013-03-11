package org.edwardonbebop.reddit;

/**
 * Empty class (for now).
 */
public class MediaEmbed {
	//"content": "&lt;iframe width=\"600\" height=\"338\" src=\"http://www.youtube.com/embed/OWfxza-gyJ4?feature=oembed\" frameborder=\"0\" allowfullscreen&gt;&lt;/iframe&gt;", 
	private String content;

	// "width": 600,
	private int width;

	//"scrolling": false,
	private Boolean scrolling;

	//"height": 338},
	private int height;

	public String getContent() {
		return this.content;
	}

	public void setContent(String newcontent) {
		this.content = newcontent;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int newwidth) {
		this.width = newwidth;
	}

	public Boolean getScrolling() {
		return this.scrolling;
	}

	public void setScrolling(Boolean newscrolling) {
		this.scrolling = newscrolling;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int newheight) {
		this.height = newheight;
	}
}