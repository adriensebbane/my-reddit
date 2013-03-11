package org.edwardonbebop.reddit;

/**
 * This class represents a Reddit Listing.
 * Listings contain <code>data</data> which are represented
 * by a <code>Data</code> class instance.
 *
 * Complete data structure is:
 * Listing => Data => Child => Thing
 */
public class Listing {

	//"kind": "Listing"
	private String kind;

	//"data": "{...<json>}"
	private Data data;

	public String getKind() {
	  return this.kind;
	}

	public void setKind(String newkind) {
		this.kind = newkind;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data newdata) {
		this.data = newdata;
	}
}