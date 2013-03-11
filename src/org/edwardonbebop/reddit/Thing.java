package org.edwardonbebop.reddit;

public class Thing {
	//"domain": "i.imgur.com",
	private String domain;

	//"banned_by": null,
	private String banned_by;

	//"kind": "t3"
	private String kind;

	//"media_embed": {},
	private MediaEmbed media_embed;

	//"subreddit": "pics",
	private String subreddit;

	//"selftext_html": null,
	private String selftext_html;

	//"selftext": "",
	private String selftext;

	//"likes": null,
	private Boolean likes;

	//"link_flair_text": null,
	private String link_flair_text;

	//"id": "15ksk7",
	private String id;

	//"clicked": false,
	private Boolean clicked;

	//"title": "If Reddit had a snowboard",
	private String title;

	//"num_comments": 34,
	private int num_comments;

	//"score": 159,
	private int score;

	//"approved_by": null,
	private String approved_by;

	//"over_18": false,
	private Boolean over_18;

	//"hidden": false,
	private Boolean hidden;

	//"thumbnail": "http://e.thumbs.redditmedia.com/s2ZE8SnomO3AIM5F.jpg",
	private String thumbnail;

	//"subreddit_id": "t5_2qh0u",
	private String subreddit_id;

	//"edited": false,
	private Boolean edited;

	//"link_flair_css_class": null,
	private String link_flair_css_class;

	//"author_flair_css_class": null,
	private String author_flair_css_class;

	//"downs": 299,
	private int downs;

	//"saved": false,
	private Boolean saved;

	//"is_self": false,
	private Boolean is_self;

	//"permalink": "/r/pics/comments/15ksk7/if_reddit_had_a_snowboard/",
	private String permalink;

	//"name": "t3_15ksk7",
	private String name;

	//"created": 1356740641.0,
	private double created;

	//"url": "http://i.imgur.com/EEMAs.jpg",
	private String url;

	//"author_flair_text": null,
	private String author_flair_text;
	

	//"author": "waithuhwhat",
	private String author;

	//"created_utc": 1356711841.0,
	private double created_utc;

	//"media": null,
	private String media;

	//"num_reports": null,
	private int num_reports;
	
	//"ups": 458
	private int ups;

	public String getDomain() {
 		return this.domain;
	}
	public void setDomain(String newdomain) {
	  this.domain = newdomain;
	}
	public String getBanned_by() {
	 return this.banned_by;
	}
	public void setBanned_by(String newbanned_by) {
	  this.banned_by = newbanned_by;
	}
	public String getKind() {
	  return this.kind;
	}
	public void setKind(String newkind) {
		this.kind = newkind;
	}
	public MediaEmbed getMedia_embed() {
		return this.media_embed;
	}
	public void setMedia_embed(MediaEmbed newmedia_embed) {
		this.media_embed = newmedia_embed;
	}
	public String getSubreddit() {
	 return this.subreddit;
	}
	public void setSubreddit(String newsubreddit) {
	  this.subreddit = newsubreddit;
	}
	public String getSelftext_html() {
	 return this.selftext_html;
	}
	public void setSelftext_html(String newselftext_html) {
	  this.selftext_html = newselftext_html;
	}
	public String getSelftext() {
	 return this.selftext;
	}
	public void setSelftext(String newselftext) {
	  this.selftext = newselftext;
	}
	public Boolean getLikes() {
	 return this.likes;
	}
	public void setLikes(Boolean newlikes) {
	  this.likes = newlikes;
	}
	public String getLink_flair_text() {
	 return this.link_flair_text;
	}
	public void setLink_flair_text(String newlink_flair_text) {
	  this.link_flair_text = newlink_flair_text;
	}
	public String getId() {
	 return this.id;
	}
	public void setId(String newid) {
	  this.id = newid;
	}
	public Boolean getClicked() {
	 return this.clicked;
	}
	public void setClicked(Boolean newclicked) {
	  this.clicked = newclicked;
	}
	public String getTitle() {
	 return this.title;
	}
	public void setTitle(String newtitle) {
	  this.title = newtitle;
	}
	public int getNum_comments() {
	 return this.num_comments;
	}
	public void setNum_comments(int newnum_comments) {
	  this.num_comments = newnum_comments;
	}
	public int getScore() {
	 return this.score;
	}
	public void setScore(int newscore) {
	  this.score = newscore;
	}
	public String getApproved_by() {
	 return this.approved_by;
	}
	public void setApproved_by(String newapproved_by) {
	  this.approved_by = newapproved_by;
	}
	public Boolean getOver_18() {
	 return this.over_18;
	}
	public void setOver_18(Boolean newover_18) {
	  this.over_18 = newover_18;
	}
	public Boolean getHidden() {
	 return this.hidden;
	}
	public void setHidden(Boolean newhidden) {
	  this.hidden = newhidden;
	}
	public String getThumbnail() {
	 return this.thumbnail;
	}
	public void setThumbnail(String newthumbnail) {
	  this.thumbnail = newthumbnail;
	}
	public String getSubreddit_id() {
	 return this.subreddit_id;
	}
	public void setSubreddit_id(String newsubreddit_id) {
	  this.subreddit_id = newsubreddit_id;
	}
	public Boolean getEdited() {
	 return this.edited;
	}
	public void setEdited(Boolean newedited) {
	  this.edited = newedited;
	}
	public String getLink_flair_css_class() {
	 return this.link_flair_css_class;
	}
	public void setLink_flair_css_class(String newlink_flair_css_class) {
	  this.link_flair_css_class = newlink_flair_css_class;
	}
	public String getAuthor_flair_css_class() {
	 return this.author_flair_css_class;
	}
	public void setAuthor_flair_css_class(String newauthor_flair_css_class) {
	  this.author_flair_css_class = newauthor_flair_css_class;
	}
	public int getDowns() {
	 return this.downs;
	}
	public void setDowns(int newdowns) {
	  this.downs = newdowns;
	}
	public Boolean getSaved() {
	 return this.saved;
	}
	public void setSaved(Boolean newsaved) {
	  this.saved = newsaved;
	}
	public Boolean getIs_self() {
	 return this.is_self;
	}
	public void setIs_self(Boolean newis_self) {
	  this.is_self = newis_self;
	}
	public String getPermalink() {
	 return this.permalink;
	}
	public void setPermalink(String newpermalink) {
	  this.permalink = newpermalink;
	}
	public String getName() {
	 return this.name;
	}
	public void setName(String newname) {
	  this.name = newname;
	}
	public double getCreated() {
	 return this.created;
	}
	public void setCreated(double newcreated) {
	  this.created = newcreated;
	}
	public String getUrl() {
	 return this.url;
	}
	public void setUrl(String newurl) {
	  this.url = newurl;
	}
	public String getAuthor_flair_text() {
	 return this.author_flair_text;
	}
	public void setAuthor_flair_text(String newauthor_flair_text) {
	  this.author_flair_text = newauthor_flair_text;
	}
	public String getAuthor() {
	 return this.author;
	}
	public void setAuthor(String newauthor) {
	  this.author = newauthor;
	}
	public double getCreated_utc() {
	 return this.created_utc;
	}
	public void setCreated_utc(double newcreated_utc) {
	  this.created_utc = newcreated_utc;
	}
	public String getMedia() {
		return this.media;
	}
	public void setMedia(String newmedia) {
		this.media = newmedia;
	}
	public int getNum_reports() {
		return this.num_reports;
	}
	public void setNum_report(int newnum_reports) {
		this.num_reports = newnum_reports;
	}
	public int getUps() {
	 return this.ups;
	}
	public void setUps(int newups) {
	  this.ups = newups;
	}
}