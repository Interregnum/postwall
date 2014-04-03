package domain;

import java.io.Serializable;

/**
 * Domain Class {@link SecurityQuestion}.
 * @author Ting Chen
 * @author Mengchao Zhong
 */
public class SecurityQuestion implements Serializable {
	
	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Security Question ID.
	 */
	private int id;
	
	/**
	 * Security Question.
	 */
	private String question;
	
	/**
	 * Constructor of {@link SecurityQuestion}.
	 */
	public SecurityQuestion() {
		super();
	}

	/**
	 * Constructor of {@link SecurityQuestion}.
	 * @param id
	 * @param question
	 */
	public SecurityQuestion(int id, String question) {
		super();
		this.id = id;
		this.question = question;
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
	 * Getter of question.
	 * @return @{link String}
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Setter of question.
	 * @param question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Security Question(" 
				+ id + "): ["
				+ question + "]";
	}
}