package com.sybinal.shop.common;

import java.io.Serializable;

public class PageInformation implements Serializable {

	/**
	 * 
	 */
	private String sEcho;    //当前页1

	private String iDisplayStart;  //（本页起始数）0

	private String iDisplayLength;  //（显示记录数）10

	private static final long serialVersionUID = 1L;

	private int startRow;

	private int rowCount;

	private int totalCount;

	public void setStartRow(int startRow) {
		if (startRow < 0) {
			startRow = 0;
		}
		this.startRow = startRow;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		int end = Math.min(startRow + rowCount, totalCount);
		if (end < 0) {
			end = totalCount;
		}
		return end;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public String getiDisplayStart() {
		return iDisplayStart;
	}

	public void setiDisplayStart(String iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}

	public String getiDisplayLength() {
		return iDisplayLength;
	}

	public void setiDisplayLength(String iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
