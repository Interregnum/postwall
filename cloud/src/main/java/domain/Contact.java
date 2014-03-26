package domain;

import java.io.Serializable;

/**
 * Domain Class {@link Contact}.
 * @author Mengchao Zhong
 */
public class Contact implements Serializable {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * User ID.
	 */
	private int userId;
	
	/**
	 * Primary Phone ID.
	 */
	private int phone1Id;
	
	/**
	 * Secondary Phone ID.
	 */
	private int phone2Id;
	
	/**
	 * Tertiary Phone ID.
	 */
	private int phone3Id;
	
	/**
	 * Address ID.
	 */
	private int addressId;
	
	/**
	 * Email ID.
	 */
	private int emailId;

	/**
	 * Constructor of {@link Contact}.
	 */
	public Contact() {
		super();
	}

	/**
	 * Constructor of {@link Contact}.
	 * @param userId
	 * @param phone1Id
	 * @param phone2Id
	 * @param phone3Id
	 * @param addressId
	 * @param emailId
	 */
	public Contact(int userId, int phone1Id, int phone2Id, int phone3Id,
			int addressId, int emailId) {
		super();
		this.userId = userId;
		this.phone1Id = phone1Id;
		this.phone2Id = phone2Id;
		this.phone3Id = phone3Id;
		this.addressId = addressId;
		this.emailId = emailId;
	}

	/**
	 * Getter of userId.
	 * @return @{link int}
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Setter of userId.
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Getter of phone1Id.
	 * @return @{link int}
	 */
	public int getPhone1Id() {
		return phone1Id;
	}

	/**
	 * Setter of phone1Id.
	 * @param phone1Id
	 */
	public void setPhone1Id(int phone1Id) {
		this.phone1Id = phone1Id;
	}

	/**
	 * Getter of phone2Id.
	 * @return @{link int}
	 */
	public int getPhone2Id() {
		return phone2Id;
	}

	/**
	 * Setter of phone2Id.
	 * @param phone2Id
	 */
	public void setPhone2Id(int phone2Id) {
		this.phone2Id = phone2Id;
	}

	/**
	 * Getter of phone3Id.
	 * @return @{link int}
	 */
	public int getPhone3Id() {
		return phone3Id;
	}

	/**
	 * Setter of phone3Id.
	 * @param phone3Id
	 */
	public void setPhone3Id(int phone3Id) {
		this.phone3Id = phone3Id;
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
	 * Getter of emailId.
	 * @return @{link int}
	 */
	public int getEmailId() {
		return emailId;
	}

	/**
	 * Setter of emailId.
	 * @param emailId
	 */
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Contact: [userId = " 
				+ userId + ", phone1Id = " 
				+ phone1Id + ", phone2Id = " 
				+ phone2Id + ", phone3Id = " 
				+ phone3Id + ", addressId = " 
				+ addressId + ", emailId = " 
				+ emailId + "]";
	}
}