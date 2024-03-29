package src.com.pinkdroid.dealhunter.model;

import java.io.File;

public class Business {
	String username;
	String password;
	Address businessAddress;
	String businessPhone;
	boolean isVerified;
	String businessCategory;
	byte[] businessImage;
    String businessImageURL;

	public Business() {
		super();
	}

	public Business(String username, String password, Address businessAddress,
			String businessPhone, boolean isVerified, String businessCategory,
			byte[] businessImage) {
		super();
		this.username = username;
		this.password = password;
		this.businessAddress = businessAddress;
		this.businessPhone = businessPhone;
		this.isVerified = isVerified;
		this.businessCategory = businessCategory;
		this.businessImage = businessImage;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(Address businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public byte[] getBusinessImage() {
		return businessImage;
	}

	public void setBusinessImage(byte[] businessImage) {
		this.businessImage = businessImage;
	}

    public void setBusinessImageURL(String businessImageURL) {
        this.businessImageURL = businessImageURL;
    }

    public String getBusinessImageURL() {
        return this.businessImageURL;
    }
}