package domain;

import java.io.Serializable;

/**
 * Domain Class
 * {@link Address}
 * 
 * @author Mengchao Zhong
 */
public class Address implements Serializable {

	/** {@link long} serialVersionUID 
	 * Default Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** {@link String} street1 */
	private String street1;
	
	/** {@link String} street2 */
	private String street2;
	
	/** {@link String} city */
	private String city;
	
	/** {@link String} state */
	private String state;
	
	/** {@link String} postalCode */
	private String postalCode;
	
	/** {@link String} country */
	private String country;

	/**
	 * Default Constructor
	 */
	public Address() {
		super();
	}

	/**
	 * @param street1
	 * @param street2
	 * @param city
	 * @param state
	 * @param postalCode
	 * @param country
	 */
	public Address(String street1, String street2, String city, String state,
			String postalCode, String country) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	/**
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * @param street1 the street1 to set
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}