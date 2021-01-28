package com.ken.wms.domain;

public class ContainerCode {

	private String containerNumber;// 箱码ID
	private String containerType;// 箱型
	private String barCode;// 射频块
	private String dcord;// 底盘码

	public String getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getDcord() {
		return dcord;
	}

	public void setDcord(String dcord) {
		this.dcord = dcord;
	}

	@Override
	public String toString() {
		return "ContainerCode [id=" + containerNumber + ", containerType=" + containerType + ", barCode=" + barCode
				+ ", dcord=" + dcord + "]";
	}

}
