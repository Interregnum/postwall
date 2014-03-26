package domain;

import java.io.Serializable;

/**
 * @author TING CHEN
 *
 */
public class Email implements Serializable{
	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * primary_email
	 */
	private String primary_email;

	/**
	 * alternative_email
	 */
	private String alternative_email;
	/**
	 * Constructor of {@link Email}.
	 * @param primary_email
	 * @param alternative_email
	 */
	public Email(String primary_email, String alternative_email) {
		super();
		this.primary_email = primary_email;
		this.alternative_email = alternative_email;
	}
	/**
	 * Getter of primary_email.
	 * @return @{link String}
	 */
	public String getPrimary_email() {
		return this.primary_email;
	}
	/**
	 * Setter of primary_email.
	 * @param primary_email
	 */
	public void setPrimary_email(String primary_email) {
		this.primary_email = primary_email;
	}
	/**
	 * Getter of alternative_email.
	 * @return @{link String}
	 */
	public String getAlternative_email() {
		return this.alternative_email;
	}
	/**
	 * Setter of alternative_email.
	 * @param alternative_email
	 */
	public void setAlternative_email(String alternative_email) {
		this.alternative_email = alternative_email;
	}
}
