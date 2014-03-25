package domain;

import java.io.Serializable;

/**
 * Domain Class {@link Credential}.
 * @author Mengchao Zhong
 */
public class Credential implements Serializable {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * User ID.
	 */
	private int userId;
	
	/**
	 * Username.
	 */
	private String username;
	
	/**
	 * Password.
	 */
	private String password;
	
	/**
	 * Email ID.
	 */
	private int emailId;
	
	/**
	 * Security Question 1 ID.
	 */
	private int securityQuestion1Id;
	
	/**
	 * Security Question 1 Answer.
	 */
	private String securityAnswer1;
	
	/**
	 * Security Question 2 ID.
	 */
	private int securityQuestion2Id;
	
	/**
	 * Security Question 2 Answer.
	 */
	private String securityAnswer2;

	/**
	 * Constructor of {@link Credential}.
	 */
	private Credential() {
		super();
	}

	/**
	 * Constructor of {@link Credential}.
	 * @param userId
	 * @param username
	 * @param password
	 * @param emailId
	 * @param securityQuestion1Id
	 * @param securityAnswer1
	 * @param securityQuestion2Id
	 * @param securityAnswer2
	 */
	private Credential(int userId, String username, String password,
			int emailId, int securityQuestion1Id, String securityAnswer1,
			int securityQuestion2Id, String securityAnswer2) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.securityQuestion1Id = securityQuestion1Id;
		this.securityAnswer1 = securityAnswer1;
		this.securityQuestion2Id = securityQuestion2Id;
		this.securityAnswer2 = securityAnswer2;
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
	 * Getter of username.
	 * @return @{link String}
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter of username.
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Getter of password.
	 * @return @{link String}
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of password.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * Getter of securityQuestion1Id.
	 * @return @{link int}
	 */
	public int getSecurityQuestion1Id() {
		return securityQuestion1Id;
	}

	/**
	 * Setter of securityQuestion1Id.
	 * @param securityQuestion1Id
	 */
	public void setSecurityQuestion1Id(int securityQuestion1Id) {
		this.securityQuestion1Id = securityQuestion1Id;
	}

	/**
	 * Getter of securityAnswer1.
	 * @return @{link String}
	 */
	public String getSecurityAnswer1() {
		return securityAnswer1;
	}

	/**
	 * Setter of securityAnswer1.
	 * @param securityAnswer1
	 */
	public void setSecurityAnswer1(String securityAnswer1) {
		this.securityAnswer1 = securityAnswer1;
	}

	/**
	 * Getter of securityQuestion2Id.
	 * @return @{link int}
	 */
	public int getSecurityQuestion2Id() {
		return securityQuestion2Id;
	}

	/**
	 * Setter of securityQuestion2Id.
	 * @param securityQuestion2Id
	 */
	public void setSecurityQuestion2Id(int securityQuestion2Id) {
		this.securityQuestion2Id = securityQuestion2Id;
	}

	/**
	 * Getter of securityAnswer2.
	 * @return @{link String}
	 */
	public String getSecurityAnswer2() {
		return securityAnswer2;
	}

	/**
	 * Setter of securityAnswer2.
	 * @param securityAnswer2
	 */
	public void setSecurityAnswer2(String securityAnswer2) {
		this.securityAnswer2 = securityAnswer2;
	}
}