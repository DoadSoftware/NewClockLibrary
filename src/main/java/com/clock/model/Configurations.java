package com.clock.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Configurations")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configurations {
	@XmlElement(name="sport")
	private String sport;
	
	@XmlElement(name="broadcaster")
	private String broadcaster;
	
	@XmlElement(name="ipAddress")
	private String ipAddress;
	
	@XmlElement(name="portNumber")
	private int portNumber;
	
	@XmlElement(name="secondaryipAddress")
	private String secondaryipAddress;
	
	@XmlElement(name="secondaryportNumber")
	private int secondaryportNumber;
	
	@XmlElement(name="Category")
	private String Category;

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	public String getBroadcaster() {
		return broadcaster;
	}

	public void setBroadcaster(String broadcaster) {
		this.broadcaster = broadcaster;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public Configurations() {
		super();
	}

	public String getSecondaryipAddress() {
		return secondaryipAddress;
	}

	public void setSecondaryipAddress(String secondaryipAddress) {
		this.secondaryipAddress = secondaryipAddress;
	}

	public int getSecondaryportNumber() {
		return secondaryportNumber;
	}

	public void setSecondaryportNumber(int secondaryportNumber) {
		this.secondaryportNumber = secondaryportNumber;
	}

	public Configurations(String sport, String broadcaster, String ipAddress, int portNumber,String secondaryipAddress, int secondaryportNumber) {
		super();
		this.sport = sport;
		this.broadcaster = broadcaster;
		this.ipAddress = ipAddress;
		this.portNumber = portNumber;
		this.secondaryipAddress = secondaryipAddress;
		this.secondaryportNumber = secondaryportNumber;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Configurations(String sport, String broadcaster, String ipAddress, int portNumber, String secondaryipAddress,
			int secondaryportNumber, String category) {
		super();
		this.sport = sport;
		this.broadcaster = broadcaster;
		this.ipAddress = ipAddress;
		this.portNumber = portNumber;
		this.secondaryipAddress = secondaryipAddress;
		this.secondaryportNumber = secondaryportNumber;
		Category = category;
	}
	
	
}
