package domain;

import java.io.Serializable;

/**
 * Domain Class {@link Email}.
 * @author Ting Chen
 * @author Mengchao Zhong
 */
public class Email implements Serializable {
	
	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Email ID.
	 */
	private int id;

	/**
	 * Primary Email.
	 */
	private String primaryEmail;

	/**
	 * Alternative Email.
	 */
	private String alternativeEmail;
	
	/**
	 * Constructor of {@link Email}.
	 */
	public Email() {
		super();
	}

	/**
	 * Constructor of {@link Email}.
	 * @param id
	 * @param primaryEmail
	 * @param alternativeEmail
	 */
	public Email(int id, String primaryEmail, String alternativeEmail) {
		super();
		this.id = id;
		this.primaryEmail = primaryEmail;
		this.alternativeEmail = alternativeEmail;
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
	 * Getter of primaryEmail.
	 * @return @{link String}
	 */
	public String getPrimaryEmail() {
		return primaryEmail;
	}

	/**
	 * Setter of primaryEmail.
	 * @param primaryEmail
	 */
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	/**
	 * Getter of alternativeEmail.
	 * @return @{link String}
	 */
	public String getAlternativeEmail() {
		return alternativeEmail;
	}

	/**
	 * Setter of alternativeEmail.
	 * @param alternativeEmail
	 */
	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Email(" 
				+ id + "): [Primary Email - " 
				+ primaryEmail + ", Alternative Email - "
				+ alternativeEmail + "]";
	}
}