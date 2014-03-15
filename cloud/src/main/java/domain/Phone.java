package domain;

import java.io.Serializable;

/**
 * Domain Class {@link Phone}.
 * @author Mengchao Zhong
 */
public class Phone implements Serializable {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Type of current phone number.
	 * e.g. HOME/CELL/WORK
	 */
	private String phoneType;
	
	/**
	 * Phone number.
	 */
	private String phoneNumber;
	
	/**
	 * Is primary phone number?
	 */
	private Boolean primaryPhone;
	
	/**
	 * Constructor of {@link Phone}.
	 */
	public Phone() {
		super();
	}

	/**
	 * Constructor of {@link Phone}.
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
	 * Getter of phoneType.
	 * @return @{link String}
	 */
	public String getPhoneType() {
		return phoneType;
	}

	/**
	 * Setter of phoneType.
	 * @param phoneType
	 */
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	/**
	 * Getter of phoneNumber.
	 * @return @{link String}
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Setter of phoneNumber.
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Getter of primaryPhone.
	 * @return @{link Boolean}
	 */
	public Boolean getPrimaryPhone() {
		return primaryPhone;
	}

	/**
	 * Setter of primaryPhone.
	 * @param primaryPhone
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