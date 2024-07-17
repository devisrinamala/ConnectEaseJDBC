package models;

public class marks {

	private String pinnumber;
	private int cns;
	private int bda;
	private int ml;
	private int ads;
	private int swm;
	private int ipr;
	public String getPinnumber() {
		return pinnumber;
	}
	public void setPinnumber(String pinnumber) {
		this.pinnumber = pinnumber;
	}
	public int getCns() {
		return cns;
	}
	public void setCns(int cns) {
		this.cns = cns;
	}
	public int getBda() {
		return bda;
	}
	public void setBda(int bda) {
		this.bda = bda;
	}
	public int getMl() {
		return ml;
	}
	public void setMl(int ml) {
		this.ml = ml;
	}
	public int getAds() {
		return ads;
	}
	public void setAds(int ads) {
		this.ads = ads;
	}
	public int getSwm() {
		return swm;
	}
	public void setSwm(int swm) {
		this.swm = swm;
	}
	public int getIpr() {
		return ipr;
	}
	public void setIpr(int ipr) {
		this.ipr = ipr;
	}
	public marks() {
		super();
	}
	public marks(String pinnumber, int cns, int bda, int ml, int ads, int swm, int ipr) {
		super();
		this.pinnumber = pinnumber;
		this.cns = cns;
		this.bda = bda;
		this.ml = ml;
		this.ads = ads;
		this.swm = swm;
		this.ipr = ipr;
	}
	
	
	
}
