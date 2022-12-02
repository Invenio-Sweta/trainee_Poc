package com.invenio.models;

import java.util.Date;

public class Header {
	
	String recordType;
	int totalLines;
	float totalAmt;
	int minAmt;
	Date currentDate;
	public Header(String recordType, int totalLines, float totalAmt, int minAmt, Date currentDate) {
		super();
		this.recordType = recordType;
		this.totalLines = totalLines;
		this.totalAmt = totalAmt;
		this.minAmt = minAmt;
		this.currentDate = currentDate;
	}
	public Header() {
		super();
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public int getTotalLines() {
		return totalLines;
	}
	public void setTotalLines(int totalLines) {
		this.totalLines = totalLines;
	}
	public float getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(int minAmt) {
		this.minAmt = minAmt;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	@Override
	public String toString() {
		return "Header [recordType=" + recordType + ", totalLines=" + totalLines + ", totalAmt=" + totalAmt
				+ ", minAmt=" + minAmt + ", currentDate=" + currentDate + "]";
	}

	
} 








