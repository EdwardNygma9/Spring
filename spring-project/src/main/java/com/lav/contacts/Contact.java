package com.lav.contacts;

public class Contact {

	private Long Id;
	private String name;
	private Long AddressId;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAddressId() {
		return AddressId;
	}
	public void setAddressId(Long addressId) {
		AddressId = addressId;
	}
}
