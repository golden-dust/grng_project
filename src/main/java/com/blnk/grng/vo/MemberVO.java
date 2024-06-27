package com.blnk.grng.vo;

public class MemberVO {
	
	private String mid;
	private String mpw;
	private String mnickname;

	public MemberVO() {
		super();
	}
	
	public MemberVO(String mid, String mpw, String mnickname) {
		this.mid = mid;
		this.mpw = mpw;
		this.mnickname = mnickname;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getMnickname() {
		return mnickname;
	}

	public void setMnickname(String mnickname) {
		this.mnickname = mnickname;
	}

}
