package org.edwardonbebop.reddit;

/**
 * This class represents a Reddit Data.
 * Data contain:
 * <ul>
 * <li><code>modhash</code></li>
 * <li><code>children</code> an array of <code>Child</code> instances</li>
 * <li><code>after</code> a <code>String</code></li>
 * <li><code>before</code> a <code>String</code></li>
 * </ul>
 *
 * Complete data structure is:
 * Listing => Data => Child => Thing
 */
public class Data {

	private String modhash;
	private Child[] children;
	private String after;
	private String before;

	public String getModhash() {
	  return this.modhash;
	}

	public void setModhash(String newmodhash) {
		this.modhash = newmodhash;
	}

	public Child[] getChildren() {
		return this.children;
	}

	public void setChildren(Child[] newchildren) {
		this.children = newchildren;
	}

	public String getAfter() {
	  return this.after;
	}

	public void setAfter(String newafter) {
		this.after = newafter;
	}

	public String getBefore() {
	  return this.before;
	}

	public void setBefore(String newbefore) {
		this.before = newbefore;
	}
}