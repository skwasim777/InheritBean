package com.inherit;

public class Address {
	private String address, city, state, country;

	public Address(String address, String city, String state, String country) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
