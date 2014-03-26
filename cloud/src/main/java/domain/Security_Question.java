/**
 * 
 */
package domain;

import java.io.Serializable;

/**
 * @author TING CHEN
 *
 */
public class Security_Question {
	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * question
	 */
	private String question;
	/**
	 * Constructor of {@link Security_Question}.
	 * @param question
	 */
	public Security_Question(String question) {
		super();
		this.question = question;
	}
	/**
	 * Getter of question.
	 * @return @{link String}
	 */
	public String getQuestion() {
		return this.question;
	}
	/**
	 * Setter of question.
	 * @param question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
