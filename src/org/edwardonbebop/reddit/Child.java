package org.edwardonbebop.reddit;

/**
 * This class represents a Reddit Child (a child of <code>Data</code>).
 * Child contains:
 * <ul>
 * <li><code>kind</code></li>
 * <li><code>data</code> an isntance of <code>Thing</code></li>
 * </ul>
 *
 * Complete data structure is:
 * Listing => Data => Child => Thing
 */
public class Child {

	//"kind": "Listing"
	private String kind;

	//"data": "{...<json>}"
	private Thing data;

	public String getKind() {
	  return this.kind;
	}

	public void setKind(String newkind) {
		this.kind = newkind;
	}

	public Thing getData() {
		return this.data;
	}

	public void setData(Thing newdata) {
		this.data = newdata;
	}
}