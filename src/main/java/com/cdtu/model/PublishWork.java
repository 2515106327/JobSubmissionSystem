package com.cdtu.model;

public class PublishWork {
	private String pwId;
	private Integer tscId;
	private Integer ctId;
	private Integer id;
    private String cId;
	private Boolean pwState;
	private String pwEnd;
	private String pwContent;
	private String activityImgSrc;
	private String pwName;
	private String wStringState;
	private Boolean wBooleanState;
	private String pwStringState;
	private Boolean pwBooleanState;
	private Boolean wState;
	private Integer pwScore;
	private Integer wScore;
	private Integer finishedNum;//完成作业的总人数
	
	
	

	public Integer getFinishedNum() {
		return finishedNum;
	}

	public void setFinishedNum(Integer finishedNum) {
		this.finishedNum = finishedNum;
	}

	public Boolean getwState() {
		return wState;
	}

	public void setwState(Boolean wState) {
		this.wState = wState;
	}

	public Integer getwScore() {
		return wScore;
	}

	public void setwScore(Integer wScore) {
		this.wScore = wScore;
	}

	public Integer getPwScore() {
		return pwScore;
	}

	public void setPwScore(Integer pwScore) {
		this.pwScore = pwScore;
	}

	public String getPwContent() {
		return pwContent;
	}

	public void setPwContent(String pwContent) {
		this.pwContent = pwContent;
	}

	public String getActivityImgSrc() {
		return activityImgSrc;
	}

	public void setActivityImgSrc(String activityImgSrc) {
		this.activityImgSrc = activityImgSrc;
	}

	public Boolean getPwState() {
		return pwState;
	}

	public void setPwState(Boolean pwState) {
		this.pwState = pwState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPwId() {
		return pwId;
	}

	public void setPwId(String pwId) {
		this.pwId = pwId == null ? null : pwId.trim();
	}

	public Integer getTscId() {
		return tscId;
	}

	public void setTscId(Integer tscId) {
		this.tscId = tscId;
	}

	public Integer getCtId() {
		return ctId;
	}

	public void setCtId(Integer ctId) {
		this.ctId = ctId;
	}

	public String getPwEnd() {
		return pwEnd;
	}

	public void setPwEnd(String pwEnd) {
		this.pwEnd = pwEnd;
	}

	public String getPwName() {
		return pwName;
	}

	public void setPwName(String pwName) {
		this.pwName = pwName == null ? null : pwName.trim();
	}

	public String getwStringState() {
		return wStringState;
	}

	public void setwStringState(String wStringState) {
		this.wStringState = wStringState;
	}

	public String getPwStringState() {
		return pwStringState;
	}

	public void setPwStringState(String pwStringState) {
		this.pwStringState = pwStringState;
	}

	public Boolean getwBooleanState() {
		return wBooleanState;
	}

	public void setwBooleanState(Boolean wBooleanState) {
		this.wBooleanState = wBooleanState;
	}

	public Boolean getPwBooleanState() {
		return pwBooleanState;
	}

	public void setPwBooleanState(Boolean pwBooleanState) {
		this.pwBooleanState = pwBooleanState;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}



}