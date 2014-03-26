package domain;

import java.io.Serializable;

/**
 * Domain Class {@link Phone}.
 * @author Ting Chen
 * @author Mengchao Zhong
 */
public class Phone implements Serializable {
	
	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Phone ID.
	 */
	private int id;
	
	/**
	 * Phone Type.
	 */
	private String type;
 
	/**
	 * Phone Number.
	 */
	private String number;
	
	/**
	 * Constructor of {@link Phone}.
	 */
	public Phone() {
		super();
	}

	/**
	 * Constructor of {@link Phone}.
	 * @param id
	 * @param type
	 * @param number
	 */
	public Phone(int id, String type, String number) {
		super();
		this.id = id;
		this.type = type;
		this.number = number;
	}

	/**
	 * Getter of id.
	 * @return @{link int}
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter of id.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter of type.
	 * @return @{link String}
	 */
	public String getType() {
		return type;
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
		return number;
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
		return "Phone(" 
				+ id + "): [" 
				+ type + " - " 
				+ number + "]";
	}
}
