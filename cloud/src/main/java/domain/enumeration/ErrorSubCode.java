package domain.enumeration;

/**
 * Enum Class {@link ErrorSubCode}.
 * Enumberation of all error sub codes.
 * @author Mengchao Zhong
 */
public enum ErrorSubCode {

	/** ----- Enum starts ----- */
	NULL_POINTER("NULL POINTER EXCEPTION OCCURED"),
	USER_NOT_AUTHENTICATED("USER IS NOT AUTHENTICATED DUE TO INVALID USERNAME/PASSWORD");
	/** ----- Enum ends ----- */
	
	/**
	 * Error Sub Code.
	 */
	private String subCode;
	
	/**
	 * Constructor of {@link ErrorSubCode}.
	 * @param subCode
	 */
	private ErrorSubCode(final String subCode) {
		this.subCode = subCode;
	}

	/**
	 * @return {@link String}.
	 */
	public String value() {
		return subCode;
	}
}
