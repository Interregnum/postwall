package domain;

import java.io.Serializable;

/**
 * @author TING CHEN
 *
 */
public class Phone implements Serializable{
	
	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * type
	 */
	private String type;
 
	/**
	 * number
	 */
	private String number;

	/**
	 * Constructor of {@link Phone}.
	 * @param type
	 * @param number
	 */
	public Phone(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}

	/**
	 * Getter of type.
	 * @return @{link String}
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Setter of type.
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter of number.
	 * @return @{link String}
	 */
	public String getNumber() {
		return this.number;
	}

	/**
	 * Setter of number.
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Phone [" 
				+ phoneType + ": " 
				+ phoneNumber + "]";
	}
	
}
