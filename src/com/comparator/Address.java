package com.comparator;

public class Address implements Comparable<Address> {
	
	private String streetname;
	private int pincode;
	
	
	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", pincode=" + pincode + "]";
	}
	public Address(String streetname, int pincode) {
		super();
		this.streetname = streetname;
		this.pincode = pincode;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public int compareTo(Address o) {
		
		if(pincode==o.pincode) {
		
		return 0;}
		
		else if(pincode>o.pincode) {
			
			return 1;}
		else { return -1;}
	}
	

}
