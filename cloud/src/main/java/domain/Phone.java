package domain;

import java.io.Serializable;

/**
 * Domain Class
 * {@link Phone}
 * 
 * @author Mengchao Zhong
 */
public class Phone implements Serializable {

	/** {@link long} serialVersionUID 
	 * Default Serial Version UID */
	private static final long serialVersionUID = 1L;
	
	/** {@link String} phoneType */
	private String phoneType;
	
	/** {@link String} phoneNumber */
	private String phoneNumber;
	
	/** {@link String} primaryPhone */
	private Boolean primaryPhone;
	
	/**
	 * Default Constructor
	 */
	public Phone() {
		super();
	}

	/**
	 * @param phoneType
	 * @param phoneNumber
	 * @param primaryPhone
	 */
	public Phone(String phoneType, String phoneNumber, Boolean primaryPhone) {
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.primaryPhone = primaryPhone;
	}

	/**
	 * @return the phoneType
	 */
	public String getPhoneType() {
		return phoneType;
	}

	/**
	 * @param phoneType the phoneType to set
	 */
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the primaryPhone
	 */
	public Boolean getPrimaryPhone() {
		return primaryPhone;
	}

	/**
	 * @param primaryPhone the primaryPhone to set
	 */
	public void setPrimaryPhone(Boolean primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Phone [" 
				+ phoneType + ": " 
				+ phoneNumber + ", primary: " 
				+ primaryPhone + "]";
	}
}