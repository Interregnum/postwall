package domain;

import java.io.Serializable;

/**
 * Domain Class {@link Address}.
 * @author Mengchao Zhong
 */
public class Address implements Serializable {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Address ID.
	 */
	private int addressId;
	
	/**
	 * Address Alias.
	 */
	private String alias;
	
	/**
	 * Street Line 1.
	 */
	private String street1;
	
	/**
	 * Street Line 2.
	 */
	private String street2;
	
	/**
	 * City.
	 */
	private String city;
	
	/**
	 * State/Province.
	 */
	private String state;
	
	/**
	 * Postal Code.
	 */
	private String postalCode;
	
	/**
	 * Country.
	 */
	private String country;

	/**
	 * Constructor of {@link Address}.
	 */
	public Address() {
		super();
	}

	/**
	 * Constructor of {@link Address}.
	 * @param addressId
	 * @param alias
	 * @param street1
	 * @param street2
	 * @param city
	 * @param state
	 * @param postalCode
	 * @param country
	 */
	public Address(int addressId, String alias, String street1,
			String street2, String city, String state, String postalCode,
			String country) {
		super();
		this.addressId = addressId;
		this.alias = alias;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	/**
	 * Getter of addressId.
	 * @return @{link int}
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * Setter of addressId.
	 * @param addressId
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * Getter of alias.
	 * @return @{link String}
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Setter of alias.
	 * @param alias
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Getter of street1.
	 * @return @{link String}
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * Setter of street1.
	 * @param street1
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	/**
	 * Getter of street2.
	 * @return @{link String}
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * Setter of street2.
	 * @param street2
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * Getter of city.
	 * @return @{link String}
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter of city.
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter of state.
	 * @return @{link String}
	 */
	public String getState() {
		return state;
	}

	/**
	 * Setter of state.
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Getter of postalCode.
	 * @return @{link String}
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Setter of postalCode.
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Getter of country.
	 * @return @{link String}
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Setter of country.
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Address(" 
				+ addressId + ") - " 
				+ alias + ": [" 
				+ street1 + ", " 
				+ street2 + ", " 
				+ city + ", " 
				+ state + "-"
				+ postalCode + ", " 
				+ country + "]";
	}
}