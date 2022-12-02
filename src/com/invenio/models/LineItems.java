package com.invenio.models;

import java.util.ArrayList;
import java.util.List;

public class LineItems {
	
	String recordType;
	int lineNumber;
	String refDocNum;
	String city;
	float amount;
	public LineItems(String recordType, int lineNumber, String refDocNum, String city, float amount) {
		super();
		this.recordType = recordType;
		this.lineNumber = lineNumber;
		this.refDocNum = refDocNum;
		this.city = city;
		this.amount = amount;
	}
	public LineItems() {
		super();
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getRefDocNum() {
		return refDocNum;
	}
	public void setRefDocNum(String refDocNum) {
		this.refDocNum = refDocNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "LineItems [recordType=" + recordType + ", lineNumber=" + lineNumber + ", refDocNum=" + refDocNum
				+ ", city=" + city + ", amount=" + amount + "]";
	}

	
	 
	
	

}
